package com.example.kodlamaioprogramminglanguage.model.dto.responseDto.technologyResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetTechnologyByIdResponseDto {

    private Long id;

    @NotBlank(message = "name cannot be entered blank")
    private String name;
}
