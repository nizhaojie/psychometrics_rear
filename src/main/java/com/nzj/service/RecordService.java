package com.nzj.service;

import com.nzj.pojo.Record;

import java.util.List;

public interface RecordService {
    //根据用户id获取测评记录
    List<Record> findByUser(Integer userId);

    //添加测评记录
    void add(Record record);

    //删除某人的测评记录(可能只用于测试)
    void delete(Record record);
}