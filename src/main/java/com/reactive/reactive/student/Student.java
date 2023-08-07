package com.reactive.reactive.student;

import com.reactive.reactive.courses.Course;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;

/**
 * @author eshtiaghi
 * created on 8/3/2023 12:22 PM
 */
@Data
@AllArgsConstructor
@Builder
@Table("student")
public class Student {
    @Id
    private Long id;
    private String firstname;
    private String lastname;
    private int age;

    private List<Course> courses;
}
