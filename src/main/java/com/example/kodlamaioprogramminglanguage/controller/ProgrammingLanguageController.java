package com.example.kodlamaioprogramminglanguage.controller;

import com.example.kodlamaioprogramminglanguage.model.dto.ProgrammingLanguageRequestDto;
import com.example.kodlamaioprogramminglanguage.model.dto.ProgrammingLanguageResponseDto;
import com.example.kodlamaioprogramminglanguage.service.ProgrammingLanguageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/languages")
@RequiredArgsConstructor
public class ProgrammingLanguageController {

    private final ProgrammingLanguageService programmingLanguageService;


    @GetMapping
    public List<ProgrammingLanguageResponseDto> getAll() {
        return programmingLanguageService.getAll();
    }

    @GetMapping("/{id}")
    public ProgrammingLanguageResponseDto getProgrammingLanguageById(@PathVariable Long id) {
        return (programmingLanguageService.getProgrammingById(id));
    }

    @PostMapping
    public void createProgrammingLanguage(@Valid @RequestBody ProgrammingLanguageRequestDto requestDto) {
        programmingLanguageService.create(requestDto);
    }

    @PutMapping("/{id}")
    public void updateProgrammingLanguage(@Valid @PathVariable Long id, @RequestBody ProgrammingLanguageRequestDto requestDto) {
        programmingLanguageService.update(id, requestDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        programmingLanguageService.deleteProgrammingLanguageId(id);
    }

}
