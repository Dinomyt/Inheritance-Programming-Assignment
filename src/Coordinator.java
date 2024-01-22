public class Coordinator extends Employee{
    private final double maxRate = 20.00;

    //Default constructor
    public Coordinator()
    {
        this.payRate = maxRate;
        setJobTitle();
    }
    
    @Override
    public void setJobTitle()
    {
        this.jobTitle = "Coordinator";
    }

    @Override
    public void setPayRate(double payRate)
    {
        if (payRate <= maxRate)
        {
            this.payRate = payRate;
        }
        else
        {
            System.out.println("Pay Rate must not exceed the maximum payrate of \"$" + maxRate + "\"");
            System.out.println("Setting employee's pay rate to $" + maxRate);
            this.payRate = maxRate;
        }
    }
}
