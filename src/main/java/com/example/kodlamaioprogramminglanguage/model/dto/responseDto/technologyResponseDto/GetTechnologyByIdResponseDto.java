package com.example.kodlamaioprogramminglanguage.model.dto.responseDto.technologyResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetTechnologyByIdResponseDto {

    private Long id;

    private String name;
}
