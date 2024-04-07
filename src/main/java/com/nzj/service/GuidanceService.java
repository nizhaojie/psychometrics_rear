package com.nzj.service;

import com.nzj.pojo.Guidance;

import java.util.List;

public interface GuidanceService {
    List<Guidance> findByGiver(String giver);

    List<Guidance> findByReceiver(String receiver);

    void add(Guidance guidance);

    void update(Integer id);

    void delete(Integer id);
}
