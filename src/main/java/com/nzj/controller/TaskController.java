package com.nzj.controller;

import com.nzj.pojo.Result;
import com.nzj.pojo.Task;
import com.nzj.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/giver")
    public Result<List<Task>> findByGiver(@RequestParam("giver") String giver) {
        List<Task> tasks = taskService.findByGiver(giver);
        return Result.success(tasks);
    }

    @GetMapping("/receiver")
    public Result<List<Task>> findByReceiver(@RequestParam("receiver") String receiver) {
        List<Task> tasks = taskService.findByReceiver(receiver);
        return Result.success(tasks);
    }

    @PostMapping("/add")
    public Result add(@RequestBody List<Task> taskList) {
        for(Task task : taskList) {
            taskService.add(task);
        }
        return Result.success();
    }

    @GetMapping("/update")
    public Result update(@RequestParam("id") Integer id) {
        taskService.update(id);
        return Result.success();
    }

    @DeleteMapping
    public Result delete(@RequestParam("id") Integer id) {
        taskService.delete(id);
        return Result.success();
    }
}
