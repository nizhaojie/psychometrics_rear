package com.nzj.service.impl;

import com.nzj.mapper.QuestionnaireMapper;
import com.nzj.pojo.Questionnaire;
import com.nzj.service.QuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionnaireServiceImpl implements QuestionnaireService {
    @Autowired
    private QuestionnaireMapper questionnaireMapper;

    @Override
    public List<Questionnaire> findByOrganization(String organization) {
        List<Questionnaire> questionnaires = questionnaireMapper.findByOrganization(organization);
        return questionnaires;
    }

    @Override
    public List<Questionnaire> findById(Integer id) {
        List<Questionnaire> questionnaires = questionnaireMapper.findById(id);
        return questionnaires;
    }

    @Override
    public void add(Questionnaire questionnaire) { questionnaireMapper.add(questionnaire); }

    @Override
    public void update(Questionnaire questionnaire) {
        questionnaireMapper.update(questionnaire);
    }

    @Override
    public void deleteById(Integer id) {
        questionnaireMapper.deleteById(id);
    }


}
