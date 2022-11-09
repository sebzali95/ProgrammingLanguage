package com.example.kodlamaioprogramminglanguage.service.impl;

import com.example.kodlamaioprogramminglanguage.model.dto.requestDto.technologyRequestDto.CreateTechnologyRequestDto;
import com.example.kodlamaioprogramminglanguage.model.dto.requestDto.technologyRequestDto.UpdateTechnologyRequestDto;
import com.example.kodlamaioprogramminglanguage.model.dto.responseDto.technologyResponseDto.GetAllTechnologyResponseDto;
import com.example.kodlamaioprogramminglanguage.model.dto.responseDto.technologyResponseDto.GetTechnologyByIdResponseDto;
import com.example.kodlamaioprogramminglanguage.model.entity.ProgrammingLanguage;
import com.example.kodlamaioprogramminglanguage.model.entity.Technology;
import com.example.kodlamaioprogramminglanguage.model.mapper.TechnologyMapper;
import com.example.kodlamaioprogramminglanguage.repository.ProgrammingLanguageRepository;
import com.example.kodlamaioprogramminglanguage.repository.TechnologyRepository;
import com.example.kodlamaioprogramminglanguage.service.TechnologyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TechnologyServiceImpl implements TechnologyService {

    private final TechnologyRepository technologyRepository;
    private final ProgrammingLanguageRepository languageRepository;
    private final TechnologyMapper technologyMapper;


    @Override
    public List<GetAllTechnologyResponseDto> getAll() {
        List<Technology> technologies = technologyRepository.findAll();
        return technologyMapper.toTechnologyDTOs(technologies);
    }

    @Override
    public CreateTechnologyRequestDto create(CreateTechnologyRequestDto requestDto) {
        Technology technology = technologyMapper.toCreateTechnologyRequest(requestDto);
        ProgrammingLanguage programmingLanguage = languageRepository.findById(requestDto.getLanguageId())
                .orElseThrow(() -> new RuntimeException("Programming language couldn't find by id: " + requestDto.getLanguageId()));
        technology.setName(requestDto.getName());
        technology.setProgrammingLanguage(programmingLanguage);
        technologyRepository.save(technology);

        return requestDto;
    }

    @Override
    public UpdateTechnologyRequestDto update(Long id, UpdateTechnologyRequestDto requestDto) {
        Technology technology = technologyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No Technology found on this id"));
        technology.setName(requestDto.getName());
        technologyMapper.update(technology, requestDto);
        technologyRepository.save(technology);

        return requestDto;
    }

    @Override
    public void deleteTechnologyById(Long id) {
        technologyRepository.deleteById(id);
    }

    @Override
    public GetTechnologyByIdResponseDto getById(Long id) {
        return technologyRepository.findById(id)
                .map(technology -> technologyMapper.toTechnologyDto(technology))
                .orElseThrow(() -> new RuntimeException("id not found"));
    }
}
