package com.webstack.awsdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webstack.awsdemo.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
