import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

    public static void main(String[] args) {
    	//Initialize the scanner and a user input variable for easier method calling
    	Scanner scanner = new Scanner(System.in);
    	String userInput = "";

        initializeDogList();
        initializeMonkeyList();

        //Menu loop
        //Has a try and catch to handle exceptions when the input isnt valid
        do {
        	displayMenu();
        	try {
	        	userInput = scanner.nextLine();
	        	
	        	switch (userInput) {
	        	case "1":
	        		intakeNewDog(scanner);
	        		break;
	        	case "2":
	        		intakeNewMonkey(scanner);
	        		break;
	        	case "3":
	        		reserveAnimal(scanner);
	        		break;
	        	case "4":
	        		printAnimals("dog");
	        		break;
	        	case "5":
	        		printAnimals("monkey");
	        		break;
	        	case "6":
	        		printAnimals("available");
	        		break;
	        	default:
	        		System.out.println("Please enter a valid input");
	        	}
        	} catch (InputMismatchException e){
            	System.out.println("Please enter a valid input"); //Catch invalid inputs
            	scanner.nextLine(); //Clears input for user to retry
            }
        } while (!userInput.equals("q"));
    }

    //Menu options for the menu loop
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection:");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {

    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        	//User input prompts if dog's name doesn't already exist
        	System.out.println("Enter the dog's breed:");
            String breed = scanner.nextLine();
            
            System.out.println("Enter the dog's gender:");
            String gender = scanner.nextLine();
            
            System.out.println("Enter the dog's age:");
            String age = scanner.nextLine();
            
            System.out.println("Enter the dog's weight:");
            String weight = scanner.nextLine();
            
            System.out.println("Enter the dog's acquisition date:");
            String acquisitionDate = scanner.nextLine();
            
            System.out.println("Enter the dog's acquisition country:");
            String acquisitionCountry = scanner.nextLine();
            
            System.out.println("Enter the dog's training status:");
            String trainingStatus = scanner.nextLine();
            
            System.out.println("Is the dog reserved? (true/false):");
            boolean reserved = Boolean.parseBoolean(scanner.nextLine());
            
            System.out.println("Enter the dog's in-service country:");
            String inServiceCountry = scanner.nextLine();
            
            //Create a new Dog object
            Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
            
            //Add the Dog to the ArrayList
            dogList.add(newDog);
            System.out.println("You have successfully added the Dog to the system!"); //User confirmation of success
           
       }

	//Monkey intake method
        public static void intakeNewMonkey(Scanner scanner) {
            System.out.println("Enter the monkey's name: ");
            String name = scanner.nextLine();
            //Validate that monkey doesn't already exist
            for(Monkey monkey: monkeyList) {
            	if(monkey.getName().equalsIgnoreCase(name)) {
            		System.out.println("\n\nThis monkey is already in our system\n\n");
                    return; //returns to menu
            	}
            }
            //List of the allowed monkey species
            String[] monkeyAllowedSpecies = {"Capuchin","Guenon","Macaque","Marmoset","Squirrel Monkey","Tamarin"};
            //Monkey intake user prompt
            System.out.println("Enter the monkey's species: ");
            String species = scanner.nextLine();
            //Validation of user input monkey species
            boolean allowedSpecies = false; //Using a boolean as the trigger to determine if the input species is allowed
            for (String allowed : monkeyAllowedSpecies) {
            	if (species.equalsIgnoreCase(allowed)) {
            		allowedSpecies = true;
            		break; //Exits the loop once the input species is determined to be a match
            	}
            }
            //If allowed species is false, it lets the user know and lists valid monkey species
            if (!allowedSpecies) {
            	System.out.println("Invalid monkey species. Allowed species are " + String.join(", ", monkeyAllowedSpecies));
            	return;
            }
            //User input prompts
            System.out.println("Enter the monkey's gender:");
            String gender = scanner.nextLine();
            
            System.out.println("Enter the monkey's age:");
            String age = scanner.nextLine();
            
            System.out.println("Enter the monkey's weight:");
            String weight = scanner.nextLine();
            
            System.out.println("Enter the monkey's acquisition date:");
            String acquisitionDate = scanner.nextLine();
            
            System.out.println("Enter the monkey's acuisition country:");
            String acuisitionCountry = scanner.nextLine();
            
            System.out.println("Enter the monkey's training status:");
            String trainingStatus = scanner.nextLine();
            
            System.out.println("Is the monkey reserved? (true/false):");
            boolean reserved = Boolean.parseBoolean(scanner.nextLine());
            
            System.out.println("Enter the monkey's in-service country:");
            String inServiceCountry = scanner.nextLine();
            
            System.out.println("Enter the monkey's tail length:");
            String tailLength = scanner.nextLine();
            
            System.out.println("Enter the monkey's height:");
            String height = scanner.nextLine();
            
            System.out.println("Enter the monkey's body length:");
            String bodyLength = scanner.nextLine();
            
            //Create a new Monkey object
            Monkey newMonkey = new Monkey(name, species, gender, age, weight, acquisitionDate, acuisitionCountry, reserved, trainingStatus, inServiceCountry, tailLength, height, bodyLength);
            
            //Add the Monkey to the ArrayList
            monkeyList.add(newMonkey);
            System.out.println("You have successfully added the Monkey to the system!"); //User confirmation of success
        }
        
        // Find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
        	//Prompt and store animal type + in-service country for reservation logic
            System.out.println("Which animal type are you looking for? (Dog or Monkey):");
            String animalType = scanner.nextLine().toLowerCase();
            
            System.out.println("Which country do you need service in?");
            String inServiceCountry = scanner.nextLine();
            
            boolean animalReserved = false;
            
            //iterates through the dogs that match the criteria
            if(animalType.equals("dog")) {
            	for (Dog dog : dogList) {
            		if(!dog.getReserved() && dog.getInServiceLocation().equalsIgnoreCase(inServiceCountry)) {
            			dog.setReserved(true); //Reserves the first dog found
            			System.out.println("You have reserved a dog named " + dog.getName());
            			animalReserved = true;
            			break; //Exit the loop after reserving a dog
            		}
            	}
            } else if (animalType.equals("monkey")) {
            	for (Monkey monkey : monkeyList) {
            		if(!monkey.getReserved() && monkey.getInServiceLocation().equalsIgnoreCase(inServiceCountry)) {
            			monkey.setReserved(true); //Reserves the first monkey found
            			System.out.println("You have reserved a mokey named " + monkey.getName());
            			animalReserved = true;
            			break; //Exit the loop after reserving a monkey
            		}
            	}
            } else {
            	System.out.println("Please enter a valid aniaml type of 'Dog' or 'Monkey'.");
            	return;
            }
            if (!animalReserved) {
            	System.out.println("There are no available animals that match your criteria.");
            }
        }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(String listType) {
            if (listType.equalsIgnoreCase("dog")) {
            	System.out.println("List of all dogs:");
            	for (Dog dog : dogList) {
            		System.out.println(dog.getName() + ", " + dog.getTrainingStatus() + ", " + dog.getAcquisitionLocation() + ", " + dog.getReserved());
            	}
            } else if (listType.equalsIgnoreCase("monkey")) {
            	System.out.println("List of all monkeys:");
            	for (Monkey monkey : monkeyList) {
            		System.out.println(monkey.getName() + ", " + monkey.getTrainingStatus() + ", " + monkey.getAcquisitionLocation() + ", " + monkey.getReserved());
            	} 
            } else if (listType.equalsIgnoreCase("available")) {
            	System.out.println("All available animals:");
            	for (Dog dog : dogList) {
            		if(!dog.getReserved()) {
            			System.out.println(dog.getName() + ", " + dog.getTrainingStatus() + ", " + dog.getAcquisitionLocation() + ", " + dog.getReserved());
            		}
            	}
            	for (Monkey monkey : monkeyList) {
            		if(!monkey.getReserved()) {
            			System.out.println(monkey.getName() + ", " + monkey.getTrainingStatus() + ", " + monkey.getAcquisitionLocation() + ", " + monkey.getReserved());
            		}
            	}
            } else {
            	System.out.println("Please enter a valid type: dog, monkey, available.");
            }
        
        }  
}

