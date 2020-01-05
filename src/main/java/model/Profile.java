package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "profiles")
public class Profile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idProfile", nullable = false)
	private Integer idProfile;
	
	@Column(name = "descriptionProfile")
	private String descriptionProfile;
	
	@Column(name = "statusProfile")
	private Integer statusProfile;

	// Getters and Setters
	public Integer getIdProfile() {
		return idProfile;
	}

	public void setIdProfile(Integer idProfile) {
		this.idProfile = idProfile;
	}

	public String getDescriptionProfile() {
		return descriptionProfile;
	}

	public void setDescriptionProfile(String descriptionProfile) {
		this.descriptionProfile = descriptionProfile;
	}

	public Integer getStatusProfile() {
		return statusProfile;
	}

	public void setStatusProfile(Integer statusProfile) {
		this.statusProfile = statusProfile;
	}

}
