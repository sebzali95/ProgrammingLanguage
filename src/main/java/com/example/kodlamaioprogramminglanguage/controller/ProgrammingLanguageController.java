package com.example.kodlamaioprogramminglanguage.controller;

import com.example.kodlamaioprogramminglanguage.model.dto.requestDto.programmingLanguageRequestDto.CreateProgrammingLanguageRequestDto;
import com.example.kodlamaioprogramminglanguage.model.dto.requestDto.programmingLanguageRequestDto.UpdateProgrammingLanguageRequestDto;
import com.example.kodlamaioprogramminglanguage.model.dto.responseDto.programmingLanguageResponseDto.GetAllProgrammingLanguageResponseDto;
import com.example.kodlamaioprogramminglanguage.model.dto.responseDto.programmingLanguageResponseDto.GetProgrammingLanguageByIdResponseDto;
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
    public List<GetAllProgrammingLanguageResponseDto> getAll() {
        return programmingLanguageService.getAll();
    }

    @GetMapping("/{id}")
    public GetProgrammingLanguageByIdResponseDto getProgrammingLanguageById(@PathVariable Long id) {
        return programmingLanguageService.getProgrammingById(id);
    }

    @PostMapping
    public CreateProgrammingLanguageRequestDto createProgrammingLanguage(@Valid @RequestBody CreateProgrammingLanguageRequestDto requestDto) {
        return programmingLanguageService.create(requestDto);
    }

    @PutMapping("/{id}")
    public UpdateProgrammingLanguageRequestDto updateProgrammingLanguage(@Valid @PathVariable Long id, @RequestBody UpdateProgrammingLanguageRequestDto requestDto) {
        return programmingLanguageService.update(id, requestDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        programmingLanguageService.deleteProgrammingLanguageId(id);
    }

}
