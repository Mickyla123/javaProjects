

		import java.util.Scanner;
		import java.io.File;
		import java.io.FileNotFoundException;

		public class AccidentJava {
			public static void main(String[] args) throws FileNotFoundException  {
			
		  //initialization of value of the instance variable
				int hour=0;
				int vehicle=0;
				int death=0;
				
			//Creates an object of Scanner from file
				Scanner sc = new Scanner(new File("C:\\Users\\ip\\Downloads\\accidents.txt"));
				
				//Initialization 
				float ratioMorning=0f;
				float ratioAfternoon=0f;
			    float ratioNight=0f;
						
				int numAccidents=0;
				int numAccidentsMorning=0;
				int numAccidentsAfternoon=0;
				int numAccidentsNight=0;
				
				int numCarsMorning=0;
				int numCarsAfternoon=0;
				int numCarsNight=0;
				
				int numDeathsMorning=0;
				int  numDeathsAfternoon=0;
				int  numDeathsNight=0;
				
				sc.nextLine();
				
				while (sc.hasNext())
				{
				
					//Scans the next token of the input as an integer
					hour = sc.nextInt();
					vehicle = sc.nextInt();
					death = sc.nextInt();
					
					//using if-else statement
					if(hour>=6 && hour <= 12)
					{
				     numAccidentsMorning++;
					 numCarsMorning += vehicle;
					 numDeathsMorning += death;
					}
					else if(hour>= 13 && hour <=19)
					{
				    numAccidentsAfternoon++;
				    numCarsAfternoon += vehicle;
				    numDeathsAfternoon += death;
					}
					else if ((hour >= 0 && hour <= 5) || (hour >= 20 && hour <= 23))
					{
					numAccidentsNight++;
					numCarsNight += vehicle;
					numDeathsNight += death;
					
					}
				}
				    ratioMorning = numCarsMorning / (float)numAccidentsMorning;
				    ratioAfternoon = numCarsAfternoon / (float)numAccidentsAfternoon;
				    ratioNight = numCarsNight / (float)numAccidentsNight;
				    
				    sc.close(); //Closing the scanner
				    
				    //Prints 
					System.out.println(" Time Span    Accidents   Vehicles   Fatalities     Veh./Acc");
					System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.printf("Morning         %d         %d         %d         %.4f \n", numAccidentsMorning, numCarsMorning, numDeathsMorning,  ratioMorning );
					System.out.printf("Morning         %d        %d         %d         %.4f \n", numAccidentsAfternoon, numCarsAfternoon, numDeathsAfternoon, ratioAfternoon );
					System.out.printf("Morning         %d	     %d	   %d         %.4f \n", numAccidentsNight, numCarsNight, numDeathsNight , ratioNight );
					System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
					
					
					
					
				
			
		
		        


	}

}
