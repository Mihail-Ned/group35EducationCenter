package org.group35EducationCenter.models;

import com.fasterxml.jackson.databind.node.DoubleNode;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Course {

    public enum State {
        DRAFT,
        PUBLISHER
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String title;

    @Column(nullable = false, length = 1000)
    private String description;

    private LocalDateTime beginDate;
    private LocalDateTime endDate;

    @Column(nullable = false)
    private Double price;

    @Enumerated(value = EnumType.STRING)
    private State state;

    @OneToMany(mappedBy = "courses")
    private Set<Lesson> lessons;

    @ManyToMany(mappedBy = "courses")
    private Set<User> students;
}
