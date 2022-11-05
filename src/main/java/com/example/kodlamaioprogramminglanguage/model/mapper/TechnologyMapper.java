package com.example.kodlamaioprogramminglanguage.model.mapper;

import com.example.kodlamaioprogramminglanguage.model.dto.TechnologyRequestDto;
import com.example.kodlamaioprogramminglanguage.model.entity.Technology;
import com.example.kodlamaioprogramminglanguage.model.dto.TechnologyResponseDto;

public class TechnologyMapper {

    public static TechnologyResponseDto toResponseDto(Technology technology) {
        TechnologyResponseDto technologyResponseDto = new TechnologyResponseDto();
        technologyResponseDto.setId(technology.getId());
        technologyResponseDto.setName(technology.getName());
        return technologyResponseDto;
    }

    public static Technology toEntity(TechnologyRequestDto technologyRequestDto) {
        Technology technology = new Technology();
        technology.setName(technologyRequestDto.getName());
        return technology;
    }
}
