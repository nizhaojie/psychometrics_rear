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

    @NotEmpty
    private String tag;//问卷标签

    @NotNull
    private Integer lowerlimit1;//区间下限1
    @NotNull
    private Integer upperlimit1;//区间上限1
    @NotEmpty
    private String result1;//区间结果1

    @NotNull
    private Integer lowerlimit2;//区间下限2
    @NotNull
    private Integer upperlimit2;//区间上限2
    @NotEmpty
    private String result2;//区间结果2

    private Integer lowerlimit3;//区间下限3
    private Integer upperlimit3;//区间上限3
    private String result3;//区间结果3
    private Integer lowerlimit4;//区间下限4
    private Integer upperlimit4;//区间上限4
    private String result4;//区间结果4
    private Integer lowerlimit5;//区间下限5
    private Integer upperlimit5;//区间上限5
    private String result5;//区间结果5

}
