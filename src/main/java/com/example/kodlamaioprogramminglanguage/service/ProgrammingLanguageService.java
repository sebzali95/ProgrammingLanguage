package com.example.kodlamaioprogramminglanguage.service;

import com.example.kodlamaioprogramminglanguage.model.dto.ProgrammingLanguageRequestDto;
import com.example.kodlamaioprogramminglanguage.model.dto.ProgrammingLanguageResponseDto;
import com.example.kodlamaioprogramminglanguage.model.entity.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {

    List<ProgrammingLanguageResponseDto> getAll();

    void create(ProgrammingLanguageRequestDto programmingLanguageRequestDto);

    ProgrammingLanguageResponseDto getProgrammingById(Long id);

    void update(Long id, ProgrammingLanguageRequestDto programmingLanguageDto);

    void deleteProgrammingLanguageId(Long id);
}
