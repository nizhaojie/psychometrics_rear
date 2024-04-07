package com.nzj.mapper;

import com.nzj.pojo.Guidance;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface GuidanceMapper {
//    根据管理员筛选
    @Select("select * from guidance where giver=#{giver}")
    List<Guidance> findByGiver(String giver);

//    根据用户筛选
    @Select("select * from guidance where receiver=#{receiver}")
    List<Guidance> findByReceiver(String receiver);

//    添加指导建议
    @Insert("insert into guidance(giver,receiver,content,time) values(#{giver},#{receiver},#{content},#{time})")
    void add(Guidance guidance);

//    修改已读状态
    @Update("update guidance set state=1 where id=#{id}")
    void update(Integer id);

//    删除指导建议
    @Delete("delete from guidance where id=#{id}")
    void delete(Integer id);
}
