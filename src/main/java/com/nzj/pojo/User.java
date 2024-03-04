package com.nzj.pojo;



import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

//lombok  在编译阶段,为实体类自动生成setter  getter toString
//pom文件中引入依赖   在实体类上添加注解
@Data
public class User {
    @NotNull
    private Integer id;//主键ID

    @NotEmpty
    private String username;//用户名

    @JsonIgnore//让springmvc把当前对象转换成json字符串的时候,忽略password,最终的json字符串中就没有password这个属性了
    private String password;//密码

    @NotEmpty
    @Pattern(regexp = "^\\S{3,20}$")
    private String nickname;//昵称

    @Email
    private String email;//邮箱

    private String userPic;//用户头像地址

    @NotEmpty
    private String organization;//归属组织的组织名

    @NotNull
    private Integer administrator;//是否为管理员，1为是，0为否

}
