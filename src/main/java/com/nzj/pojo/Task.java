package com.nzj.pojo;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class Task {
    @NotNull
    private Integer id;//主键ID

    @NotEmpty
    @Pattern(regexp = "^\\S{1,20}$")
    private String giver;//管理员用户名

    @NotEmpty
    @Pattern(regexp = "^\\S{1,20}$")
    private String receiver;//管理员用户名

    @NotNull
    private Integer questionnaireId;//问卷id

    @NotEmpty
    @Pattern(regexp = "^\\S{1,15}$")
    private String questionnaireName;//问卷名

    @NotEmpty
    @Pattern(regexp = "^\\S{1,20}$")
    private String time;//时间

    @NotNull
    private Integer state;//状态,0未做,1已做
}