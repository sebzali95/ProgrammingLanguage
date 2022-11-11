package com.example.kodlamaioprogramminglanguage.model.dto.requestDto.technologyRequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateTechnologyRequestDto {

    @NotBlank(message = "name cannot be entered blank")
    @Column(unique = true)
    private String name;

    private Long languageId;
}
