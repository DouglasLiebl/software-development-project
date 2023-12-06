package io.github.entities;

import lombok.*;

@Getter @Setter @Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Client extends Person{
    private String email;
    private String cpf;
}
