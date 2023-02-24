package com.task.subjectPlannerTask.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

//@Data
@Entity
@Table(name = "subjects")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "subName")
	private String subName;
	@Column(name = "tutorName")
	private String tutorName;
	@Column(name = "studFirstName")
	private String studFirstName;
	@Column(name = "studLastName")
	private String studLastName;
	@Column(name = "email")
	private String email;
	@Column(name = "preSubject")
	private String preSubject;
	@Column(name = "creditScore")
	private String creditPoints;

	public Subject() {
		super();
	}

	public Subject(long id, String subName, String tutorName, String studFirstName, String studLastName, String email,
			String preSubject, String creditPoints) {
		super();
		this.id = id;
		this.subName = subName;
		this.tutorName = tutorName;
		this.studFirstName = studFirstName;
		this.studLastName = studLastName;
		this.email = email;
		this.preSubject = preSubject;
		this.creditPoints = creditPoints;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public String getTutorName() {
		return tutorName;
	}

	public void setTutorName(String tutorName) {
		this.tutorName = tutorName;
	}

	public String getStudFirstName() {
		return studFirstName;
	}

	public void setStudFirstName(String studFirstName) {
		this.studFirstName = studFirstName;
	}

	public String getStudLastName() {
		return studLastName;
	}

	public void setStudLastName(String studLastName) {
		this.studLastName = studLastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPreSubject() {
		return preSubject;
	}

	public void setPreSubject(String preSubject) {
		this.preSubject = preSubject;
	}

	public String getCreditPoints() {
		return creditPoints;
	}

	public void setCreditPoints(String creditPoints) {
		this.creditPoints = creditPoints;
	}

}
