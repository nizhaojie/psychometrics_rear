package com.nzj.controller;

import com.nzj.pojo.Question;
import com.nzj.pojo.Result;
import com.nzj.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @GetMapping
    public Result<List<Question>> findByQuestionnaire(@RequestParam("questionnaireId") Integer questionnaireId) {
        List<Question> questions = questionService.findByQuestionnaire(questionnaireId);
        return Result.success(questions);
    }

    @PostMapping
    public Result add(@RequestBody Question question) {
        questionService.add(question);
        return Result.success();
    }

    @PutMapping
    public Result update(@RequestBody Question question) {
        questionService.update(question);
        return Result.success();
    }

    @DeleteMapping
    public Result delete(Integer id) {
        questionService.delete(id);
        return Result.success();
    }
}
