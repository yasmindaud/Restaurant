public class Employee extends User implements Payable {
    private int employeeID;
    private String role;
    private double hourlyRate;
    private double hoursWorked;

    public Employee(String name, String contactInfo, int employeeID,
                  String role, double hourlyRate, double hoursWorked) {
        super (name, contactInfo); // call parent constructor
        this.employeeID= employeeID; 
        this.role = role;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    // Getters
    public int getEmployeeID(){
        return employeeID;
    }
    public String getRole(){
        return role;
    }
    public double getHourlyRate(){
        return hourlyRate;
    }
    public double gethoursWorked(){
        return hoursWorked;
    }
    @Override
    public double  calculatePayment(){
        return hourlyRate * hoursWorked;
    }
    
    public void showDetails() {
        System.out.println("EmployeeID:" + employeeID);
        System.out.println("Role:" + role);
        System.out.println("Payment: ksh" + calculatePayment());
        System.out.println("------------------------");
    }

    }


    

