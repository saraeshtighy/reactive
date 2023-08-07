package com.reactive.reactive.student;

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
public class StudentServices {
    private final StudentRepo studentRepository;

    public Flux<Student> findAll() {
        return studentRepository.findAll()
                .delayElements(Duration.ofSeconds(1));
    }

    public Mono<Student> findById(Long id) {
        return studentRepository.findById(id);
    }


    public Flux<Student> findByFirstname(String firstname) {
        return studentRepository.findAllByFirstnameContainingIgnoreCase(firstname);
    }

    public void deleteById(Long id) {
        studentRepository.deleteById(id).subscribe();
    }
}
