package com.nzj.service.impl;

import com.nzj.mapper.OrganizationMapper;
import com.nzj.pojo.Organization;
import com.nzj.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationServiceImpl implements OrganizationService {
    @Autowired
    private OrganizationMapper organizationMapper;

    @Override
    public List<Organization> list(){
        List<Organization> organizations = organizationMapper.list();
        return organizations;
    }
}
