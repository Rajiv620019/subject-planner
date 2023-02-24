package com.task.subjectPlannerTask.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.task.subjectPlannerTask.entity.Subject;
import com.task.subjectPlannerTask.exception.ResourceNotFoundException;
import com.task.subjectPlannerTask.repository.SubjectRepository;
import com.task.subjectPlannerTask.service.SubjectService;

@Service
public class SubjectServiceImpl implements SubjectService {

	private SubjectRepository subjectRepository;

	public SubjectServiceImpl(SubjectRepository subjectRepository) {
		super();
		this.subjectRepository = subjectRepository;
	}

	@Override
	public Subject saveSubject(Subject subject) {
		return subjectRepository.save(subject);
	}

	@Override
	public List<Subject> getAllSubjects() {
		return subjectRepository.findAll();
	}

	@Override
	public Subject getSubjectById(long id) {
		Optional<Subject> subject = subjectRepository.findById(id);
		return subjectRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Subject", "Id", id));
	}

	@Override
	public Subject updateSubject(Subject subject, long id) {

		Subject existingSubject = subjectRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Subject", "Id", id));

		existingSubject.setSubName(subject.getSubName());
		existingSubject.setTutorName(subject.getTutorName());
		existingSubject.setStudFirstName(subject.getStudFirstName());
		existingSubject.setStudLastName(subject.getStudLastName());
		existingSubject.setEmail(subject.getEmail());
		existingSubject.setPreSubject(subject.getPreSubject());
		existingSubject.setCreditPoints(subject.getCreditPoints());

		subjectRepository.save(existingSubject);
		return existingSubject;
	}

	@Override
	public void deleteEmployee(long id) {
		subjectRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Subject", "Id", id));
		subjectRepository.deleteById(id);

	}

}
