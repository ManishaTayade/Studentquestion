package com.services;


import java.util.List;

import com.model.*;

public interface StudentService
{

    Student saveStudent(Student student);

    List<Student> find(String email);

    Student getStudent(long id);
}
