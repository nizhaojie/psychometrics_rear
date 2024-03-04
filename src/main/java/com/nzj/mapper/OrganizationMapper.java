package com.nzj.mapper;

import com.nzj.pojo.Organization;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface OrganizationMapper {
    //获取所有组织信息
    @Select("select * from organization")
    List<Organization> list();
}
