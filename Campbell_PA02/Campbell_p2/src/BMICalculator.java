import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args) {
	    BMICalculator app = new BMICalculator();
	    app.readUserData();
	    app.calculateBmi(); //main methods but can still have "functions"
	    app.displayBmi();
	}

	public void readUserData() {
		int menu = myObj.nextInt();
		
		System.out.println("Please select a method of calculation:\n1. BMI = (703 * weightinPounds)/(heightinInches)^2\n2. BMI = weightinKilograms/(heightinMeters)^2");
		Scanner myObj = new Scanner(System.in);
		
		
		private readUnitType() {
			System.out.println("Unit type? 1 or 2");
			unitType = ??
					while(unitType == 1) {
						
					}
			
		}
		
		private readMeasurementData() {
			if(unitType == 2 ) {
				readMetricData();
			}
			else {			
				readImperialData();
			}
		}
		private readMetricData() {
			//enter weight statement
			setWeight(myObj.nextDouble());
			
			//enter height statement
			setHeight(myObj.nextDouble());
		}
		private readImperialData() {
			//enter weight statement
			setWeight(703 * myObj.nextDouble());
			
			//enter height statement
			setHeight(myObj.nextDouble());
		}
		
		switch(menu) {
		
		case 1:
			System.out.println("Please enter weight in pounds:");
			int weight = myObj.nextInt();
			
			System.out.println("Please enter height in inches:");
			int height = myObj.nextInt();
			calculateBmi(menu, weight, height);
			
		case 2:
			System.out.println("Please enter weight in kilograms:");
			int weight = myObj.nextInt();
			
			System.out.println("Please enter height in meters:");
			int height = myObj.nextInt();
			calculateBmi(menu, weight, height);
		}
		myObj.close();
	}
	
	public static int calculateBmi(int menu) {
		//can use same formula for both calculations differ by input
		int Bmi;
		private double weight;
		private double height;
		private double bmivalue;
		private String bmiCategory;
		private int unitType;
		
		switch(menu) {
		
			case 1:
				Bmi = (703 * weightinPounds)/(heightinInches)^2;
				BMICalculator.displayBmi(Bmi);
				
			case 2:	
				Bmi = weightinKilograms/(heightinMeters)^2;	
				BMICalculator.displayBmi(Bmi);
		}
	}
	private void calculateBmiValue() {
		//bmi calculations
	}
	
	private calculateBMICategory() {
		//determine which category
		return bmiCategory
	}
		
	public displayBmi(int Bmi) {
		//print BMI value and category
		
		
		System.out.println("Your BMI is " + Bmi);
		
	}
	public getweight( ) {
		//enter weight in whatever
		
	}
	
	public getheight() {
		//enter height in whatever
		
		
	}
	private void setWeight(double value) {
		if(value <= 0) {
			weight = value;
		}
		else {
			System.exit(0);
		}
		
	}
	private setHeight() {
		if(value <= 0) {
			height = value;
		}
		else {
			System.exit(0);
		}
	}
	public //few other functions left
}
