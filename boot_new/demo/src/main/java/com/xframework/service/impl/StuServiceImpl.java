package com.xframework.service.impl;

import com.xframework.entity.Student;
import com.xframework.repository.StuRepository;
import com.xframework.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Created by Len on 18/12/2016.
 */
@Service
public class StuServiceImpl implements IStuService {

	@Autowired
	private StuRepository stuRepository;

	@Override
	public int save(Student student) {
		if(student == null){
			return -1;
		}

		Student stu = stuRepository.save(student);

		System.out.println(stu);
		return 1;
	}

	@Override
	public List<Student> findAll() {
		return null;
	}
}
