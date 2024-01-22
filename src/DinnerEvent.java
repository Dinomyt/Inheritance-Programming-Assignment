import java.util.Random;


public class DinnerEvent {
    private EventTypes eventType;
    private String eventName;
    private int guestCount;
    private EntreeChoice entreeChoice;
    private SideDishChoice sideDishOneChoice;
    private SideDishChoice sideDishTwoChoice;
    private DessertChoice dessertChoice;
    private int employeeIndex = 0;

    final String[] entree = {"Grilled Steak", "Grilled Pork", "Grilled Chicken"};
    final String[] sideDish = {"Shrimp Cocktail", "Onion Soup", "Fries"};
    final String[] desert = {"Vanilla Ice Cream", "Fruit Cups", "Pie"};
    private Employee[] employees = new Employee[15];

    private enum EventTypes {
        WEDDING,
        BIRTHDAY,
        CORPORATE,
        OTHERS
    }

    private enum EntreeChoice {
        GRILLED_STEAK,
        GRILLED_PORK,
        GRILLED_CHICKEN,
        NO_ENTREE_SPECIFIED
    }

    private enum SideDishChoice {
        SHRIMP_COCKTAIL,
        ONION_SOUP,
        FRIES,
        NO_SIDE_DISH_SPECIFIED
    }

    private enum DessertChoice {
        VANILLA_ICE_CREAM,
        FRUIT_CUPS,
        PIE,
        NO_DESSERT_SPECIFIED
    }

    public DinnerEvent(int eventType, String eventName, int guestCount, int entreeChoice, int sideDishOneChoice, int sideDishTwoChoice, int dessertChoice)
    {

        this.eventName = eventName;
        this.guestCount = guestCount;

        setEventType(eventType);
        setEntreeChoice(entreeChoice);
        setSideDishOneChoice(sideDishOneChoice);
        setSideDishTwoChoice(sideDishTwoChoice);
        setDessertChoice(dessertChoice);
        assignEmployees(guestCount);

    }

    public void assignEmployees(int guestCount)
    {
        int waitStaffCount = 1 + guestCount / 10;;
        int bartenderCount = 1 + guestCount / 25;
        String[] firstNames = {"Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace", "Henry", "Ivy", "Jack"};
        String[] lastNames = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor"};
        for (int i = 0; i < waitStaffCount && i < employees.length; i++)
        {
            employees[employeeIndex] = new Waitstaff();
            employees[employeeIndex].setID(assignID());
            employees[employeeIndex].setFirstName(firstNames[employeeIndex]);
            employees[employeeIndex].setLastName(lastNames[employeeIndex]);
            employeeIndex++;
        }

        for (int i = 0; i < bartenderCount && i < employees.length; i++)
        {
            employees[employeeIndex] = new Bartender();
            employees[employeeIndex].setID(assignID());
            employees[employeeIndex].setFirstName(firstNames[employeeIndex]);
            employees[employeeIndex].setLastName(lastNames[employeeIndex]);
            employeeIndex++;
        }

        employees[employeeIndex] = new Coordinator();
        employees[employeeIndex].setID(assignID());
        employees[employeeIndex].setFirstName(firstNames[employeeIndex]);
        employees[employeeIndex].setLastName(lastNames[employeeIndex]);
        employeeIndex++;

    }
    public String assignID() {
        Random random = new Random();
        return String.valueOf(10000 + random.nextInt(90000));
    }

