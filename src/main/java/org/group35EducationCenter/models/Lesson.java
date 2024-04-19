package org.group35EducationCenter.models;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Time;
import java.time.DayOfWeek;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private LocalDateTime startTime;
    private LocalDateTime finishTime;

    @Enumerated(value = EnumType.STRING)
    private DayOfWeek dayOfWeek;

    @ManyToOne
    @JoinColumn(name = "course_id")
    @ToString.Exclude
    private Course course;


}
