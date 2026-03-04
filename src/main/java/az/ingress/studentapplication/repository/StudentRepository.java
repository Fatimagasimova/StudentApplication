package az.ingress.studentapplication.repository;

import az.ingress.studentapplication.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class StudentRepository {

    public HashMap<Long, Student> students = new HashMap<>();

    public String saveStudent(Student student) {
    if(students.containsKey(student.getId())) {
        return "Student with id: " + student.getId() + " already exists";
    }
    else {
        students.put(student.getId(), student);
    }
    return "Student created successfully";
    }

    public Student getStudentById(Long id) {
        Student student = students.get(id);
        return student;
    }

    public ArrayList<Student> getAllStudents() {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.addAll(students.values());
        return studentArrayList;
    }

    public Student updateStudent(long id, Student student) {
        if (students.containsKey(id)) {
            student.setId(id);
            students.put(id, student);
            return student;
        }
        else {
            System.out.println("Student with id: " + id + " does not exist");
        }
        return null;
    }

    public Student deleteStudentById(long id) {
        if (students.containsKey(id)) {
            students.remove(id);
        }
        else {
            System.out.println("Student with id: " + id + " does not exist");
        }
        return null;
    }

}
