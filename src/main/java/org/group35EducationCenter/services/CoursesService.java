package org.group35EducationCenter.services;

import org.group35educationcenter.dto.*;

import java.util.List;

public interface CoursesService {

    CourseDto addCourse(NewCourseDto newCourse);

    List<CourseDto> getCourses();

    CourseDto getCourse(Long courseId);

    LessonDto addLessonToCourse(Long courseId, NewLessonDto newLesson);

    List<LessonDto> getLessonsOfCourse(Long courseId);

    LessonDto updateLessonInCourse(Long courseId, Long lessonId, LessonUpdateDto updateLesson);

    LessonDto deleteLessonFromCourse(Long courseId, Long lessonId);

    UserDto addStudentToCourse(Long courseId, StudentToCourseDto student);

    List<UserDto> getStudents();

    List<UserDto> getStudentsOfCourse(Long courseId);

}
