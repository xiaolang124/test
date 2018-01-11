package com.ty.test.dao.test2;

import com.ty.test.model.Student;
import org.apache.ibatis.annotations.*;

public interface StudentMapper {
    @Delete({
        "delete from student",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into student (id)",
        "values (#{id,jdbcType=INTEGER})"
    })
    int insert(Student record);

    @InsertProvider(type=StudentSqlProvider.class, method="insertSelective")
    int insertSelective(Student record);

    @Select({
            "select count(*) from student"
    })
    int countStudentNum();
}