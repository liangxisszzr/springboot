package com.eastnorth.repository;

import com.eastnorth.entity.Student;

import java.util.Collection;

/**
 * @Auther: zuojianhou
 * @Date: 2020/1/3
 * @Description:
 */
public interface StudentRepository {
    Collection<Student> getAll();
    Student getById(long id);
    void saveOrUpdate(Student student);
    void deleteById(long id);
}
