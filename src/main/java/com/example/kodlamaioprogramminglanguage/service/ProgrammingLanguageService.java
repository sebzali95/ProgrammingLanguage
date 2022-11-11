package com.example.kodlamaioprogramminglanguage.service;

import com.example.kodlamaioprogramminglanguage.model.dto.requestDto.programmingLanguageRequestDto.CreateProgrammingLanguageRequestDto;
import com.example.kodlamaioprogramminglanguage.model.dto.requestDto.programmingLanguageRequestDto.UpdateProgrammingLanguageRequestDto;
import com.example.kodlamaioprogramminglanguage.model.dto.responseDto.programmingLanguageResponseDto.GetAllProgrammingLanguageResponseDto;
import com.example.kodlamaioprogramminglanguage.model.dto.responseDto.programmingLanguageResponseDto.GetProgrammingLanguageByIdResponseDto;
import com.example.kodlamaioprogramminglanguage.model.entity.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {

    List<GetAllProgrammingLanguageResponseDto> getAll();

    CreateProgrammingLanguageRequestDto create(ProgrammingLanguage programmingLanguage);

    GetProgrammingLanguageByIdResponseDto getProgrammingById(Long id);

    UpdateProgrammingLanguageRequestDto update(Long id, UpdateProgrammingLanguageRequestDto programmingLanguageDto);

    void deleteProgrammingLanguageId(Long id);
}
