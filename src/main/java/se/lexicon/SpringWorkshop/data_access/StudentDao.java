package se.lexicon.SpringWorkshop.data_access;

import java.util.List;
import se.lexicon.SpringWorkshop.models.Student;

public interface StudentDao {

    Student save(Student student);
    Student find(int id);
    List<Student> findAll();
    void delete (int id);
}
