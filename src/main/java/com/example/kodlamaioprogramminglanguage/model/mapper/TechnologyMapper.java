package com.example.kodlamaioprogramminglanguage.model.mapper;


import com.example.kodlamaioprogramminglanguage.model.dto.requestDto.technologyRequestDto.CreateTechnologyRequestDto;
import com.example.kodlamaioprogramminglanguage.model.dto.requestDto.technologyRequestDto.UpdateTechnologyRequestDto;
import com.example.kodlamaioprogramminglanguage.model.dto.responseDto.technologyResponseDto.GetAllTechnologyResponseDto;
import com.example.kodlamaioprogramminglanguage.model.dto.responseDto.technologyResponseDto.GetTechnologyByIdResponseDto;
import com.example.kodlamaioprogramminglanguage.model.entity.Technology;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TechnologyMapper {

    TechnologyMapper INSTANCE = Mappers.getMapper(TechnologyMapper.class);

    List<GetAllTechnologyResponseDto> toTechnologyDTOs(List<Technology> technologies);

    GetTechnologyByIdResponseDto toTechnologyDto(Technology technology);

    Technology toCreateTechnologyRequest(CreateTechnologyRequestDto createTechnologyRequestDto);

    void update(@MappingTarget Technology technology, UpdateTechnologyRequestDto updateTechnologyRequestDto);

}
