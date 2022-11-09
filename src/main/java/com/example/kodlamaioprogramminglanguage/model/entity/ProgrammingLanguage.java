package com.example.kodlamaioprogramminglanguage.model.entity;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank(message = "name cannot be entered blank")
    private String name;


    @OneToMany(mappedBy = "programmingLanguage")
    private Set<Technology> technologies = new HashSet<>();

}
