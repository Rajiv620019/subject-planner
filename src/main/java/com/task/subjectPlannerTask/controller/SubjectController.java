package com.task.subjectPlannerTask.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.task.subjectPlannerTask.entity.Subject;
import com.task.subjectPlannerTask.exception.ResourceNotFoundException;
import com.task.subjectPlannerTask.service.SubjectService;
import com.task.subjectPlannerTask.service.impl.SubjectServiceImpl;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

	private SubjectService subjectService;

	public SubjectController(SubjectService subjectService) {
		super();
		this.subjectService = subjectService;
	}

	@PostMapping
	public ResponseEntity<Subject> saveSubject(@RequestBody Subject subject) {
		return new ResponseEntity<Subject>(subjectService.saveSubject(subject), HttpStatus.CREATED);
	}

	@GetMapping
	public List<Subject> getAllSubjects() {
		return subjectService.getAllSubjects();
	}

	@GetMapping("{id}")
	public ResponseEntity<Subject> getSubjectById(@PathVariable("id") long subjectId) {
		return new ResponseEntity<Subject>(subjectService.getSubjectById(subjectId), HttpStatus.OK);
	}

	@PutMapping("{id}")
	public ResponseEntity<Subject> updateSubject(@PathVariable("id") long id, @RequestBody Subject subject) {
		return new ResponseEntity<Subject>(subjectService.updateSubject(subject, id), HttpStatus.OK);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteSubject(@PathVariable("id") long id) {

		subjectService.deleteEmployee(id);
		return new ResponseEntity<String>("Subject deleted successfully!", HttpStatus.OK);

	}

}
