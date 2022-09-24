package com.webstack.awsdemo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webstack.awsdemo.dto.StudentDTO;
import com.webstack.awsdemo.mapper.StudentMapper;
import com.webstack.awsdemo.repository.StudentRepository;
import com.webstack.awsdemo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private StudentMapper studentMapper;

	@Override
	public List<StudentDTO> list() {

		return studentRepository.findAll().stream().map(studentMapper::toDto).collect(Collectors.toList());
	}

}
