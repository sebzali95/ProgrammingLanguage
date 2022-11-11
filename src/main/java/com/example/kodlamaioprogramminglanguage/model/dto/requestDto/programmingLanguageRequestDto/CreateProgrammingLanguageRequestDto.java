package com.example.kodlamaioprogramminglanguage.model.dto.requestDto.programmingLanguageRequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProgrammingLanguageRequestDto {

    private Long id;

    @NotBlank(message = "name cannot be entered blank")
    @Column(name = "name", unique = true)
    private String name;
}
