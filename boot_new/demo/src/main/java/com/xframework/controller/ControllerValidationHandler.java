package com.xframework.controller;

import com.xframework.dto.MessageDTO;
import com.xframework.util.MessageType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Locale;
import java.util.Set;

/**
 * Created by Len on 18/12/2016.
 */
@ControllerAdvice
public class ControllerValidationHandler {

	@Autowired
	private MessageSource messageSource;

	@ExceptionHandler({ConstraintViolationException.class})
	@ResponseStatus(value=HttpStatus.UNPROCESSABLE_ENTITY)
	@ResponseBody
	public String validationError(ConstraintViolationException ex) {

		Set violations = ex.getConstraintViolations();
		ConstraintViolation v = (ConstraintViolation) violations.toArray()[0];

		//return v.getPropertyPath() + "<------------->" + v.getMessage();
		return messageSource.getMessage(v.getMessage(), null, null);
	}

	@ExceptionHandler({Throwable.class})
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public String unhandledError(Throwable ex) {
		return ex.getClass().getName() + " , " + ex.getMessage();
	}
}