package com.example.kodlamaioprogramminglanguage.model.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table
public class Technology {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "name cannot be entered blank")
    @Column(unique = true)
    private String name;
    @ManyToOne
    private ProgrammingLanguage programmingLanguage;
}
