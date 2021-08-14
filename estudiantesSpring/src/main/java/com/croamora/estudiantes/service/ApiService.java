/**
 * 
 */
package com.croamora.estudiantes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.croamora.estudiantes.model.ContactInfo;
import com.croamora.estudiantes.model.Dormitory;
import com.croamora.estudiantes.model.Student;
import com.croamora.estudiantes.repository.ContactInfoRepository;
import com.croamora.estudiantes.repository.DormitoryRepository;
import com.croamora.estudiantes.repository.StudentRepository;

/**
 * The Class ApiService.
 *
 * @author croamora
 */
@Service
public class ApiService {


	/** The contact info repository. */
	@Autowired
	ContactInfoRepository contactInfoRepository;
	
	/** The student repository. */
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	DormitoryRepository dormitoryRepository;

	/**
	 * Gets the all student.
	 *
	 * @return the all student
	 */
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	/**
	 * Crete student.
	 *
	 * @param student the student
	 */
	public void creteStudent(Student student) {
		studentRepository.save(student);
	}

	/**
	 * Gets the student by id.
	 *
	 * @param idStudent the id student
	 * @return the student by id
	 */
	public Student getStudentById(Long idStudent) {
		return studentRepository.findById(idStudent).orElse(null);
	}

	/**
	 * Creates the contact info.
	 *
	 * @param contactInfo the contact info
	 */
	public void createContactInfo(ContactInfo contactInfo) {
		contactInfoRepository.save(contactInfo);
	}

	/**
	 * Creates the dorms.
	 *
	 * @param dormitory the dormitory
	 */
	public void createDorms(Dormitory dormitory) {
		dormitoryRepository.save(dormitory);
	}

	/**
	 * Gets the dormitory by id.
	 *
	 * @param idDorm the id dorm
	 * @return the dormitory by id
	 */
	public Dormitory getDormitoryById(Long idDorm) {
		return dormitoryRepository.findById(idDorm).orElse(null);
	}

	public List<Student> getAllStudentsFromDorm(Long idDorm) {
		Dormitory dormitory = new Dormitory();
		dormitory.setIdDormitory(idDorm);
		return studentRepository.findAllByDormitory(dormitory);
	}
}
