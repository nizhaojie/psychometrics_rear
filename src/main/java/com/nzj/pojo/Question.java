package com.nzj.pojo;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class Question {
    @NotNull
    private Integer id;//主键题目id

    @NotNull
    private Integer questionnaireId;//对应的问卷id

    @NotEmpty
    @Pattern(regexp = "^\\S{1,50}$")
    private String question;//题干

    @NotEmpty
    @Pattern(regexp = "^\\S{1,20}$")
    private String option1;//选项1

    @NotEmpty
    @Pattern(regexp = "^\\S{1,20}$")
    private String option2;//选项2

    @NotEmpty
    @Pattern(regexp = "^\\S{1,20}$")
    private String option3;//选项3

    @NotEmpty
    @Pattern(regexp = "^\\S{1,20}$")
    private String option4;//选项4

    @NotNull
    private Integer score1;//选项1分值

    @NotNull
    private Integer score2;//选项2分值

    @NotNull
    private Integer score3;//选项3分值

    @NotNull
    private Integer score4;//选项4分值

}
