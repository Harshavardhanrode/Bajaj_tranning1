import com.training.org.model.Car;
import com.training.org.model.Customer;
import com.training.org.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Customer cust = (Customer) context.getBean("customerBean");
//        System.out.println(cust);


//        Employee emp = (Employee) context.getBean("empBean");
//        System.out.println(emp);





        Car c1=(Car)context.getBean("carBean");
        System.out.println(c1);

    }
}