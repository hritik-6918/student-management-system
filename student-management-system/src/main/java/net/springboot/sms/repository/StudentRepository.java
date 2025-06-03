package net.springboot.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.springboot.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
