package com.training.dao;

import com.training.entity.Student;

import javax.sql.DataSource;
import java.util.List;

public interface StudentDAO {
    public void setDataSource(DataSource ds);
    public void create( String name,Integer age);

    public List<Student> listStudents();
}
