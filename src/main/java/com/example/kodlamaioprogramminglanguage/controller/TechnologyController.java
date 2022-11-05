package com.example.kodlamaioprogramminglanguage.controller;

import com.example.kodlamaioprogramminglanguage.model.dto.ProgrammingLanguageResponseDto;
import com.example.kodlamaioprogramminglanguage.model.dto.TechnologyRequestDto;
import com.example.kodlamaioprogramminglanguage.model.dto.TechnologyResponseDto;
import com.example.kodlamaioprogramminglanguage.model.entity.ProgrammingLanguage;
import com.example.kodlamaioprogramminglanguage.service.TechnologyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/technology")
@RequiredArgsConstructor
public class TechnologyController {
    private final TechnologyService technologyService;

    @GetMapping
    public List<TechnologyResponseDto> getAll() {
        return technologyService.getAll();
    }

    @GetMapping("/{id}")
    public TechnologyResponseDto getTechnologyById(@PathVariable Long id) {
        return (technologyService.getById(id));
    }

    @PostMapping
    public void createTechnology(@Valid @RequestBody TechnologyRequestDto requestDto) {
        technologyService.create(requestDto);
    }

    @PutMapping("/{id}")
    public void updateTechnology(@Valid @PathVariable Long id, @RequestBody TechnologyRequestDto requestDto) {
        technologyService.update(id, requestDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        technologyService.deleteTechnologyById(id);
    }
}
