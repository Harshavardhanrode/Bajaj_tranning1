package com.training.dao;

import com.training.entity.Student;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class StudentJDBCTemplate  implements StudentDAO{
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    @Override
    public void setDataSource(DataSource ds) {
        this.dataSource = ds;
        jdbcTemplateObject = new JdbcTemplate(ds);
    }

    @Override
    public void create(String name, Integer age) {
        String sql = "insert into student1(name ,age)values (?,?)";
        jdbcTemplateObject.update(sql,name,age);
        System.out.println("Created Record Name = " + name + " Age = " + age);
    }

    @Override
    public List<Student> listStudents() {
        String sql  = "select * from student1";
        List<Student> students = jdbcTemplateObject.query(sql, new StudentMapper());
        return students;

    }
}
