package com.example.kodlamaioprogramminglanguage.model.dto.requestDto.technologyRequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateTechnologyRequestDto {

    @NotBlank(message = "name cannot be entered blank")
    private String name;

    private Long languageId;
}
