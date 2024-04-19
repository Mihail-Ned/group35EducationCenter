package org.group35EducationCenter.repositories;

import org.group35educationcenter.models.Course;
import org.group35educationcenter.models.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.Set;

public interface LessonRepository extends JpaRepository<Lesson, Long> {

    Set<Lesson> findByCourseOrderById(Course course);

    Optional<Lesson> findByCourseAndId(Course course, Long lessonId);
}
