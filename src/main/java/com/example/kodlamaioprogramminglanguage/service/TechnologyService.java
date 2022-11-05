package com.example.kodlamaioprogramminglanguage.service;

import com.example.kodlamaioprogramminglanguage.model.dto.TechnologyRequestDto;
import com.example.kodlamaioprogramminglanguage.model.dto.TechnologyResponseDto;
import com.example.kodlamaioprogramminglanguage.model.entity.ProgrammingLanguage;
import com.example.kodlamaioprogramminglanguage.model.entity.Technology;

import java.util.List;

public interface TechnologyService {


    List<TechnologyResponseDto> getAll();

    void create(TechnologyRequestDto technologyRequestDto);

    void update(Long id, TechnologyRequestDto technologyRequestDto);

    void deleteTechnologyById(Long id);

    TechnologyResponseDto getById(Long id);
}
