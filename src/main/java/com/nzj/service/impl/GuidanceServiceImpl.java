package com.nzj.service.impl;

import com.nzj.mapper.GuidanceMapper;
import com.nzj.pojo.Guidance;
import com.nzj.service.GuidanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuidanceServiceImpl implements GuidanceService {

    @Autowired
    private GuidanceMapper guidanceMapper;

    @Override
    public List<Guidance> findByGiver(String giver) {
        List<Guidance> guidances = guidanceMapper.findByGiver(giver);
        return guidances;
    }

    @Override
    public List<Guidance> findByReceiver(String receiver) {
        List<Guidance> guidances = guidanceMapper.findByReceiver(receiver);
        return guidances;
    }

    @Override
    public void add(Guidance guidance) {
        guidanceMapper.add(guidance);
    }

    @Override
    public void update(Integer id) {
        guidanceMapper.update(id);
    }

    @Override
    public void delete(Integer id) {
        guidanceMapper.delete(id);
    }
}
