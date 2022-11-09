package com.example.kodlamaioprogramminglanguage.model.dto.requestDto.programmingLanguageRequestDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProgrammingLanguageRequestDto {

    @NotBlank(message = "name cannot be entered blank")
    private String name;
}
