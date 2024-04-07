package com.nzj.controller;

import com.nzj.pojo.Guidance;
import com.nzj.pojo.Result;
import com.nzj.service.GuidanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/guidance")
public class GuidanceController {
    @Autowired
    private GuidanceService guidanceService;

    @GetMapping("/giver")
    public Result<List<Guidance>> findByGiver(@RequestParam("giver") String giver) {
        List<Guidance> guidances = guidanceService.findByGiver(giver);
        return Result.success(guidances);
    }

    @GetMapping("/receiver")
    public Result<List<Guidance>> findByReceiver(@RequestParam("receiver") String receiver) {
        List<Guidance> guidances = guidanceService.findByReceiver(receiver);
        return Result.success(guidances);
    }

    @PostMapping
    public Result add(@RequestBody Guidance guidance) {
        guidanceService.add(guidance);
        return Result.success();
    }

    @PutMapping
    public Result update(@RequestParam("id") Integer id) {
        guidanceService.update(id);
        return Result.success();
    }

    @DeleteMapping
    public Result delete(@RequestParam("id") Integer id) {
        guidanceService.delete(id);
        return Result.success();
    }
}
