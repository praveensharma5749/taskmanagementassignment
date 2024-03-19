package com.example.taskmanagementassignment.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String userName;

    @Column(unique = true,nullable = false)
    String mobileNo;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    List<Tasks> tasks = new ArrayList<>();
}