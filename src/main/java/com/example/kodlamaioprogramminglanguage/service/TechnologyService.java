package com.example.kodlamaioprogramminglanguage.service;

import com.example.kodlamaioprogramminglanguage.model.dto.requestDto.technologyRequestDto.CreateTechnologyRequestDto;
import com.example.kodlamaioprogramminglanguage.model.dto.requestDto.technologyRequestDto.UpdateTechnologyRequestDto;
import com.example.kodlamaioprogramminglanguage.model.dto.responseDto.technologyResponseDto.GetAllTechnologyResponseDto;
import com.example.kodlamaioprogramminglanguage.model.dto.responseDto.technologyResponseDto.GetTechnologyByIdResponseDto;

import java.util.List;

public interface TechnologyService {


    List<GetAllTechnologyResponseDto> getAll();

    void create(CreateTechnologyRequestDto createTechnologyRequestDto);

    UpdateTechnologyRequestDto update(Long id, UpdateTechnologyRequestDto createTechnologyRequestDto);

    void deleteTechnologyById(Long id);

    GetTechnologyByIdResponseDto getById(Long id);
}
