package org.group35educationcenter.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.group35educationcenter.models.Course;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseDto {

    private Long id;
    private String title;
    private String description;
    private String beginDate;
    private String endDate;
    private Double price;
    private Course.State state;


    public static CourseDto from(Course course) {
        return CourseDto.builder()
                .id(course.getId())
                .description(course.getDescription())
                .title(course.getTitle())
                .beginDate(course.getBeginDate().toString())
                .endDate(course.getEndDate().toString())
                .price(course.getPrice())
                .state(course.getState())
                .build();
    }

    public static List<CourseDto> from(List<Course> courses) {
        return courses.stream()
                .map(CourseDto::from)
                .toList();
    }
}
