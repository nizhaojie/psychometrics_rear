package com.nzj.service;

import com.nzj.pojo.Record;

import java.util.List;

public interface RecordService {
    //根据用户id获取测评记录
    List<Record> findByUser(Integer userId);

    List<Record> findByOrganization(String organization);

    //添加测评记录
    void add(Record record);

    //删除某人的测评记录(可能只用于测试)
    void delete(Record record);

    List<Record> findByUserName(String username, String organization);

    List<Record> findByQuestionnaireName(String questionnaireName, String organization);

    List<Record> findByTime(String time, String organization);

    List<Record> findPass(String organization);

    List<Record> findFail(String organization);

    List<Record> findSeen(String organization);

    List<Record> findNotSeen(String organization);

    void update(Integer id);
}
