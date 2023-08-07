package com.reactive.reactive.courses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/**
 * @author eshtiaghi
 * created on 8/3/2023 12:22 PM
 */
@Data
@AllArgsConstructor
@Builder
@Table("course")
public class Course {
    @Id
    private Long id;
    private String name;
    private int code ;

}
