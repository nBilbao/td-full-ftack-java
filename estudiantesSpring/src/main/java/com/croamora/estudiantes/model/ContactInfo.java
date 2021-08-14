package com.croamora.estudiantes.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="contact_info")
public class ContactInfo {

 	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idContactInfo;
 	 
 	@OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_student")
 	private Student student; 
	 
 	private String address;
	 
	 /** The last name. */
 	private String city;
	 	
	 /** The age. */
 	private String state;
	 
	 /** The created at. */
 	@Column(updatable=false)
	 private Date createdAt;
	 
	 /** The updated at. */
 	private Date updatedAt;
 
	 /**
 	 * Instantiates a new student.
 	 */
 	public ContactInfo() {
		 
	 }

	/**
	 * @return the idContactInfo
	 */
	public Long getIdContactInfo() {
		return idContactInfo;
	}

	/**
	 * @param idContactInfo the idContactInfo to set
	 */
	public void setIdContactInfo(Long idContactInfo) {
		this.idContactInfo = idContactInfo;
	}

	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}

	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the createdAt
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * @return the updatedAt
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * @param updatedAt the updatedAt to set
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
     
 }

