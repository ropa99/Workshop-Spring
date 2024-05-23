package se.lexicon.SpringWorkshop.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Component;
import se.lexicon.SpringWorkshop.data_access.StudentDao;
import se.lexicon.SpringWorkshop.exception.StudentNotFoundException;
import se.lexicon.SpringWorkshop.exception.StudentValidationException;
import se.lexicon.SpringWorkshop.models.Student;

@Component
public class StudentManagementConsoleImpl implements StudentManagement{
    List<Student> student;
    UserInputService scannerService;
    StudentDao studentDao;

    public StudentManagementConsoleImpl(UserInputService uci, StudentDao std){
        scannerService = uci;
        studentDao = std;
    }

    @Override
    public Student create() {
        String studentName = scannerService.getString();
        if(studentName.isEmpty() ||  studentName  == null) throw new StudentValidationException("Student cant be null or empty");
        Student st = new Student(studentName);
        return studentDao.save(st);
    }

    @Override
    public Student save(Student student) {
        if(student == null) throw new StudentValidationException("Student cant be null");
        return studentDao.save(student);
    }

    @Override
    public Student find(int id) {
        Optional<Student> st = Optional.ofNullable(studentDao.find(id));
        if(st.isPresent()){
            return st.get();
        }
        throw new StudentNotFoundException("Cant find student with id: " + id);
    }

    @Override
    public Student remove(int id) {


        return find(id);
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public Student edit(Student student) {
        return null;
    }
}
