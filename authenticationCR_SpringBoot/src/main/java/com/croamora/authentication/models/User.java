package com.croamora.authentication.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * The Class User.
 */
@Entity
@Table(name="users")
public class User {
	
	 /** The id. */
 	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	 
	 /** The email. */
 	private String email;
	 
 	/** The password. */
 	private String password;
	 
	 /** The password confirmation. */
 	@Transient
	private String passwordConfirmation;
	 
	 /** The created at. */
 	@Column(updatable=false)
	 private Date createdAt;
 
	 /** The updated at. */
 	private Date updatedAt;
	 
 
	 /**
 	 * Instantiates a new user.
 	 */
 	public User() {
	 }
 
 
 /**
  * Gets the id.
  *
  * @return the id
  */
	public Long getId() {
		return id;
	}


	/**
	 * Sets the id.
	 *
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}


	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * Sets the email.
	 *
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * Sets the password.
	 *
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * Gets the password confirmation.
	 *
	 * @return the passwordConfirmation
	 */
	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}


	/**
	 * Sets the password confirmation.
	 *
	 * @param passwordConfirmation the passwordConfirmation to set
	 */
	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
	}


	/**
	 * Gets the created at.
	 *
	 * @return the createdAt
	 */
	public Date getCreatedAt() {
		return createdAt;
	}


	/**
	 * Sets the created at.
	 *
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	/**
	 * Gets the updated at.
	 *
	 * @return the updatedAt
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}


	/**
	 * Sets the updated at.
	 *
	 * @param updatedAt the updatedAt to set
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}


/**
 * On create.
 */
@PrePersist
 protected void onCreate(){
     this.createdAt = new Date();
 }
 
 /**
  * On update.
  */
 @PreUpdate
 protected void onUpdate(){
     this.updatedAt = new Date();
 }
}