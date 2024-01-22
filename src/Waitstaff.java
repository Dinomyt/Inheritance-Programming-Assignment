public class Waitstaff extends Employee{
    final double maxRate = 15.00;
    
    public Waitstaff()
    {
        this.payRate = maxRate;
        setJobTitle();
    }

    @Override
    public void setJobTitle() 
    {
        this.jobTitle = "Waitstaff";
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
