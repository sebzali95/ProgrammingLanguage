package com.example.kodlamaioprogramminglanguage.service;

import com.example.kodlamaioprogramminglanguage.model.dto.requestDto.programmingLanguageRequestDto.CreateProgrammingLanguageRequestDto;
import com.example.kodlamaioprogramminglanguage.model.dto.requestDto.programmingLanguageRequestDto.UpdateProgrammingLanguageRequestDto;
import com.example.kodlamaioprogramminglanguage.model.dto.responseDto.programmingLanguageResponseDto.GetAllProgrammingLanguageResponseDto;
import com.example.kodlamaioprogramminglanguage.model.dto.responseDto.programmingLanguageResponseDto.GetProgrammingLanguageByIdResponseDto;

import java.util.List;

public interface ProgrammingLanguageService {

    List<GetAllProgrammingLanguageResponseDto> getAll();

    void create(CreateProgrammingLanguageRequestDto createProgrammingLanguageRequestDto);

    GetProgrammingLanguageByIdResponseDto getProgrammingById(Long id);

    UpdateProgrammingLanguageRequestDto update(Long id, UpdateProgrammingLanguageRequestDto programmingLanguageDto);

    void deleteProgrammingLanguageId(Long id);
}
