package com.example.kodlamaioprogramminglanguage.service.impl;
import com.example.kodlamaioprogramminglanguage.model.dto.ProgrammingLanguageRequestDto;
import com.example.kodlamaioprogramminglanguage.model.dto.ProgrammingLanguageResponseDto;
import com.example.kodlamaioprogramminglanguage.model.entity.ProgrammingLanguage;
import com.example.kodlamaioprogramminglanguage.model.mapper.ProgrammingLanguageMapper;
import com.example.kodlamaioprogramminglanguage.repository.ProgrammingLanguageRepository;
import com.example.kodlamaioprogramminglanguage.service.ProgrammingLanguageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;



@Service
@RequiredArgsConstructor
public class ProgrammingLanguageServiceImpl implements ProgrammingLanguageService {
    private final ProgrammingLanguageRepository programmingLanguageRepository;
    @Override
    public List<ProgrammingLanguageResponseDto> getAll() {
        return programmingLanguageRepository.findAll()
                .stream()
                .map(ProgrammingLanguageMapper::toResponseDto)
                .collect(Collectors.toList());
    }
    @Override
    public void create(ProgrammingLanguageRequestDto requestDto) {
        ProgrammingLanguage programmingLanguage = ProgrammingLanguageMapper.toEntity(requestDto);
        programmingLanguageRepository.save(programmingLanguage);
    }

    @Override
    public ProgrammingLanguageResponseDto getProgrammingById(Long id) {
        return programmingLanguageRepository.findById(id)
                .map(programmingLanguage -> ProgrammingLanguageMapper.toResponseDto(programmingLanguage))
                .orElseThrow(() -> new RuntimeException("id not found"));
    }

    @Override
    public void update(Long id, ProgrammingLanguageRequestDto requestDto) {
        ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No Programming Language found for this id"));
        programmingLanguage.setName(requestDto.getName());
        programmingLanguageRepository.save(programmingLanguage);

    }

    @Override
    public void deleteProgrammingLanguageId(Long id) {
        programmingLanguageRepository.deleteById(id);
    }
}
