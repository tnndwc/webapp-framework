package com.xframework.controller;

import com.xframework.entity.Student;
import com.xframework.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.Date;

/**
 * Created by Len on 17/12/2016.
 */
@RestController
@RequestMapping(value = "/stu")
public class StudentController {

	@Autowired
	private IStuService stuService;

	@GetMapping(value = "/add/{userName}")
	public int save(@Valid @PathVariable(value = "userName") String userName, @RequestParam(value = "age", required = false) Integer age){

		/*if(result.hasErrors()){
			System.out.printf("valid error");
		} else {
			System.out.printf("valid ok");
		}*/

		System.out.printf("=========>age=" + age);

		Student student = new Student();
		student.setName(userName);
		student.setTime(new Date());

		return stuService.save(student);
	}

}
