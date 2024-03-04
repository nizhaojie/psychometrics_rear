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
    public Result<List<Record>> findByUser(Integer userId) {
        List<Record> records = recordService.findByUser(userId);
        return Result.success(records);
    }

    @PostMapping
    public Result add(Record record) {
        recordService.add(record);
        return Result.success();
    }

    @DeleteMapping
    public Result delete(Record record) {
        recordService.delete(record);
        return Result.success();
    }
}
