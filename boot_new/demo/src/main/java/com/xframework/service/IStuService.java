package com.xframework.service;

import com.xframework.entity.Student;

import java.util.List;

/**
 * Created by Len on 18/12/2016.
 */
public interface IStuService {

	public int save(Student student);

	public List<Student> findAll();

}
