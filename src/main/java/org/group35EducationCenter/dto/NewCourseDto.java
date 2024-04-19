package org.group35educationcenter.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class NewCourseDto {

    @NotNull
    @NotBlank
    @NotEmpty
    @Size(max = 20)
    private String title;

    @NotNull
    @NotBlank
    @Size(max = 20)
    private String description;


    private String beginDate;
    private String endDate;

    @Min(value = 0)
    @Max(value = 1000)
    private Double price;
}
