package model;

import java.time.LocalDateTime;

public class Sale {
	private Integer idSale;
	private LocalDateTime dateSale;
	private String statusSale;
	private Integer amountSale;
	private Client idClient;
	private User idUser;
	private PaymentMethod idPayment;
	private Product idProduct;

	// Getters and Setters
	public Integer getIdSale() {
		return idSale;
	}

	public void setIdSale(Integer idSale) {
		this.idSale = idSale;
	}

	public LocalDateTime getDateSale() {
		return dateSale;
	}

	public void setDateSale(LocalDateTime dateSale) {
		this.dateSale = dateSale;
	}

	public String getStatusSale() {
		return statusSale;
	}

	public void setStatusSale(String statusSale) {
		this.statusSale = statusSale;
	}

	public Integer getAmountSale() {
		return amountSale;
	}

	public void setAmountSale(Integer amountSale) {
		this.amountSale = amountSale;
	}

	public Client getIdClient() {
		return idClient;
	}

	public void setIdClient(Client idClient) {
		this.idClient = idClient;
	}

	public User getIdUser() {
		return idUser;
	}

	public void setIdUser(User idUser) {
		this.idUser = idUser;
	}

	public PaymentMethod getIdPayment() {
		return idPayment;
	}

	public void setIdPayment(PaymentMethod idPayment) {
		this.idPayment = idPayment;
	}

	public Product getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Product idProduct) {
		this.idProduct = idProduct;
	}

}
