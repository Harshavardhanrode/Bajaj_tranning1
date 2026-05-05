import com.training.dao.CityJDBCTemplate;
import com.training.dao.StateJDBCTemplate;
import com.training.dao.StudentJDBCTemplate;
import com.training.entity.States;
import com.training.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
      StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
//        studentJDBCTemplate.create("Ravi", 35);
//        studentJDBCTemplate.create("Vijay", 25);
//         studentJDBCTemplate.create("Suresh", 30);


//        List<Student>students = studentJDBCTemplate.listStudents();
//        for(Student s:students){
//            System.out.println("id :"+ s.getId()+" name :"+ s.getName()+ " Age :"+s.getAge());
//        }







        StateJDBCTemplate stateJDBCTemplate = (StateJDBCTemplate) context.getBean("stateJDBCTemplate");
        //stateJDBCTemplate.createState(102,"maharashtra",45555,"delhi");
//        stateJDBCTemplate.createState(103,"tamilnadu",45555,"katmandu");
//        stateJDBCTemplate.createState(104,"haidrabad",45555,"bandlore");
//        stateJDBCTemplate.createState(105,"Mp",45555,"bhopal");
        //stateJDBCTemplate.deleteState(102);

        CityJDBCTemplate cityJDBCTemplate = (CityJDBCTemplate) context.getBean("cityJDBCTemplate");
        //cityJDBCTemplate.createCity(1,"kolhapur",102,9000);
        cityJDBCTemplate.changePopulation(2,50000);

//        cityJDBCTemplate.createCity(2,"uvw",103,9000);
//        cityJDBCTemplate.createCity(3,"abc",104,9000);
//        cityJDBCTemplate.createCity(4,"xyz",105,9000);
            //cityJDBCTemplate.deleteCity(1);

                States s =  stateJDBCTemplate.searchState(103);
                System.out.println(s);


    }
}