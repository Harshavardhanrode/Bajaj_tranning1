public class main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 101, "HR");
        Employee emp2 = new Employee("Bob", 102, "IT");

        System.out.println(emp1);
        System.out.println(emp2);

        // Accessing components
        System.out.println("Name: " + emp1.name());
        System.out.println("ID: " + emp1.id());
        System.out.println("Department: " + emp1.department());
        emp1.printidname();
        
        
    }
    
}
