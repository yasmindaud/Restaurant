public class Manager extends Employee  {
    public Manager (String name, String contactInfo, int employeeID,
                    String role, double hourlyRate, double hoursWorked){
        super( name , contactInfo, employeeID, "Manager", hourlyRate,
         hoursWorked);
    }
    
    public void openRestaurant(){
        System.out.println("Manager is opening the restaurant.");
    }
    
    
}
