package com.example.dhamal.repository;

import com.example.dhamal.model.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDetailsRepo extends JpaRepository<StudentDetails, Long> {
}
