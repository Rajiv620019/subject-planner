package com.task.subjectPlannerTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.subjectPlannerTask.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
	
}
