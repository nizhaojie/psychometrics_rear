package com.nzj.pojo;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Record {
    @NotNull
    private Integer id;

    @NotNull
    private Integer userId;

    @NotEmpty
    private String questionnaireName;

    @NotEmpty
    private String time;

    @NotEmpty
    private Integer score;

    @NotEmpty
    private String report;

    @NotEmpty
    private String username;

    @NotEmpty
    private String organization;

    @NotNull
    private Integer state;//1及格,0不及格

    @NotNull
    private Integer seen;//1已读,0未读(只对管理员显示)
}
