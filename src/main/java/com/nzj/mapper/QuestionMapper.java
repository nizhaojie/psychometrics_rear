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
            "option2,option3,option4,score1,score2,score3,score4" +
            " values(#{questionnaireId},#{question},#{option1}," +
            "#{option2},#{option3},#{option4},#{score1},#{score2},#{score3},#{score4})")
    void add(Question question);

    //更新题目
    @Update("update question set question=#{question},option1=#{option1}," +
            "option2=#{option2},option3=#{option3},option4=#{option4}," +
            "score1=#{score1},score2=#{score2},score3=#{score3},score4=#{score4} where id=#{id}")
    void update(Question question);

    //删除题目
    @Delete("delete from question where id=#{id}")
    void delete(Integer id);
}
