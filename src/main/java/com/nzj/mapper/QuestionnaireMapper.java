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
    @Insert("insert into questionnaire(name,description,organization,tag,lowerlimit1,upperlimit1,result1," +
            "lowerlimit2,upperlimit2,result2,lowerlimit3,upperlimit3,result3,lowerlimit4,upperlimit4,result4," +
            "lowerlimit5,upperlimit5,result5) values(#{name},#{description},#{organization},#{tag},#{lowerlimit1}," +
            "#{upperlimit1},#{result1},#{lowerlimit2},#{upperlimit2},#{result2},#{lowerlimit3},#{upperlimit3}," +
            "#{result3},#{lowerlimit4},#{upperlimit4},#{result4},#{lowerlimit5},#{upperlimit5},#{result5})")
    void add(Questionnaire questionnaire);

    //更新问卷
    @Update("update questionnaire set name=#{name},description=#{description}," +
            "organization=#{organization},tag=#{tag},lowerlimit1=#{lowerlimit1},upperlimit1=#{upperlimit1},result1=#{result1}," +
            "lowerlimit2=#{lowerlimit2},upperlimit2=#{upperlimit2},result2=#{result2},lowerlimit3=#{lowerlimit3}," +
            "upperlimit3=#{upperlimit3},result3=#{result3},lowerlimit4=#{lowerlimit4},upperlimit4=#{upperlimit4}," +
            "result4=#{result4},lowerlimit5=#{lowerlimit5},upperlimit5=#{upperlimit5},result5=#{result5} where id=#{id}")
    void update(Questionnaire questionnaire);

    //删除问卷
    @Delete("delete from questionnaire where id=#{id}")
    void deleteById(Integer id);
}
