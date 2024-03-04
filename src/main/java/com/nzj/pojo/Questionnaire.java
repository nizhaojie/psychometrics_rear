package com.nzj.pojo;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class Questionnaire {
    @NotNull
    private Integer id;//问卷id

    @NotEmpty
    @Pattern(regexp = "^\\S{1,15}$")
    private String name;//问卷名

    @NotEmpty
    @Pattern(regexp = "^\\S{1,50}$")
    private String description;//问卷介绍

    @NotEmpty
    private String organization;//归属于的组织
}
