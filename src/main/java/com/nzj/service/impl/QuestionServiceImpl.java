package com.nzj.service.impl;

import com.nzj.mapper.QuestionMapper;
import com.nzj.pojo.Question;
import com.nzj.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionMapper questionMapper;

    @Override
    public List<Question> findByQuestionnaire(Integer questionnaireId) {
        List<Question> questions = questionMapper.findByQuestionnaire(questionnaireId);
        return questions;
    }

    @Override
    public void add(Question question) {
        questionMapper.add(question);
    }

    @Override
    public void update(Question question) {
        questionMapper.update(question);
    }

    @Override
    public void delete(Integer id) {
        questionMapper.delete(id);
    }
}
