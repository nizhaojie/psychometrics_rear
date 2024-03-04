package com.nzj.pojo;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Record {
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
}
