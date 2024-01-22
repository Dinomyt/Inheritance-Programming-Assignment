public abstract class Employee {
    private String ID;
    private String firstName;
    private String lastName;
    protected String jobTitle;
    protected double payRate;

    //Setters
    public void setID(String ID)
    {
        this.ID = ID;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    //Our two abstract methods
    abstract void setJobTitle();
    abstract void setPayRate(double payRate);

    //Getters
    public String getID()
    {
        return this.ID;
    }
    public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public String getJobTitle()
    {
        return this.jobTitle;
    }
    public double getPayRate()
    {
        return this.payRate;
    }

    //Outputs formatted employee information
    public void printEmployee()
    {
        System.out.printf("%-15s %-15s %-15s %-15s %-15.2f%n", ID, firstName, lastName, jobTitle, payRate);

    }
}
