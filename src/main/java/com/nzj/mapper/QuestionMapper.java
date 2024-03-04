package com.nzj.mapper;

import com.nzj.pojo.Question;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface QuestionMapper {
    //根据问卷id查找题目
    @Select("select * from question where questionnaire_id=#{questionnaireId}")
    List<Question> findByQuestionnaire(Integer questionnaireId);

    //添加题目
    @Insert("insert into question(questionnaire_id,question,option1," +
            "option2,option3,option4,right_option,score" +
            " values(#{questionnaireId},#{question},#{option1}," +
            "#{option2},#{option3},#{option4},#{rightOption},#{score},)")
    void add(Question question);

    //更新题目
    @Update("update question set question=#{question},option1=#{option1}," +
            "option2=#{option2},option3=#{option3},option4=#{option4}," +
            "right_option=#{rightOption},score=#{score} where id=#{id}")
    void update(Question question);

    //删除题目
    @Delete("delete from question where id=#{id}")
    void delete(Integer id);
}
