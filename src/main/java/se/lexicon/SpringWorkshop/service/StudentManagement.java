package se.lexicon.SpringWorkshop.service;

import java.util.List;
import se.lexicon.SpringWorkshop.models.Student;

public interface StudentManagement {
    Student create();
    Student save(Student student);
    Student find(int id);
    Student remove(int id);
    List<Student> findAll();
    Student edit(Student student);
}
