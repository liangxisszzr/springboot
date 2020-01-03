package com.eastnorth.repository;

import com.eastnorth.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: zuojianhou
 * @Date: 2020/1/3
 * @Description:
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Long, Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1L, new Student(1L, "张三", 23));
        studentMap.put(2L, new Student(2L, "李四", 24));
        studentMap.put(3L, new Student(3L, "王五", 25));
    }

    @Override
    public Collection<Student> getAll() {
        return studentMap.values();
    }

    @Override
    public Student getById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
