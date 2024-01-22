public class Bartender extends Employee{
    final double maxRate = 18.00;

    //Default constructor
    public Bartender()
    {
        this.payRate = maxRate;
        setJobTitle();
    }

    @Override
    public void setJobTitle()
    {
        this.jobTitle = "Bartender";
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
