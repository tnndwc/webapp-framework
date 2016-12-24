package com.xframework.entity;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Len on 18/12/2016.
 */
@Entity
public class Student{

	@Id
	@GeneratedValue
	private int id;

	@NotBlank
	@Range(min = 5, max = 30, message = "Range.student.name")

	@Column(name = "name")
	private String name;

	@Column(name = "time")
	private Date time;

	public Student() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", time=" + time +
				'}';
	}
}
