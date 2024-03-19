package com.example.taskmanagementassignment.model;

import ch.qos.logback.core.status.Status;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tasks")
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String title;

    String description;

    @CreationTimestamp
    Date orderTime;

    @Enumerated(EnumType.STRING)
    Status status;

    @ManyToOne
    @JoinColumn
    User user;

}
