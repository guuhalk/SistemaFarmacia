CREATE SCHEMA `medfarma_db` DEFAULT CHARACTER SET utf8 ;

CREATE TABLE `medfarma_db`.`users` (
  `idUser` INT NOT NULL AUTO_INCREMENT,
  `loginUser` VARCHAR(45) NULL,
  `nameUser` VARCHAR(45) NULL,
  `passwordUser` VARCHAR(45) NULL,
  `profileUser` INT NOT NULL DEFAULT 1,
  `statusUser` INT NULL,
  PRIMARY KEY (`idUsers`));

CREATE TABLE `medfarma_db`.`clients` (
  `idClient` INT NOT NULL AUTO_INCREMENT,
  `nameClient` VARCHAR(45) NULL,
  `addressClient` VARCHAR(100) NULL,
  `cpfClient` VARCHAR(45) NULL,
  `statusClient` INT NULL,
  `emailClient` VARCHAR(90) NULL,
  `numberClient` VARCHAR(90) NULL,
  PRIMARY KEY (`idClient`));

CREATE TABLE `medfarma_db`.`profiles` (
  `idProfile` INT NOT NULL AUTO_INCREMENT,
  `descriptionProfile` VARCHAR(100) NULL,
  `statusProfile` INT NULL,
  PRIMARY KEY (`idProfile`));

CREATE TABLE `medfarma_db`.`categories` (
  `idCategory` INT NOT NULL,
  `descriptionCategory` VARCHAR(100) NULL,
  PRIMARY KEY (`idCategory`));

CREATE TABLE `medfarma_db`.`products` (
  `idProduct` INT NOT NULL AUTO_INCREMENT,
  `nameProduct` VARCHAR(100) NULL,
  `idCategory` INT NULL,
  `amountProduct` INT NULL,
  `priceProduct` DOUBLE NULL,
  `statusProduct` INT NULL,
  PRIMARY KEY (`idProduct`),
  CONSTRAINT `idProduct_Category`
    FOREIGN KEY (`idCategory`)
    REFERENCES `medfarma_db`.`categories` (`idCategory`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    
    CREATE TABLE `medfarma_db`.`paymentmethods` (
  `idPM` INT NOT NULL AUTO_INCREMENT,
  `descpriptionPM` VARCHAR(45) NULL,
  PRIMARY KEY (`idPM`));

CREATE TABLE `medfarma_db`.`sales` (
  `idSale` INT NOT NULL,
  `dateSale` DATETIME NULL,
  `statusSale` VARCHAR(1) NOT NULL DEFAULT 'P',
  `amountSale` INT NULL,
  `idClient` INT NULL,
  `idUser` INT NULL,
  `idPayment` INT NULL,
  `idProduct` INT NULL,
  PRIMARY KEY (`idSale`),
  CONSTRAINT `idSale_Client`
    FOREIGN KEY (`idClient`)
    REFERENCES `medfarma_db`.`clients` (`idClient`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `idSale_User`
    FOREIGN KEY (`idUser`)
    REFERENCES `medfarma_db`.`users` (`idUser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `idSale_Payment`
    FOREIGN KEY (`idPayment`)
    REFERENCES `medfarma_db`.`paymentmethods` (`idPM`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `idSale_Product`
    FOREIGN KEY (`idProduct`)
    REFERENCES `medfarma_db`.`products` (`idProduct`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
