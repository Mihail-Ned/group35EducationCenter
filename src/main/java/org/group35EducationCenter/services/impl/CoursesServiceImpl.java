package org.group35EducationCenter.services.impl;

import lombok.RequiredArgsConstructor;
import org.group35educationcenter.dto.*;
import org.group35educationcenter.repositories.CourseRepository;
import org.group35educationcenter.repositories.LessonRepository;
import org.group35educationcenter.repositories.UserRepository;
import org.group35educationcenter.services.CoursesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CoursesServiceImpl implements CoursesService {

    private final CourseRepository courseRepository;
    private final LessonRepository lessonRepository;


    @Override
    public CourseDto addCourse(NewCourseDto newCourse) {
        return null;
    }

    @Override
    public List<CourseDto> getCourses() {
        return List.of();
    }

    @Override
    public CourseDto getCourse(Long courseId) {
        return null;
    }

    @Override
    public LessonDto addLessonToCourse(Long courseId, NewLessonDto newLesson) {
        return null;
    }

    @Override
    public List<LessonDto> getLessonsOfCourse(Long courseId) {
        return List.of();
    }

    @Override
    public LessonDto updateLessonInCourse(Long courseId, Long lessonId, LessonUpdateDto updateLesson) {
        return null;
    }

    @Override
    public LessonDto deleteLessonFromCourse(Long courseId, Long lessonId) {
        return null;
    }

    @Override
    public UserDto addStudentToCourse(Long courseId, StudentToCourseDto student) {
        return null;
    }

    @Override
    public List<UserDto> getStudents() {
        return List.of();
    }

    @Override
    public List<UserDto> getStudentsOfCourse(Long courseId) {
        return List.of();
    }
}
