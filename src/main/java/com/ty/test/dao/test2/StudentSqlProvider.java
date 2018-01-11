package com.ty.test.dao.test2;

import com.ty.test.model.Student;
import org.apache.ibatis.jdbc.SQL;

public class StudentSqlProvider {

    public String insertSelective(Student record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("student");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }
}