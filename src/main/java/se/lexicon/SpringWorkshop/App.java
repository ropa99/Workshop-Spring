package se.lexicon.SpringWorkshop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.SpringWorkshop.config.ComponentScanConfig;
import se.lexicon.SpringWorkshop.data_access.StudentDao;
import se.lexicon.SpringWorkshop.models.Student;
import se.lexicon.SpringWorkshop.service.StudentManagement;
import se.lexicon.SpringWorkshop.service.UserInputService;

/**
 *
 *
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        StudentDao studentDao = context.getBean(StudentDao.class);
        UserInputService userInputService =context. getBean (UserInputService.class) ;
        StudentManagement smanage = context.getBean(StudentManagement.class);
        Student st = smanage.create();
        Student st2 = smanage.create();
        Student st3 = smanage.create();
        studentDao.findAll().forEach(System.out::println);
        studentDao.delete(2);
        studentDao.findAll().forEach(System.out::println);

    }
}
