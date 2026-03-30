public abstract class User {
    private String name;
    private String contactInfo;
    
    public User(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }
    // Getters and Setters (Encapsulation)
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContactInfo(){
        return contactInfo;
    }
    public void setContactInfo(String contactInfo){
        this.contactInfo = contactInfo;
     }
     public abstract void showDetails(); 
}
