package se.lexicon.SpringWorkshop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.SpringWorkshop.config.ComponentScanConfig;
import se.lexicon.SpringWorkshop.data_access.StudentDao;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        StudentDao studentDao = context.getBean(StudentDao.class);

    }
}