    //Setters
    public void setEventType(int eventType) {
        switch (eventType) {
            case 1:
                this.eventType = EventTypes.WEDDING;
                break;
            case 2:
                this.eventType = EventTypes.BIRTHDAY;
                break;
            case 3:
                this.eventType = EventTypes.CORPORATE;
                break;
            case 4:
                this.eventType = EventTypes.OTHERS;
                break;
            default:
                System.out.println("Invalid Event Type Choice");
                System.out.println("Setting Event Type as \"Other\"");
                this.eventType = EventTypes.OTHERS;
        }
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setGuestCount(int guestCount) {
        this.guestCount = guestCount;
    }

    public void setEntreeChoice(int entreeChoice) {
        // Assign entree choice based on the numeric value
        switch (entreeChoice) {
            case 1:
                this.entreeChoice = EntreeChoice.GRILLED_STEAK;
                break;
            case 2:
                this.entreeChoice = EntreeChoice.GRILLED_PORK;
                break;
            case 3:
                this.entreeChoice = EntreeChoice.GRILLED_CHICKEN;
                break;
            default:
                System.out.println("Invalid Entree Choice");
                this.entreeChoice = EntreeChoice.NO_ENTREE_SPECIFIED;
        }
    }

    public void setSideDishOneChoice(int sideDishOneChoice) {
        // Assign side dish one choice based on numeric value
        switch (sideDishOneChoice) {
            case 1:
                this.sideDishOneChoice = SideDishChoice.SHRIMP_COCKTAIL;
                break;
            case 2:
                this.sideDishOneChoice = SideDishChoice.ONION_SOUP;
                break;
            case 3:
                this.sideDishOneChoice = SideDishChoice.FRIES;
                break;
            default:
            System.out.println("Invalid Side Dish Choice");
            this.sideDishOneChoice = SideDishChoice.NO_SIDE_DISH_SPECIFIED;
        }
    }

    public void setSideDishTwoChoice(int sideDishTwoChoice) {
        // Assign side dish two choice based on numeric value
        switch (sideDishTwoChoice) {
            case 1:
                this.sideDishTwoChoice = SideDishChoice.SHRIMP_COCKTAIL;
                break;
            case 2:
                this.sideDishTwoChoice = SideDishChoice.ONION_SOUP;
                break;
            case 3:
                this.sideDishTwoChoice = SideDishChoice.FRIES;
                break;
            default:
            System.out.println("Invalid Side Dish Choice");
            this.sideDishTwoChoice = SideDishChoice.NO_SIDE_DISH_SPECIFIED;

        }
    }

    public void setDessertChoice(int dessertChoice) {
        // Assign dessert choice based on the numeric value
        switch (dessertChoice) {
            case 1:
                this.dessertChoice = DessertChoice.VANILLA_ICE_CREAM;
                break;
            case 2:
                this.dessertChoice = DessertChoice.FRUIT_CUPS;
                break;
            case 3:
                this.dessertChoice = DessertChoice.PIE;
                break;
            default:
                System.out.println("Invalid Dessert Choice");
        }
    }

    // Getters
    public EventTypes getEventType() {
        return this.eventType;
    }

    public String getEventName() {
        return this.eventName;
    }

    public int getGuestCount() {
        return this.guestCount;
    }

    public EntreeChoice getEntreeChoice() {
        return this.entreeChoice;
    }

    public SideDishChoice getSideDishOneChoice() {
        return this.sideDishOneChoice;
    }

    public SideDishChoice getSideDishTwoChoice() {
        return this.sideDishTwoChoice;
    }

    public DessertChoice getDessertChoice() {
        return this.dessertChoice;
    }

    public void printInfo() {
        System.out.print("\n\n----------------------------------------------------------");
        System.out.println("\nEvent Type: " + eventType);
        System.out.println("Event Name: " + eventName);
        System.out.println("Guest Count: " + guestCount);
        System.out.println("Entree Choice: " + entreeChoice);
        System.out.println("Side Dish One Choice: " + sideDishOneChoice);
        System.out.println("Side Dish Two Choice: " + sideDishTwoChoice);
        System.out.println("Dessert Choice: " + dessertChoice);
        System.out.print("----------------------------------------------------------");

        System.out.println("\n\nEmployee Information:");
        System.out.print("----------------------------------------------------------");
        double totalPayRate = 0;

        System.out.printf("\n%-15s %-15s %-15s %-15s %-15s%n", "ID", "First Name", "Last Name", "Job Title", "Pay Rate");
        for (int i = 0; i < employeeIndex && i < employees.length; i++) {
            Employee employee = employees[i];
    
            System.out.printf("%-15s %-15s %-15s %-15s %-15.2f%n",
                    employee.getID(), employee.getFirstName(), employee.getLastName(),
                    employee.getJobTitle(), employee.getPayRate());
                    
            totalPayRate += employee.getPayRate();
        }
        System.out.printf("\n%-15s %-15s %-15s %-15s %-15.2f%n",
        "", "", "", "Total Rate: ", totalPayRate);
        System.out.print("----------------------------------------------------------");
    }
}
