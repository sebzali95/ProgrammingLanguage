package com.example.kodlamaioprogramminglanguage.model.dto.responseDto.programmingLanguageResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetProgrammingLanguageByIdResponseDto {
    private Long id;

    private String name;
}
