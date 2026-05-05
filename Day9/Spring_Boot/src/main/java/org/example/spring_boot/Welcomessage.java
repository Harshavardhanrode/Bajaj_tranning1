package org.example.spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Welcomessage {


    // share metadata to user
    @Autowired
    private Metadata data;

    @GetMapping("/metadata")
    public Metadata getApplicationdata(){
        return data;
    }
    @GetMapping("/metadata1")
    public String getApplicationdata1(){
        return data.toString();
    }




    @GetMapping("/welcome")
    public String Welcome()
    {        return "<h1>Welcome</h1>";
    }

    @GetMapping("/getlink")
    public String Getlink()
    {        return "<br><a href='http://localhost:8080/employees'>list of employees</h1>";
    }

    @GetMapping("/employees")
    public String getEmployees()
    {
        ArrayList<Emoloyee> employees = new ArrayList<>();
        employees.add(new Emoloyee(1,"John", 50000));
        employees.add(new Emoloyee(2,"Jane", 60000));
        employees.add(new Emoloyee(3,"Doe", 55000));

//        String table = "<table border=\"1\">\n" +
//                "  <tr>\n" +
//                "    <th>id</th>\n" +
//                "    <th>Name</th>\n" +
//                "   <th>Salary</th>\n"+
//                "  </tr>\n";
////        for(Emoloyee e:employees){
////            table += "<tr>\n" +
////                    " <td>"+e.getId()+"</td>\n" +
////                    " <td>"+e.getName()+"</td>\n" +
////                    " <td>"+e.getSalary()+"</td>\n" +
////                    "  </tr>";
////
////        }
//
//        table+="</table>";

        StringBuilder table = new StringBuilder();
        table.append("<table border=\"1\">")
                .append("<tr>")
                .append("<th>Id</th>")
                .append("<th>Name</th>")
                .append("<th>Salary</th>")
                .append("</tr>");

        employees.forEach(e -> {
            table.append("<tr>")
                    .append("<td>").append(e.getId()).append("</td>")
                    .append("<td>").append(e.getName()).append("</td>")
                    .append("<td>").append(e.getSalary()).append("</td>")
                    .append("</tr>");
        });

        table.append("</table>");

        return table.toString();

    }
}
