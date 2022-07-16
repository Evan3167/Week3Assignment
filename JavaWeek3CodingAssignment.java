
public class JavaWeek3CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93};
		//Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7]------
		//---- in your code). Print the result to the console.
		int answerOne = ages.length;
		int subtracted = Math.abs(ages[answerOne - answerOne] - ages[answerOne - 1]);
		System.out.println("The Subrtacted answer in agaes Array is: " + subtracted);
		//_______________________________________________________________
	
		//Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		int[] newAges = new int[] {3, 9, 23, 64, 2, 8, 28, 93, 50};
		int answerOneB = newAges.length;
		int subtractedB = Math.abs(newAges[answerOneB - answerOneB] - newAges[answerOneB - 1]);
		System.out.println("The Subrtacted answer in newAgaes Array is: " + subtractedB);
		//___________________________________________________________________________________________________________
		
		//Use a loop to iterate through the array and calculate the average age. Print the result to the console
		
		int sum = 0;
		for (int i = 0; i < newAges.length; i++) {
			sum += newAges[i];
		}
		double averageAge = sum / newAges.length;
		System.out.println("The Avaerage for age in newAges Array is: " + averageAge);
		//___________________________________________________________________________________________________________
		
		//Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.

		String[] names= {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		//Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		int sumOfNames = 0;
		for (int i = 0; i < names.length; i++) {
			sumOfNames = names[i].length();
		}
		double averageOfNames = sum / names.length;
		System.out.println("The Average for the letters in each name is: " + averageOfNames);
		//Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		
		String allNamesTogether = "";
		for (int i = 0; i < names.length; i++) {
			allNamesTogether += names[i] + " ";
		}
		System.out.println(allNamesTogether);
		//___________________________________________________________________________________________________________
		
		//How do you access the last element of any array?
		System.out.println("You use the .length to access the last element of an array");
		
		//How do you access the first element of any array?
		System.out.println("You will use _____[0] to get the firs element in an array.");
		
		//___________________________________________________________________________________________________________
		
		//Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name ---- 
		//----- to the nameLengths array.
		int[] namesLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			namesLengths[i] = names[1].length(); 
		}
		//Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		int sums = 0;
		for (int i = 0; i < namesLengths.length; i++) {
			sums += namesLengths[i];
		}
		System.out.println("The sum for the nameLengths Array is: " + sums);
		
		//Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times.-------
		//-----(i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
		
		System.out.println(multiplyString("Hello", 3));
		
		//Write a method that takes two Strings, firstName and lastName, and returns a full name -------
		//the full name should be the first and the last name as a String separated by a space).
		
		String firstName = "Evan";
		String lastName = "Lela";
		String fullName = createFullName(firstName, lastName);	
	
		System.out.println("My full name is: " +(fullName));
		
		//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		
		int[] over100 = new int[4];
		over100[0]= 200;
		over100[1]= 150;
		over100[2]= 120;
		over100[3]= 190;
		
				System.out.println("Method of ints over 100: " + over100Sum(over100));
		
				//Write a method that takes an array of double and returns the average of all the elements in the array.
		double[] grades = new double[5];
		grades[0] = 90.2;
		grades[1] = 56.4;
		grades[2] = 30;
		grades[3] = 76.4;
		grades[4] = 100;
		
		System.out.println("The first double array average is: " + (calculateAverage(grades)));
		
		
		//Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater-----------
		//--than the average of the elements in the second array.
		
		
 		double[] grades2 = new double[5];
 		grades2[0] = 20.4;
 		grades2[1] = 10;
 		grades2[2] = 15.4;
 		grades2[3] = 31.2;
 		grades2[4] = 5.5;
 		
		System.out.println("The first average double is greater than the second: " + (greaterThanFirstDouble(grades, grades2 )));
	
		
		//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket,-----
		//and returns true if it is hot outside and if moneyInPocket is greater than 10.50.

		boolean isHotOutside = true;
		double moneyInPocket = 10.80;
	
		System.out.println("I am able to buy a drink and its hot outside: " + (willBuyDrink(moneyInPocket, isHotOutside)));
		
		
		
	}//_______________________________________________Methods at the bottom___________________________________________________________________________________
	
	
	//Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times.-------
	//-----(i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
	
	public static String multiplyString(String str, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			result += str;
		}
		return result; 
 
	}////Write a method that takes two Strings, firstName and lastName, and returns a full name -------
	//the full name should be the first and the last name as a String separated by a space).
	
	public static String createFullName(String x, String y) {
		return x + " " + y;
	}//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static Boolean over100Sum(int[] over100) {
		int	sum100 = 0;
		for (int i = 0; i < over100.length; i++) {
			sum100 += over100[i];
		}
		return sum100>=100; 
	}
	//Write a method that takes an array of double and returns the average of all the elements in the array.
	public static double calculateAverage(double[] numbers ) {
		double sum =0;
		for(double number : numbers) {
			sum += number;
		}
		return sum / numbers.length; 
	}
	//Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater-----------
	//--than the average of the elements in the second array.
	public static boolean greaterThanFirstDouble(double[] numbers, double[] numberss) {
	 if (numbers.length != numberss.length);
	return true;
				
	}
	//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket,-----
	//and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	
	public static boolean willBuyDrink(double moneyInPocket, boolean isHotOutside ) {
		if (isHotOutside == true && moneyInPocket>= 10.50){
			return true;
		}
		return false;
	}
	
//	int[] mySumArrayExample = new int[6];
//	mySumArrayExample[0] = 8; 
//	mySumArrayExample[1] = 6; 
//	mySumArrayExample[2] = 5; 
//	mySumArrayExample[3] = 2; 
//	mySumArrayExample[4] = 10; 
//	mySumArrayExample[5] = 20; 
//	
//	System.out.println(mySum(mySumArrayExample));
//	
//	public static int mySum(int[] numbers) {
//		int sum = 0;
//		for (int number : number) {
//			sum += number;
//		}
//		return true; 
//	}
	// What this method will do it calculate the sum for the example above.
	// I created it's something that ive been practicing to try and get better at it. 
	
}
