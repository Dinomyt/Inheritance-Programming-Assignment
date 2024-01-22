## Week 2&3: Inheritance Programming Assignment

Details
>Case problem: Create an application for Carly’s Catering.
>1. Employee class: this class contains data fields for an employee’s ID, last name, first name, pay rate, and job title. The class contains get and set methods for each fields. The set methods for pay rate and job title are abstract.
>2. Create there classes that extend Employee class named Waitstaff, Bartender, and Coordinator. The method that sets the pay rate in each class accepts a parameter and assigns it to the pay rate, but no Waitstaff can have a rate higher than 15.00, no Bartender can have a rate higher than 18.00, and no Coordinator can have a rate higher than 20.00. The method that sets the job title accepts no parameters, it simply assigns the string waitstaff, bartender, or coordinator to the object appropriately. Save the three files.
>3. Create a DinnerEvent class to represent a dinner event. The class contains an integer field representing event type, a string field representing event name (such as wedding, birthday, corporate, and others, and another integer field representing the number of guests for the event. The class also have four integer fields that represent numeric choices for an entrée, two side dishes, and a dessert for each DinnerEvent object. Also include three final arrays that contains String menu options for entrees, side dishes, and desserts, and store at least three choices in each array. The class also includes an Employee array of 15 Employee objects representing employees who might be assigned to work a DinnerEvent. The constructor requires arguments for an event number, event name and number of guests, and integer menu choices for one entrée, two side dishes, and one desert. Using the arguments to initialize data fields properly. Include a get and set methods for each data fields.
>4. Write an application that declares a DinnerEvent object, prompts the user for an event number, event name, number of guests, menu options, and contact phone number, and then assign them to the object. Also prompt the user to enter data for as many employees as needed based on the number of guests. A DinnerEvent needs one Waitstaff employee for every event, two if an event has 10 guests or more, three if an event has 20 guests or more, and so on. A DinnerEvent also needs one Bartender for every 25 guests and one Coordinator no matter how many guests attend. All of these employees should be stored in the Employee array in the DinnerEvent object.
>5. After all data values are entered, display all of the details for the event, including all the details about the employees assigned to work.

## Notes

>1. For event name, you can define an enumerated data type that contains all available event names. Then in the constructor of DinnerEvent class, assign a proper value from the enumerated data type to the event name based on the numeric event type entered.

2. For menu options, you can also use enumerated data types instead of three final arrays

3. Program should be well-documented

4. Submit the repl.it link of the program

## Student Name

- Neng Lao
