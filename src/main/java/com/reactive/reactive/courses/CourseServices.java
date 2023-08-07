package com.reactive.reactive.courses;

import com.reactive.reactive.student.Student;
import com.reactive.reactive.student.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

/**
 * @author eshtiaghi
 * created on 8/3/2023 12:24 PM
 */

@Service
@RequiredArgsConstructor
public class CourseServices {
    private final CourseRepo courseRepo;

    public Flux<Course> findAll() {
        return courseRepo.findAll()
                .delayElements(Duration.ofSeconds(1));
    }

    public Mono<Course> findById(Long id) {
        return courseRepo.findById(id);
    }


    public Flux<Course> findByFirstname(String name) {
        return courseRepo.findAllByNameContainingIgnoreCase(name);
    }

    public void deleteById(Long id) {
        courseRepo.deleteById(id).subscribe();
    }
}
