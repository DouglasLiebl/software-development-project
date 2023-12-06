package io.github.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter @Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {
    private Long id;
    private String name;
}
