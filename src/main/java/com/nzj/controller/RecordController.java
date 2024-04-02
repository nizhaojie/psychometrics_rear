package com.nzj.controller;

import com.nzj.pojo.Record;
import com.nzj.pojo.Result;
import com.nzj.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/record")
public class RecordController {
    @Autowired
    private RecordService recordService;

    @GetMapping
    public Result<List<Record>> findByUser(@RequestParam("userId") Integer userId) {
        List<Record> records = recordService.findByUser(userId);
        return Result.success(records);
    }

    @PostMapping
    public Result add(@RequestBody Record record) {
        recordService.add(record);
        return Result.success();
    }

//    测试用
    @DeleteMapping
    public Result delete(Record record) {
        recordService.delete(record);
        return Result.success();
    }

    @GetMapping("/username")
    public Result<List<Record>> findByUserName(@RequestParam("username") String username, @RequestParam("organization") String organization) {
        List<Record> records = recordService.findByUserName(username,organization);
        return Result.success(records);
    }

    @GetMapping("/questionnaireName")
    public Result<List<Record>> findByQuestionnaireName(@RequestParam("questionnaireName") String questionnaireName, @RequestParam("organization") String organization) {
        List<Record> records = recordService.findByQuestionnaireName(questionnaireName,organization);
        return Result.success(records);
    }

    @GetMapping("/time")
    public Result<List<Record>> findByTime(@RequestParam("time") String time, @RequestParam("organization") String organization) {
        List<Record> records = recordService.findByTime(time,organization);
        return Result.success(records);
    }
}
