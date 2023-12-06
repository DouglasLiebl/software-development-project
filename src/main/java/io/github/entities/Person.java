package io.github.entities;

import lombok.*;

@Getter @Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {
    private Long id;
    private String name;
}
