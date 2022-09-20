package com.example.dhamal.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "student_details")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentDetails {

    @Id
    @GeneratedValue(generator = "student_details_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "student_details_gen", sequenceName = "student_details_seq", allocationSize = 1)
    private Long id;

    @Column(name = "name")
    private String name;
    private String address;
    private Integer age;
    private String grade;
}
