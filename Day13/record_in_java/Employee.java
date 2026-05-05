public record Employee(String name, int id, String department) {
    // You can add methods or static members here if needed

    public void printidname() {
        // Example method to calculate salary based on department
        System.out.println("Employee ID: " + id + ", Name: " + name);
        
       
    }
}
