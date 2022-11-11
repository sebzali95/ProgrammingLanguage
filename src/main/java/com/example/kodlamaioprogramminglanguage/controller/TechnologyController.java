package com.example.kodlamaioprogramminglanguage.controller;
import com.example.kodlamaioprogramminglanguage.model.dto.requestDto.technologyRequestDto.CreateTechnologyRequestDto;
import com.example.kodlamaioprogramminglanguage.model.dto.requestDto.technologyRequestDto.UpdateTechnologyRequestDto;
import com.example.kodlamaioprogramminglanguage.model.dto.responseDto.technologyResponseDto.GetAllTechnologyResponseDto;
import com.example.kodlamaioprogramminglanguage.model.dto.responseDto.technologyResponseDto.GetTechnologyByIdResponseDto;
import com.example.kodlamaioprogramminglanguage.service.TechnologyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/technologies")
@RequiredArgsConstructor
public class TechnologyController {
    private final TechnologyService technologyService;

    @GetMapping
    public List<GetAllTechnologyResponseDto> getAll() {
        return technologyService.getAll();
    }

    @GetMapping("/{id}")
    public GetTechnologyByIdResponseDto getTechnologyById(@PathVariable Long id) {
        return technologyService.getById(id);
    }

    @PostMapping
    public CreateTechnologyRequestDto createTechnology(@Valid @RequestBody CreateTechnologyRequestDto requestDto) {
       return technologyService.create(requestDto);
    }

    @PutMapping("/{id}")
    public UpdateTechnologyRequestDto updateTechnology(@Valid @PathVariable Long id, @RequestBody UpdateTechnologyRequestDto requestDto) {
     return  technologyService.update(id, requestDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        technologyService.deleteTechnologyById(id);
    }
}
