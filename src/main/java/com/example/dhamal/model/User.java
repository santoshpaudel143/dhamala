package com.example.dhamal.model;

import com.example.dhamal.enums.UserType;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "users", uniqueConstraints = {@UniqueConstraint(columnNames = "email", name = "UNIQUE_user_email")})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class User {

    @Id
    @SequenceGenerator(sequenceName = "users_seq_gen", name = "users_seq", allocationSize = 1)
    @GeneratedValue(generator = "users_seq_gen", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "name")
    @NotNull
    private String name;
    private String surName;
    private String email;
    private String address;
    @Enumerated(EnumType.STRING)
    private UserType userType;
    @OneToOne
    @JoinColumn(name = "student_detail_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_user_student"))
    private StudentDetails studentDetails;
    private String imagePath;
}
