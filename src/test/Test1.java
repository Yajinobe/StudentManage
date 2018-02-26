import com.biz.std.model.Student;
import com.biz.std.service.StudentService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test1 {


    ApplicationContext applicationContext;
    StudentService studentService;

    @Before
    public void init(){
        applicationContext = new ClassPathXmlApplicationContext("spring/spring.xml");
        studentService = applicationContext.getBean(StudentService.class);
    }

    @After
    public void tearDown(){
        applicationContext = null;
    }

    @Test
    public void testStudentService(){
        List<Student> list = studentService.findAll();
        System.out.println(list);
    }

}
