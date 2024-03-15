package com.nzj.mapper;

import com.nzj.pojo.Record;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RecordMapper {
    //根据用户id获取测评记录
    @Select("select * from record where user_id=#{userId}")
    List<Record> findByUser(Integer userId);

    //添加测评记录
    @Insert("insert into record(user_id,questionnaire_name,time,score,report)" +
            " values(#{userId},#{questionnaireName},#{time},#{score},#{report})")
    void add(Record record);

    //删除某人的测评记录(可能只用于测试)
    @Delete("delete from record where user_id=#{userId}")
    void delete(Record record);
}
