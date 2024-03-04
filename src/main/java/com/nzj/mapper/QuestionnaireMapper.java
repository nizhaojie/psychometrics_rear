package com.nzj.mapper;

import com.nzj.pojo.Questionnaire;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface QuestionnaireMapper {
    //根据归属的组织名查询问卷
    @Select("select * from questionnaire where organization=#{organization}")
    List<Questionnaire> findByOrganization(String organization);

    //创建问卷
    @Insert("insert into questionnaire(name,description,organization)" +
            " values(#{name},#{description},#{organization})")
    void add(Questionnaire questionnaire);

    //更新问卷
    @Update("update questionnaire set name=#{name},description=#{description}," +
            "organization=#{organization} where id=#{id}")
    void update(Questionnaire questionnaire);

    //删除问卷
    @Delete("delete from questionnaire where id=#{id}")
    void deleteById(Integer id);
}
