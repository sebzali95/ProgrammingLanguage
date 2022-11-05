package com.example.kodlamaioprogramminglanguage.model.mapper;

import com.example.kodlamaioprogramminglanguage.model.dto.requestDto.technologyRequestDto.programmingLanguageRequestDto.CreateProgrammingLanguageRequestDto;
import com.example.kodlamaioprogramminglanguage.model.dto.requestDto.technologyRequestDto.programmingLanguageRequestDto.UpdateProgrammingLanguageRequestDto;
import com.example.kodlamaioprogramminglanguage.model.dto.responseDto.programmingLanguageResponseDto.GetAllProgrammingLanguageResponseDto;
import com.example.kodlamaioprogramminglanguage.model.dto.responseDto.programmingLanguageResponseDto.GetProgrammingLanguageByIdResponseDto;
import com.example.kodlamaioprogramminglanguage.model.entity.ProgrammingLanguage;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProgrammingLanguageMapper {


    List<GetAllProgrammingLanguageResponseDto> toLanguageDTOs(List<ProgrammingLanguage> languages);

    GetProgrammingLanguageByIdResponseDto toLanguageDto(ProgrammingLanguage programmingLanguage);

    ProgrammingLanguage toCreateLanguageRequest(CreateProgrammingLanguageRequestDto request);

    void update(@MappingTarget ProgrammingLanguage language, UpdateProgrammingLanguageRequestDto request);

}
