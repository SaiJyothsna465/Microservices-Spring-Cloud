package com.sai.microservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sai.microservice.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}
