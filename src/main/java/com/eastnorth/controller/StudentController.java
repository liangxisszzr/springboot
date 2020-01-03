package com.eastnorth.controller;

import com.eastnorth.entity.Student;
import com.eastnorth.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @Auther: zuojianhou
 * @Date: 2020/1/3
 * @Description:
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/list")
    public Collection<Student> getAll() {
        return studentRepository.getAll();
    }

    @GetMapping("/findById/{id}")
    public Student save(@PathVariable("id") long id) {
        return studentRepository.getById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        studentRepository.saveOrUpdate(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student) {
        studentRepository.saveOrUpdate(student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") long id) {
        studentRepository.deleteById(id);
    }
}
