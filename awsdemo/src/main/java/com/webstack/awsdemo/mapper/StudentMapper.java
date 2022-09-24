package com.webstack.awsdemo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;

import com.webstack.awsdemo.domain.Student;
import com.webstack.awsdemo.dto.StudentDTO;

@Component
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StudentMapper extends EntityMapper<StudentDTO, Student> {

	default Student fromId(Long id) {
		if (id == null)
			return null;
		Student student = new Student();
		student.setRollNo(id);
		return student;
	}
}
