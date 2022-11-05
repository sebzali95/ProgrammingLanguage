package com.example.kodlamaioprogramminglanguage.service.impl;

import com.example.kodlamaioprogramminglanguage.model.dto.requestDto.programmingLanguageRequestDto.CreateProgrammingLanguageRequestDto;
import com.example.kodlamaioprogramminglanguage.model.dto.requestDto.programmingLanguageRequestDto.UpdateProgrammingLanguageRequestDto;
import com.example.kodlamaioprogramminglanguage.model.dto.responseDto.programmingLanguageResponseDto.GetAllProgrammingLanguageResponseDto;
import com.example.kodlamaioprogramminglanguage.model.dto.responseDto.programmingLanguageResponseDto.GetProgrammingLanguageByIdResponseDto;
import com.example.kodlamaioprogramminglanguage.model.entity.ProgrammingLanguage;
import com.example.kodlamaioprogramminglanguage.model.mapper.ProgrammingLanguageMapper;
import com.example.kodlamaioprogramminglanguage.repository.ProgrammingLanguageRepository;
import com.example.kodlamaioprogramminglanguage.service.ProgrammingLanguageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ProgrammingLanguageServiceImpl implements ProgrammingLanguageService {
    private final ProgrammingLanguageRepository programmingLanguageRepository;
    private final ProgrammingLanguageMapper programmingLanguageMapper;

    @Override
    public List<GetAllProgrammingLanguageResponseDto> getAll() {
        List<ProgrammingLanguage> languages = programmingLanguageRepository.findAll();
        return programmingLanguageMapper.toLanguageDTOs(languages);
    }

    @Override
    public void create(CreateProgrammingLanguageRequestDto requestDto) {
        ProgrammingLanguage programmingLanguage = programmingLanguageMapper.toCreateLanguageRequest(requestDto);
        programmingLanguageRepository.save(programmingLanguage);
    }

    @Override
    public GetProgrammingLanguageByIdResponseDto getProgrammingById(Long id) {
        return programmingLanguageRepository.findById(id)
                .map(programmingLanguage -> programmingLanguageMapper.toLanguageDto(programmingLanguage))
                .orElseThrow(() -> new RuntimeException("id not found"));
    }

    @Override
    public UpdateProgrammingLanguageRequestDto update(Long id, UpdateProgrammingLanguageRequestDto requestDto) {
        ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("id not found"));

        programmingLanguageMapper.update(programmingLanguage, requestDto);
        programmingLanguageRepository.save(programmingLanguage);

        return requestDto;
    }

    @Override
    public void deleteProgrammingLanguageId(Long id) {
        programmingLanguageRepository.deleteById(id);
    }
}
