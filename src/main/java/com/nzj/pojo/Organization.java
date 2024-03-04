package com.nzj.pojo;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class Organization {
    @NotNull
    private Integer id;//主键ID

    @NotEmpty
    @Pattern(regexp = "^\\S{1,20}$")
    private String name;//组织名称

    @NotEmpty
    private String description;//组织介绍

    @NotNull
    private Integer amount;//组织人数
}
