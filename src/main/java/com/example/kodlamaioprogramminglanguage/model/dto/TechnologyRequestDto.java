package com.example.kodlamaioprogramminglanguage.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotBlank;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class TechnologyRequestDto {

    @NotBlank(message = "name cannot be entered blank")
    private String name;


}
