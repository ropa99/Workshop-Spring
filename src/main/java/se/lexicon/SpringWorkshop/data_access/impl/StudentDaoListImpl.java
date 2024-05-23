package se.lexicon.SpringWorkshop.data_access.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Component;
import se.lexicon.SpringWorkshop.data_access.StudentDao;
import se.lexicon.SpringWorkshop.models.Student;

@Component
public class StudentDaoListImpl implements StudentDao {
    List<Student> students;

    public StudentDaoListImpl() {
        this.students = new ArrayList<>();
    }

    @Override
    public Student save(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public Student find(int id) {
        Optional<Student> st = students.stream()
                .filter(student -> student.getId() == id)
                .findFirst();
        return st.orElse(null);
    }

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public void delete(int id) {
        List<Student> newStudents = new ArrayList<>(students.size()-1);
        for(Student st : students ){
            if(st.getId()!=id){
                newStudents.add(st);
            }
        }
        students = newStudents;
    }
}
