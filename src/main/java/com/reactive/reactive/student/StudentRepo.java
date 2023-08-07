package com.reactive.reactive.student;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

/**
 * @author eshtiaghi
 * created on 8/3/2023 12:24 PM
 */

public  interface  StudentRepo extends ReactiveCrudRepository<Student, Long> {
    Flux<Student> findAllByFirstnameContainingIgnoreCase(String firstname);
}
