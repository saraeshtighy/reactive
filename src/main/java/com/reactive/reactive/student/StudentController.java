package com.reactive.reactive.student;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author eshtiaghi
 * created on 8/3/2023 12:23 PM
 */
@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentServices studentservice;

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Student> findAll() {
        return studentservice.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Student> findById(@PathVariable Long id) {
        return studentservice.findById(id);
    }



    @GetMapping("/filter")
    public Flux<Student> findByAuthor(@RequestParam String name) {
        return studentservice.findByFirstname(name);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        studentservice.deleteById(id);
    }
}
