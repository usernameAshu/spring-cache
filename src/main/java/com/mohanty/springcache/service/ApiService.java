package com.mohanty.springcache.service;

import com.mohanty.springcache.exception.StudentNotFoundException;
import com.mohanty.springcache.model.Address;
import com.mohanty.springcache.model.Major;
import com.mohanty.springcache.model.Student;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ApiService {

    @Cacheable(cacheNames = "fetchCache", key = "'StudentInCache'+ #studentId")
    public Student fetchStudent(String studentId) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException exp) {
            exp.printStackTrace();
        }

        List<Student> studentList = Arrays.asList(new Student("19VC21", "John", "Wayne", "11",
                        new Address("12A", "Bay Avenue", "SanFrancisco", "CA", "91234"), Major.MATHS),
                new Student("19VC22", "Mary", "Jane", "11",
                        new Address("10A", "Cross Avenue", "SanFrancisco", "CA", "91238"), Major.CHEMISTRY),
                new Student("19VC23", "Peter", "Parker", "11",
                        new Address("1A", "First Avenue", "SanFrancisco", "CA", "91934"), Major.PHYSICS));

        Student studentResult = studentList
                                .stream()
                                .filter(student -> student.getId().equalsIgnoreCase(studentId))
                                .findFirst()
                                .orElseThrow(() -> new StudentNotFoundException("Student ID not valid"));
        return studentResult;
    }
}
