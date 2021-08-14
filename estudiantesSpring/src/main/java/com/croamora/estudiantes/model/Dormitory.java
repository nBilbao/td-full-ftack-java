package com.croamora.estudiantes.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

/**
 * The Class Student.
 */
@Entity
@Table(name="dormitory")
public class Dormitory {

	 /** The id student. */
 	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long idDormitory;
	 
	 /** The first name. */
 	 private String name;
	 
 	 /** The students. */
 	 @OneToMany(mappedBy = "dormitory")
 	 private List<Student> students;
	 
	 /** The created at. */
 	 @Column(updatable=false)
	 private Date createdAt;
	 
	 /** The updated at. */
 	 private Date updatedAt;
 
	 /**
 	 * Instantiates a new student.
 	 */
 	 public Dormitory() {
		 
	 }

	
	
	/**
	 * @return the idDormitory
	 */
	public Long getIdDormitory() {
		return idDormitory;
	}



	/**
	 * @return the students
	 */
	public List<Student> getStudents() {
		return students;
	}



	/**
	 * @param students the students to set
	 */
	public void setStudents(List<Student> students) {
		this.students = students;
	}



	/**
	 * @param idDormitory the idDormitory to set
	 */
	public void setIdDormitory(Long idDormitory) {
		this.idDormitory = idDormitory;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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

