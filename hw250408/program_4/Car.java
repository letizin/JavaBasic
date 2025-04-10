package hw250408.program_4;

public class Car {
	static String color; 
    static int numOfCar; 
    static int numOfRedCar; 

    Car(String color) {
        numOfCar++; //
        if (color.equals("red") || color.equals("RED")) { 
            numOfRedCar++;
        }
    }

    static int getNumOfCar(){
        return numOfCar;
    }
    static int getNumOfRedCar(){
        return numOfRedCar;
    }
}
