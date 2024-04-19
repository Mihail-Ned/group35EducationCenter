package org.group35EducationCenter.repositories;

import org.group35educationcenter.models.Course;
import org.group35educationcenter.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);

    Set<User> findAllByCoursesContainsOrderById(Course course);

}
