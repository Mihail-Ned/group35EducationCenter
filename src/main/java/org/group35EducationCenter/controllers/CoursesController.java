package org.group35EducationCenter.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.group35educationcenter.dto.*;
import org.group35educationcenter.services.CoursesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@RequiredArgsConstructor
public class CoursesController {

    private final CS coursesService;

    @GetMapping
    public ResponseEntity<List<CourseDto>> getCourses() {
        return ResponseEntity
                .ok(coursesService.getCourses());
    }

    @PostMapping
    public ResponseEntity<CourseDto> addCourse(@RequestBody @Valid NewCourseDto newCourse){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(coursesService.addCourse(newCourse));
    }

    @GetMapping("/{idCourse}")
    public ResponseEntity<CourseDto> getCourse(@PathVariable("idCourse") Long courseId) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(coursesService.getCourse(courseId));
    }

    @PostMapping("/{idCourse}/lessons")
    public ResponseEntity<LessonDto> addLessonToCourse(@PathVariable("idCourse") Long courseId,
                                                       @RequestBody @Valid NewLessonDto newLesson) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(coursesService.addLessonToCourse(courseId, newLesson));
    }


    @GetMapping("/{idCourse}/lessons")
    public ResponseEntity<List<LessonDto>> getLessonsOfCourse(@PathVariable("idCourse") Long courseId) {
        return ResponseEntity
                .ok(coursesService.getLessonsOfCourse(courseId));
    }

    @PutMapping("/{idCourse}/lessons/{idLesson}")
    public ResponseEntity<LessonDto> updateLessonInCourse(@PathVariable("idCourse") Long courseId,
                                                          @PathVariable("idLesson") Long lessonId,
                                                          @RequestBody @Valid LessonUpdateDto updateLesson){
        return ResponseEntity
                .ok(coursesService.updateLessonInCourse(courseId, lessonId, updateLesson));
    }

    @DeleteMapping("/{idCourse}/lessons/{idLesson}")
    public ResponseEntity<LessonDto> deleteLessonInCourse(@PathVariable("idCourse") Long courseId,
                                                          @PathVariable("idLesson") Long lessonId){
        return ResponseEntity
                .ok(coursesService.deleteLessonFromCourse(courseId, lessonId));
    }


    @PostMapping("/{idCourse}/students")
    public ResponseEntity<UserDto> addStudentToCourse(@PathVariable("idCourse") Long courseId,
                                                      @RequestBody @Valid StudentToCourseDto student){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(coursesService.addStudentToCourse(courseId, student));
    }

    @GetMapping("/{idCourse}/students")
    public ResponseEntity<List<UserDto>> getStudentsOfCourse(@PathVariable("idCourse") Long courseId) {
        return ResponseEntity
                .ok(coursesService.getStudentsOfCourse(courseId));
    }

    @GetMapping("/students")
    public ResponseEntity<List<UserDto>> getStudents() {
        return ResponseEntity
                .ok(coursesService.getStudents());
    }

}
