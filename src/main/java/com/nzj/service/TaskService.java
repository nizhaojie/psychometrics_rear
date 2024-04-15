package com.nzj.service;

import com.nzj.pojo.Task;

import java.util.List;

public interface TaskService {
    List<Task> findByGiver(String giver);

    List<Task> findByReceiver(String receiver);

    void add(Task task);

    void update(Integer id);

    void delete(Integer id);
}
