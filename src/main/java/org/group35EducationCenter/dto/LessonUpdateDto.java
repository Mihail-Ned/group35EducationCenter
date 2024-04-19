package org.group35educationcenter.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LessonUpdateDto {

    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    @NotBlank
    private String startTime;

    @NotNull
    @NotBlank
    private String finishTime;


    @NotNull
    @NotBlank
    private String dayOfWeek;
}
