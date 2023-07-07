import java.util.*;

public class DiggsThomasCS201Part2 {

	public static void main(String[] args) {
		// ~~~ PART 2 ~~~
		// Initializing a hash map to store the state as the key and the capital city as the value.
		// Contents in alphabetical order by state.
		HashMap<String, String> capitalCities = new HashMap<>();
		// Inserting data into the hash map.
		capitalCities.put("Alabama", "Montgomery");
		capitalCities.put("Alaska", "Juneau");
		capitalCities.put("Arizona", "Phoenix");
		capitalCities.put("Arkansas", "Little Rock");
		capitalCities.put("California", "Sacremento");
		capitalCities.put("Colorado", "Denver");
		capitalCities.put("Connecticut", "Hartford");
		capitalCities.put("Delaware", "Dover");
		capitalCities.put("Florida", "Tallahassee");
		capitalCities.put("Georgia", "Atlanta");
		capitalCities.put("Hawaii", "Honolulu");
		capitalCities.put("Idaho", "Boise");
		capitalCities.put("Illinois", "Springfield");
		capitalCities.put("Indiana", "Indianapolis");
		capitalCities.put("Iowa", "Des Moines");
		capitalCities.put("Kansas", "Topeka");
		capitalCities.put("Kentucky", "Frankfort");
		capitalCities.put("Louisiana", "Baton Rouge");
		capitalCities.put("Maine", "Augusta");
		capitalCities.put("Maryland", "Annapolis");
		capitalCities.put("Massachusetts", "Boston");
		capitalCities.put("Michigan", "Lansing");
		capitalCities.put("Minnesota", "Saint Paul");
		capitalCities.put("Mississippi", "Jackson");
		capitalCities.put("Missouri", "Jefferson City");
		capitalCities.put("Montana", "Helena");
		capitalCities.put("Nebraska", "Lincoln");
		capitalCities.put("Nevada", "Carson City");
		capitalCities.put("New hampshire", "Concord");
		capitalCities.put("New jersey", "Trenton");
		capitalCities.put("New mexico", "Santa Fe");
		capitalCities.put("New york", "Albany");
		capitalCities.put("North carolina", "Raleigh");
		capitalCities.put("North dakota", "Bismarck");
		capitalCities.put("Ohio", "Columbus");
		capitalCities.put("Oklahoma", "Oklahoma City");
		capitalCities.put("Oregon", "Salem");
		capitalCities.put("Pennsylvania", "Harrisburg");
		capitalCities.put("Rhode island", "Providence");
		capitalCities.put("South carolina", "Columbia");
		capitalCities.put("South dakota", "Pierre");
		capitalCities.put("Tennessee", "Nashville");
		capitalCities.put("Texas", "Austin");
		capitalCities.put("Utah", "Salt Lake City");
		capitalCities.put("Vermont", "Montpelier");
		capitalCities.put("Virginia", "Richmond");
		capitalCities.put("Washington", "Olympia");
		capitalCities.put("West virginia", "Charleston");
		capitalCities.put("Wisconsin", "Madison");
		capitalCities.put("Wyoming", "Cheyenne");
		// Converting hash map to tree map. Added ability to lookup keys with case insensitivity.
		Map<String, String> capitalCitiesTreeMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
		capitalCitiesTreeMap.putAll(capitalCities);
		// Displaying the contents of the hash map.
		capitalCities.entrySet().forEach(entry -> {
			System.out.println(entry.getValue() + ", " + entry.getKey());
		});
		// Asking user to enter any US state.
        System.out.println("--------------------");
		System.out.println("Please enter a U.S. state:");
		// Initializing variable to store user input for U.S. state.
		String stateInput;
		// Initializing scanner to collect user input.
		Scanner input = new Scanner(System.in);
		// Storing the input. Using trim() to remove any spaces before or after the input.
		stateInput = input.nextLine().trim();
		input.close();
		// Displaying correct capital from user input.
		System.out.println(capitalCitiesTreeMap.get(stateInput));
	}

}