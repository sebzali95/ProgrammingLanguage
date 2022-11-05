package com.example.kodlamaioprogramminglanguage.model.mapper;

import com.example.kodlamaioprogramminglanguage.model.dto.ProgrammingLanguageResponseDto;
import com.example.kodlamaioprogramminglanguage.model.entity.ProgrammingLanguage;
import com.example.kodlamaioprogramminglanguage.model.dto.ProgrammingLanguageRequestDto;

public class ProgrammingLanguageMapper {

    public static ProgrammingLanguageResponseDto toResponseDto(ProgrammingLanguage programmingLanguage) {
        ProgrammingLanguageResponseDto programmingLanguageResponseDto = new ProgrammingLanguageResponseDto();
        programmingLanguageResponseDto.setId(programmingLanguage.getId());
        programmingLanguageResponseDto.setName(programmingLanguage.getName());
        return programmingLanguageResponseDto;
    }

    public static ProgrammingLanguage toEntity(ProgrammingLanguageRequestDto programmingLanguageRequestDto) {
        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
        programmingLanguage.setName(programmingLanguageRequestDto.getName());
        return programmingLanguage;
    }
}
