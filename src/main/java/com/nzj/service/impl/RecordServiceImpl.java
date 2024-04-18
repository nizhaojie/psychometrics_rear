package com.nzj.service.impl;

import com.nzj.mapper.RecordMapper;
import com.nzj.pojo.Record;
import com.nzj.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {
    @Autowired
    private RecordMapper recordMapper;

    @Override
    public List<Record> findByUser(Integer userId) {
        List<Record> records = recordMapper.findByUser(userId);
        return records;
    }

    @Override
    public void add(Record record) {
        recordMapper.add(record);
    }

    @Override
    public void delete(Record record) {
        recordMapper.delete(record);
    }

    @Override
    public List<Record> findByUserName(String username, String organization) {
        List<Record> records = recordMapper.findByUserName(username,organization);
        return records;
    }

    @Override
    public List<Record> findByQuestionnaireName(String questionnaireName, String organization) {
        List<Record> records = recordMapper.findByQuestionnaireName(questionnaireName,organization);
        return records;
    }

    @Override
    public List<Record> findByTime(String time, String organization) {
        List<Record> records = recordMapper.findByTime(time,organization);
        return records;
    }

    @Override
    public List<Record> findPass(String organization) {
        List<Record> records = recordMapper.findPass(organization);
        return records;
    }

    @Override
    public List<Record> findFail(String organization) {
        List<Record> records = recordMapper.findFail(organization);
        return records;
    }

    @Override
    public List<Record> findSeen(String organization) {
        List<Record> records = recordMapper.findSeen(organization);
        return records;
    }

    @Override
    public List<Record> findNotSeen(String organization) {
        List<Record> records = recordMapper.findNotSeen(organization);
        return records;
    }

    @Override
    public void update(Integer id) {
        recordMapper.update(id);
    }
}
