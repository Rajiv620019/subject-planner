package com.task.subjectPlannerTask.service;

import java.util.List;

import com.task.subjectPlannerTask.entity.Subject;

public interface SubjectService {

	Subject saveSubject(Subject subject);
	
	List<Subject> getAllSubjects();
	
	Subject getSubjectById(long id);
	
	Subject updateSubject(Subject subject, long id);
	
	void deleteEmployee(long id);
}

