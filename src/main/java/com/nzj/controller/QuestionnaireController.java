package com.nzj.controller;

import com.nzj.pojo.Questionnaire;
import com.nzj.pojo.Result;
import com.nzj.service.QuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questionnaire")
public class QuestionnaireController {
    @Autowired
    private QuestionnaireService questionnaireService;

    @GetMapping
    public Result<List<Questionnaire>> findByOrganization(@RequestParam("organization") String organization) {
        List<Questionnaire> questionnaires = questionnaireService.findByOrganization(organization);
        return Result.success(questionnaires);
    }

    @PostMapping
    public Result add(@RequestBody Questionnaire questionnaire) {
        questionnaireService.add(questionnaire);
        return Result.success();
    }

    @PutMapping
    public Result update(@RequestBody Questionnaire questionnaire) {
        questionnaireService.update(questionnaire);
        return Result.success();
    }

    @DeleteMapping
    public Result delete(Integer id) {
        questionnaireService.deleteById(id);
        return Result.success();
    }
}
