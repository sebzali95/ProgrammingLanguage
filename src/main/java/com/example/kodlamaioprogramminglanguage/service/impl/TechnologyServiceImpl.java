package com.example.kodlamaioprogramminglanguage.service.impl;

import com.example.kodlamaioprogramminglanguage.model.dto.TechnologyRequestDto;
import com.example.kodlamaioprogramminglanguage.model.dto.TechnologyResponseDto;
import com.example.kodlamaioprogramminglanguage.model.entity.ProgrammingLanguage;
import com.example.kodlamaioprogramminglanguage.model.entity.Technology;
import com.example.kodlamaioprogramminglanguage.model.mapper.ProgrammingLanguageMapper;
import com.example.kodlamaioprogramminglanguage.model.mapper.TechnologyMapper;
import com.example.kodlamaioprogramminglanguage.repository.ProgrammingLanguageRepository;
import com.example.kodlamaioprogramminglanguage.repository.TechnologyRepository;
import com.example.kodlamaioprogramminglanguage.service.ProgrammingLanguageService;
import com.example.kodlamaioprogramminglanguage.service.TechnologyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TechnologyServiceImpl implements TechnologyService {

    private final TechnologyRepository technologyRepository;

    private final ProgrammingLanguageRepository languageRepository;


    @Override
    public List<TechnologyResponseDto> getAll() {
        return technologyRepository.findAll()
                .stream()
                .map(TechnologyMapper::toResponseDto)
                .collect(Collectors.toList());
    }

    @Override
    public void create(TechnologyRequestDto requestDto) {
        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
        programmingLanguage.setName(requestDto.getName());
        languageRepository.save(programmingLanguage);
        Technology technology = TechnologyMapper.toEntity(requestDto);
        technologyRepository.save(technology);
    }

    @Override
    public void update(Long id, TechnologyRequestDto requestDto) {
        Technology technology = technologyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No Technology found on this id"));
        technology.setName(requestDto.getName());
        technologyRepository.save(technology);
    }

    @Override
    public void deleteTechnologyById(Long id) {
        technologyRepository.deleteById(id);
    }

    @Override
    public TechnologyResponseDto getById(Long id) {
        return technologyRepository.findById(id)
                .map(technology -> TechnologyMapper.toResponseDto(technology))
                .orElseThrow(() -> new RuntimeException("id not found"));
    }
}
