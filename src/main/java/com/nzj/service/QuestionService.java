package com.nzj.service;

import com.nzj.pojo.Question;

import java.util.List;

public interface QuestionService {
    //根据问卷id查找题目
    List<Question> findByQuestionnaire(Integer questionnaireId);

    //添加题目
    void add(Question question);

    //更新题目
    void update(Question question);

    //删除题目
    void delete(Integer id);
}
