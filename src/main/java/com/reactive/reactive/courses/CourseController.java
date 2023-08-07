package com.reactive.reactive.courses;

import com.reactive.reactive.student.Student;
import com.reactive.reactive.student.StudentServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author eshtiaghi
 * created on 8/3/2023 12:23 PM
 */
@RestController
@RequestMapping("/api/v1/course")
@RequiredArgsConstructor
public class CourseController {
    private final CourseServices courseServices;

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Course> findAll() {
        return courseServices.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Course> findById(@PathVariable Long id) {
        return courseServices.findById(id);
    }



    @GetMapping("/filter")
    public Flux<Course> findByAuthor(@RequestParam String name) {
        return courseServices.findByFirstname(name);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        courseServices.deleteById(id);
    }
}
