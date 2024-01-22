import java.util.Scanner;



public class App {
    public static Scanner scnr = new Scanner(System.in);
    public static void main(String[] args) throws Exception {




        System.out.println("Enter Event Type (1: Wedding, 2: Birthday, 3: Corporate, 4: Others): ");
        int eventType = scnr.nextInt();
        scnr.nextLine();

        System.out.println("Enter Event Name: ");
        String eventName = scnr.nextLine();

        System.out.println("Enter Guest Count: ");
        int guestCount = scnr.nextInt();

        System.out.println("Enter Entree Choice (1: Grilled Steak, 2: Grilled Pork, 3: Grilled Chicken): ");
        int entreeChoice = scnr.nextInt();

        System.out.println("Enter Side Dish One Choice (1: Shrimp Cocktail, 2: Onion Soup, 3: Fries): ");
        int sideDishOneChoice = scnr.nextInt();

        System.out.println("Enter Side Dish Two Choice (1: Shrimp Cocktail, 2: Onion Soup, 3: Fries): ");
        int sideDishTwoChoice = scnr.nextInt();

        System.out.println("Enter Dessert Choice (1: Vanilla Ice Cream, 2: Fruit Cups, 3: Pie): ");
        int dessertChoice = scnr.nextInt();


        DinnerEvent dinnerEvent = new DinnerEvent(eventType, eventName, guestCount, entreeChoice, sideDishOneChoice, sideDishTwoChoice, dessertChoice);
        dinnerEvent.printInfo();


        scnr.close();
    }

}
