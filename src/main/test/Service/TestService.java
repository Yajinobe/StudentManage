import com.biz.std.model.Student;
import com.biz.std.service.StudentService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestService {

    private ApplicationContext ctx;
    private StudentService studentService;

    @Before
    public void init(){
        ctx = new ClassPathXmlApplicationContext("spring/spring.xml");
        studentService = ctx.getBean(StudentService.class);
    }

    @After
    public void tearDown(){
        ctx = null;
    }

    @Test
    public void test1(){
        List<Student> list = studentService.findAll();
        System.out.println(list);
    }

    @Test
    public void test2(){

    }

}
