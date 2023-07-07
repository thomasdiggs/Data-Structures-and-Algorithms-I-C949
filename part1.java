import java.util.*;

public class DiggsThomasCS201Part1 {
	
	// Decided to create a function to bubble sort; an effort to clean up code in the main.
	public static void bubbleSort(String[][] arr) {
        // Bubble sorting the statesCapitals array to arrange everything in order by Capital rather than by State.
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                // Initialize temporary variables for capital and state.
                String tempCapital;
                String tempState;
                // If next j is less than current i
                if (arr[1][j].compareTo(arr[1][i]) < 0) {
                    // Then swap the values by placing current capital into tempCapital, reassign next capital
                    // to current and then reassign temporary (previously current) value to next capital.
                	tempCapital = arr[1][i];
                    arr[1][i] = arr[1][j];
                    arr[1][j] = tempCapital;
                    // Perform same steps to preserve the state and capital relationship.
                    tempState = arr[0][i];
                    arr[0][i] = arr[0][j];
                    arr[0][j] = tempState;
                }
            }
        }
	}
	
	public static void main(String[] args) {
		// ~~~ PART 1 ~~~

		// Initializing a 2D array with first row being a state and second row being a capital.
		// [0][0] and [1][0] is "Alabama Montgomery"
		// [0][1] and [1][1] is "Alaska Juneau"
		// [0][2] and [1][2] is "Arizona Pheonix"
		// and so on...
		String[][] statesCapitals = {
				{"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"},
				{"Montgomery", "Juneau", "Phoenix", "Little Rock", "Sacramento", "Denver", "Hartford", "Dover", "Tallahassee", "Atlanta", "Honolulu", "Boise", "Springfield", "Indianapolis", "Des Moines", "Topeka", "Frankfort", "Baton Rouge", "Augusta", "Annapolis", "Boston", "Lansing", "Saint Paul", "Jackson", "Jefferson City", "Helena", "Lincoln", "Carson City", "Concord", "Trenton", "Santa Fe", "Albany", "Raleigh", "Bismarck", "Columbus", "Oklahoma City", "Salem", "Harrisburg", "Providence", "Columbia", "Pierre", "Nashville", "Austin", "Salt Lake City", "Montpelier", "Richmond", "Olympia", "Charleston", "Madison", "Cheyenne"}
		};
		
		// Initialize a scanner to receive user input.
        Scanner scanner = new Scanner(System.in);
        // Prompting user to input a capital. I trimmed the input in case users like to put spaces before or after.
        System.out.println("Enter a capital for a U.S. state capital:");
        String capitalInput = scanner.nextLine().trim();
        // Creating a boolean variable to start off the for loop to check if user input is in the array.
        boolean equals = false;
        // Iterating through the sub array to check if user input is correct.
        for (String capital : statesCapitals[1]) {
            if (capital.equalsIgnoreCase(capitalInput)) {
                equals = true;
                break;}
            }
        // If out boolean variable "equals" is true, then the following will run.
        if (equals) {
            System.out.println("Correct, " + capitalInput + " is a U.S. state capital");
        }
        // If user fails to enter a correct value and "equals" is false then do the following.
        else {
            System.out.println(capitalInput + " is incorrect.");
        }
        System.out.println(); // Adding a space for readability.
        // Printing the contents of the array in a readable way. Using .length for index 0 because both index 0 and 1
        // are the same length, it wouldn't matter which length I used. This avoids having to hard code in the number.
        System.out.println("Sorted by state:\n");
        for (int i = 0; i < statesCapitals[0].length; i++) {
            System.out.println(statesCapitals[1][i] + ", " + statesCapitals[0][i]);
        }
        // Using a function to bubble sort the statesCapitals array.
        bubbleSort(statesCapitals);
        // Listing out the new array to verify sorting.
        System.out.println("\nSorted by capital:\n");
        for (int i = 0; i < statesCapitals[0].length; i++) {
            System.out.println(statesCapitals[1][i] + ", " + statesCapitals[0][i]);
        }
        System.out.println(""); // creating visual space for the next part.
        
        // This will use a score variable to keep track of how many capitals the user got correct.
        int score = 0;
        // Looping through each element of the array to display which state the user is guessing the capital for.
        for(int i = 0; i < statesCapitals[0].length; i++) {
        	System.out.println("What is the capital of " + statesCapitals[0][i] + "?");
        	capitalInput = scanner.nextLine().trim();
        	// After collecting the user input and trimming any extra spaces before or after the input
        	// proceed to check if the user got the corresponding capital correct, if so then increment the score by 1.
        	if (statesCapitals[1][i].equalsIgnoreCase(capitalInput)) {
        		score++;
        	}
        }
        // Printing the final value of the score to show how the user did.
        System.out.println("You scored " + score + " correctly out of " + statesCapitals[0].length);
        scanner.close();
    
	}

}