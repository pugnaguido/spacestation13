// import the scanner class which will allow us to get imput from teh user
import java.util.Scanner;

// create a class called starbase 13, note tha the class must mach the file name
public class starbase13 {
    // create our main method, this is where out program will start.
    public static void main(String[] args) {


        //create a welcome output to our user
        System.out.println("\n\n\t 'welcome to Starbase 13' a disheveled program states as you are flying into the atmosphere of a giant red moon.");

        // greet the user and ask thier name.
        System.out.println("what is youre name traveller");
        // create a scanner object to get input from the user
        String userName = "";
        //create scanner
        Scanner scanner = new Scanner(System.in);
        // get the users name and store it into a variable
        userName = scanner.nextLine();
        //greet the user by name
        System.out.println("\n\n Welcome " + userName + " welcome to starbase 13 ");
        // explain the situtation to the traveler
        System.out.println("\n\n You are arriving at a war torn breaking down place built on this moon for its plentiful resources, as you can see those resourcees are gone ");
        // ask about number
        System.out.println("How long have you been traveling " + userName +" ");
        // get a number from the user
        String time_traveled = "";
        //save teh number
        time_traveled = scanner.nextLine();
        // tell tehm what year it actually is and how broken down teh shyttle really is
        System.out.println("\n\n wow youve been traveling for " + time_traveled + " suprising as it is year 2499 ");
        // now tell them the situation at the ship
        System.out.println("the station has been abondend for well over 200 years and is broken down");
        // explain the station to the person
        System.out.println("\n\n as you encroach the horizon you see a space station with all the windows cracked and the blast doors destroyed. would you like to leave or enter Thnak you for the demo");
        





    }





}



