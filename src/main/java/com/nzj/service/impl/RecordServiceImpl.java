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
}
