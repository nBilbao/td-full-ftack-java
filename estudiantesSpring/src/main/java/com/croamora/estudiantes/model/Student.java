package com.croamora.estudiantes.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

/**
 * The Class Student.
 */
@Entity
@Table(name="student")
public class Student {

	 /** The id student. */
 	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long idStudent;
	 
	 /** The first name. */
 	private String firstName;
	 
	 /** The last name. */
 	private String lastName;
	 	
	 /** The age. */
 	private Integer age;
 	
 	@OneToOne(mappedBy="student", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private ContactInfo contactInfo;
 	
 	@JoinColumn(name = "id_dormitory")
	@ManyToOne
 	private Dormitory dormitory;
	 
	 /** The created at. */
 	@Column(updatable=false)
	 private Date createdAt;
	 
	 /** The updated at. */
 	private Date updatedAt;
 
	 /**
 	 * Instantiates a new student.
 	 */
 	public Student() {
		 
	 }

	/**
	 * @return the idStudent
	 */
	public Long getIdStudent() {
		return idStudent;
	}

	/**
	 * @param idStudent the idStudent to set
	 */
	public void setIdStudent(Long idStudent) {
		this.idStudent = idStudent;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
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
     
	
	/**
	 * @return the dormitory
	 */
	public Dormitory getDormitory() {
		return dormitory;
	}

	/**
	 * @param dormitory the dormitory to set
	 */
	public void setDormitory(Dormitory dormitory) {
		this.dormitory = dormitory;
	}

	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }

	/**
	 * @return the contactInfo
	 */
	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	/**
	 * @param contactInfo the contactInfo to set
	 */
	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}
 }

