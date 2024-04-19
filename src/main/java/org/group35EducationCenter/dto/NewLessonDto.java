package org.group35educationcenter.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class NewLessonDto {

    private long existLessonId;

    @NotNull
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
