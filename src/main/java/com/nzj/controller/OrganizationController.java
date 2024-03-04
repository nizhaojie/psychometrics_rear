package com.nzj.controller;

import com.nzj.pojo.Organization;
import com.nzj.pojo.Result;
import com.nzj.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/organization")
public class OrganizationController {
    @Autowired
    private OrganizationService organizationService;

    @GetMapping
    public Result<List<Organization>> list() {
        List<Organization> organizations = organizationService.list();
        return Result.success(organizations);
    }
}
