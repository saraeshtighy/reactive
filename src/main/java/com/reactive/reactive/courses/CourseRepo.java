package com.reactive.reactive.courses;

import com.reactive.reactive.student.Student;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

/**
 * @author eshtiaghi
 * created on 8/3/2023 12:24 PM
 */

public  interface CourseRepo extends ReactiveCrudRepository<Course, Long> {
    Flux<Course> findAllByNameContainingIgnoreCase(String name);
}
