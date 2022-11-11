package com.example.kodlamaioprogramminglanguage.model.dto.requestDto.programmingLanguageRequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProgrammingLanguageRequestDto {

    @NotBlank(message = "name cannot be entered blank")
    @Column(unique = true)
    private String name;
}
