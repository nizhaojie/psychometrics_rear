package com.nzj.service.impl;

import com.nzj.mapper.TaskMapper;
import com.nzj.pojo.Task;
import com.nzj.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskMapper taskMapper;

    @Override
    public List<Task> findByGiver(String giver) {
        List<Task> tasks = taskMapper.findByGiver(giver);
        return tasks;
    }

    @Override
    public List<Task> findByReceiver(String receiver) {
        List<Task> tasks = taskMapper.findByReceiver(receiver);
        return tasks;
    }

    @Override
    public void add(Task task) {
        taskMapper.add(task);
    }

    @Override
    public void update(Integer id) {
        taskMapper.update(id);
    }

    @Override
    public void delete(Integer id) {
        taskMapper.delete(id);
    }
}
