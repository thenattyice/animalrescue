public class Monkey extends RescueAnimal{
	//Implementing Monkey attributes and data types
	private String tailLength;
	private String height;
	private String bodyLength;
	private String species;
	
	//Constructor
	public Monkey(String name, String gender, String age,
		    String weight, String acquisitionDate, String acquisitionCountry,
			String trainingStatus, boolean reserved, String inServiceCountry,
			String tailLength, String height, String bodyLength, String species) {
		//RescueAnimal-specific attributes
		setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        
        //Monkey-specific attributes
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setSpecies(species);
		
	}
	
	//Accessor
	public String getSpecies() {
		return species;
	}
	
	//Mutator
	public void setSpecies(String monkeySpecies) {
		species = monkeySpecies;
		
	}
	//Accessor
	public String getBodyLength() {
		return bodyLength;
	}
	//Mutator
	public void setBodyLength(String monkeyBodyLength) {
		bodyLength = monkeyBodyLength;
		
	}
	//Accessor
	public String getHeight() {
		return height;
	}
	//Mutator
	public void setHeight(String monkeyHeight) {
		height = monkeyHeight;
		
	}
	//Accessor
	public String getTailLength() {
		return tailLength;
	}
	//Mutator
	public void setTailLength(String tailLength2) {
		tailLength = tailLength2;
		
	}

}
