package com.croamora.estudiantes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.croamora.estudiantes.model.ContactInfo;
import com.croamora.estudiantes.model.Dormitory;
import com.croamora.estudiantes.model.Student;
import com.croamora.estudiantes.service.ApiService;

@Controller
public class ApiController {
	
	@Autowired
	ApiService apiService;
	
	@RequestMapping(value="/students/create", method=RequestMethod.GET)
	public String creteStudent(@RequestParam(value = "firstName") String firstName,
			@RequestParam(value = "lastName") String lastName,
			@RequestParam(value = "age") Integer age,
			Model model) {
		
		Student student = new Student();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setAge(age);
		apiService.creteStudent(student);
		return students(model);
	}
	
	
	@RequestMapping(value="/contacts/create", method=RequestMethod.GET)
	public String creteContact(@RequestParam(value = "student") Long student,
			@RequestParam(value = "address") String address,
			@RequestParam(value = "city") String city,
			@RequestParam(value = "state") String state,
			Model model) {
		
		ContactInfo contactInfo = new ContactInfo();
		contactInfo.setStudent(apiService.getStudentById(student));
		contactInfo.setAddress(address);
		contactInfo.setCity(city);
		contactInfo.setState(state);
		apiService.createContactInfo(contactInfo);
		return students(model);
	}
	
	@RequestMapping(value="/students")
	public String students(Model model) {
		
		List<Student> students = apiService.getAllStudent();
		model.addAttribute("students", students);
		
		return "StudentsDetail.jsp";
	}
	
	@RequestMapping(value="/dorms/create", method=RequestMethod.GET)
	public String createDorms(@RequestParam(value = "name") String name,
			Model model) {
		Dormitory dormitory = new Dormitory();
		dormitory.setName(name);
		apiService.createDorms(dormitory);
		return students(model);
	}
	
	
	@RequestMapping(value="/dorms/{idDorm}/add", method=RequestMethod.GET)
	public String addStudentToDorm(@PathVariable(value="idDorm") Long idDorm,@RequestParam(value = "student") Long student,
			Model model) {
		Student studentObject = apiService.getStudentById(student);
		Dormitory dormitory = apiService.getDormitoryById(idDorm);
		studentObject.setDormitory(dormitory);
		apiService.creteStudent(studentObject);
		return students(model);
	}
	
	@RequestMapping(value="/dorms/{idDorm}/remove", method=RequestMethod.GET)
	public String removeStudentToDorm(@PathVariable(value="idDorm") Long idDorm,@RequestParam(value = "student") Long student,
			Model model) {
		Student studentObject = apiService.getStudentById(student);
		Dormitory dormitory = apiService.getDormitoryById(idDorm);
		studentObject.setDormitory(null);
		apiService.creteStudent(studentObject);
		return students(model);
	}
	
	
	@RequestMapping(value="/dorms/{idDorm}", method=RequestMethod.GET)
	public String showStudentFromDorm(@PathVariable(value="idDorm") Long idDorm,
			Model model) {

		List<Student> studentsFromDorm = apiService.getAllStudentsFromDorm(idDorm);
		model.addAttribute("studentsFromDorm", studentsFromDorm);
		return "DormitoryDetail.jsp";
	}
	



}
