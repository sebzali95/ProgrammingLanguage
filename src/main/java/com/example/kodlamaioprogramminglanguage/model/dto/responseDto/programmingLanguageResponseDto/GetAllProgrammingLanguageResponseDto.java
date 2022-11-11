package com.example.kodlamaioprogramminglanguage.model.dto.responseDto.programmingLanguageResponseDto;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllProgrammingLanguageResponseDto {

    private Long id;

    @NotBlank(message = "name cannot be entered blank")
    @Column(unique = true)
    private String name;
}
