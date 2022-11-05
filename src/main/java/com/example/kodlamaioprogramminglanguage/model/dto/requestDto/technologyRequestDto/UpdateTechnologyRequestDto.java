package com.example.kodlamaioprogramminglanguage.model.dto.requestDto.technologyRequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateTechnologyRequestDto {
    private String name;

    private Long languageId;
}
