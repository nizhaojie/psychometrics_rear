package com.nzj.service;

import com.nzj.pojo.Questionnaire;

import java.util.List;

public interface QuestionnaireService {
    //根据归属的组织名查询问卷
    List<Questionnaire> findByOrganization(String organization);

    //创建问卷
    void add(Questionnaire questionnaire);

    //更新问卷
    void update(Questionnaire questionnaire);

    //删除问卷
    void deleteById(Integer id);
}
