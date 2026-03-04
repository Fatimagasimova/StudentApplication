package az.ingress.studentapplication.controller;


import az.ingress.studentapplication.entity.Student;
import az.ingress.studentapplication.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService =  new StudentService();

    @PostMapping("/create")
    public String createStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/allStudents")
    public ArrayList<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PutMapping("/update/{id}")
    public Student updateStudent(@PathVariable long id, @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }

    @DeleteMapping("delete/{id}")
    public Student deleteStudentById(@PathVariable long id) {
        return studentService.deleteStudentById(id);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
