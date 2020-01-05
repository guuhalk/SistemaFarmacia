package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUser", nullable = false)
	private Integer idUser;
	
	@Column(name = "loginUser")
	private String loginUser;
	
	@Column(name = "nameUser")
	private String nameUser;
	
	@Column(name = "passwordUser")
	private String passwordUser;
	
	@JoinColumn(name = "profileUser")
	@OneToOne
	private Profile profileUser;
	
	@Column(name = "statusUser")
	private Integer statusUser;

	// Getters and Setters
	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public String getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getPasswordUser() {
		return passwordUser;
	}

	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}

	public Profile getProfileUser() {
		return profileUser;
	}

	public void setProfileUser(Profile profileUser) {
		this.profileUser = profileUser;
	}

	public Integer getStatusUser() {
		return statusUser;
	}

	public void setStatusUser(Integer statusUser) {
		this.statusUser = statusUser;
	}
}
