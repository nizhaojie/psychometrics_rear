package com.nzj.mapper;

import com.nzj.pojo.Task;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TaskMapper {
    @Select("select * from task where giver=#{giver} order by id desc")
    List<Task> findByGiver(String giver);

    @Select("select * from task where receiver=#{receiver} order by id desc")
    List<Task> findByReceiver(String receiver);

    @Insert("insert into task(giver,receiver,questionnaireId,questionnaireName,time,state) values(#{giver},#{receiver},#{questionnaireId},#{questionnaireName},#{time},#{state})")
    void add(Task task);

    @Update("update task set state=1 where id=#{id}")
    void update(Integer id);

    @Delete("delete from task where id=#{id}")
    void delete(Integer id);
}
