package az.ingress.studentapplication.service;

import az.ingress.studentapplication.entity.Student;
import az.ingress.studentapplication.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {

    private final StudentRepository studentRepository = new StudentRepository();

    public String saveStudent(Student student) {
        return studentRepository.saveStudent(student);
    }

    public Student getStudentById(Long id) {
        return studentRepository.getStudentById(id);
    }

    public ArrayList<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    public Student updateStudent(long id, Student student) {
        return studentRepository.updateStudent(id, student);
    }

    public Student deleteStudentById(long id) {
        return studentRepository.deleteStudentById(id);
    }
}
