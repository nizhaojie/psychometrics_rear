package com.nzj.mapper;

import com.nzj.pojo.Record;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface RecordMapper {
    //根据用户id获取测评记录
    @Select("select * from record where user_id=#{userId} order by id desc")
    List<Record> findByUser(Integer userId);

    @Select("select * from record where organization=#{organization} order by id desc limit 100")
    List<Record> findByOrganization(String organization);

    //添加测评记录
    @Insert("insert into record(user_id,questionnaire_name,time,score,report,username,organization,state)" +
            " values(#{userId},#{questionnaireName},#{time},#{score},#{report},#{username},#{organization},#{state})")
    void add(Record record);

    //删除某人的测评记录(可能只用于测试)
    @Delete("delete from record where user_id=#{userId}")
    void delete(Record record);

    @Select("select * from record where organization=#{organization} and username like concat('%',#{username},'%') order by id desc")
    List<Record> findByUserName(String username, String organization);

    @Select("select * from record where organization=#{organization} and questionnaire_name like concat('%',#{questionnaireName},'%') order by id desc")
    List<Record> findByQuestionnaireName(String questionnaireName, String organization);

    @Select("select * from record where organization=#{organization} and time like concat('%',#{time},'%') order by id desc")
    List<Record> findByTime(String time, String organization);

    @Select("select * from record where organization=#{organization} and state=1 order by id desc")
    List<Record> findPass(String organization);

    @Select("select * from record where organization=#{organization} and state=0 order by id desc")
    List<Record> findFail(String organization);

    @Select("select * from record where organization=#{organization} and seen=1 order by id desc")
    List<Record> findSeen(String organization);

    @Select("select * from record where organization=#{organization} and seen=0 order by id desc")
    List<Record> findNotSeen(String organization);

    @Update("update record set seen=1 where id=#{id}")
    void update(Integer id);
}
