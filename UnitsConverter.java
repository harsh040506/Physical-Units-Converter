import java.util.*;
class UnitsConverter {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Units Converter.");
    System.out.println("Which of the following type of quantity involves your unit:");
    System.out.println("1. Length");
    System.out.println("2. Mass");
    System.out.println("3. Volume");
    System.out.println("4. Temperature");
    System.out.println("5. Amount of Substance");

    System.out.println("Enter your choice: ");
    int choice = input.nextInt();
    switch(choice) {
      case 1:
        System.out.println("Which of the following unit do you want to convert?");
        System.out.println("1. Meter to Foot");
        System.out.println("2. Foot to Meter");
        System.out.println("3. Centimeter to Inch");
        System.out.println("4. Inch to Centimeter");
        System.out.println("5. Kilometer to Mile");
        System.out.println("6. Mile to Kilometer");
        System.out.println("7. Lightyear to Kilometer");
    
        System.out.println("Enter the serial number of your conversion: ");
        int choice1 = input.nextInt();
        switch(choice1) {
            case 1:
              System.out.println("Enter the value in meter: ");
              double meter = input.nextDouble();
              double foot = meter * 3.28084;
              System.out.println(meter + " meter is equal to " + foot + " foot");
              break;
              
            case 2:
              System.out.println("Enter the value in foot: ");
              double foot1 = input.nextDouble();
              double meter1 = foot1 / 3.28084;
              System.out.println(foot1 + " foot is equal to " + meter1 + " meter");
              break;

            case 3:
              System.out.println("Enter the value in centimeter: ");
              double centimeter = input.nextDouble();
              double inch = centimeter / 2.54;
              System.out.println(centimeter + " centimeter is equal to " + inch + " inch");
              break;

            case 4:
              System.out.println("Enter the value in inch: ");
              double inch1 = input.nextDouble();
              double centimeter1 = inch1 * 2.54;
              System.out.println(inch1 + " inch is equal to " + centimeter1 + " centimeter");
              break;

            case 5:
              System.out.println("Enter the value in Kilometer: ");
              double Kilometer = input.nextDouble();
              double Mile = Kilometer * 0.621371 ;
              System.out.println(Kilometer + " Kilometer is equal to " + Mile + " Mile");
              break;

            case 6:
              System.out.println("Enter the value in Mile: ");
              double Mile1 = input.nextDouble();
              double Kilometer1 = Mile1 / 0.621371 ;
              System.out.println(Mile1 + " Mile is equal to " + Kilometer1 + " Kilometer");
              break;

          case 7:
            System.out.println("Enter the value in Lightyear: ");
            double Lightyear = input.nextDouble();
            double Kilometer2 = Lightyear * 9.5e12 ;
            System.out.println(Lightyear + " Lightyear is equal to " + Kilometer2 + " Kilometers");
            break;

            default:
            System.out.println("Invalid Input");
            break;}break;
       
       
      case 2:
        System.out.println("Which of the following unit do you want to convert?");
        System.out.println("1. Kilogram to Pound");
        System.out.println("2. Pound to Kilogram");
        System.out.println("3. Gram to Ounce");
        System.out.println("4. Ounce to Gram");
    
        System.out.println("Enter the serial number of your conversion: ");
        int choice2 = input.nextInt();
        switch(choice2) {
            case 1:
              System.out.println("Enter the value in Kilogram: ");
              double Kilogram = input.nextDouble();
              double Pound = Kilogram / 0.453;
              System.out.println(Kilogram + " Kilogram is equal to " + Pound + " Pound");
              break;

            case 2:
              System.out.println("Enter the value in Pound: ");
              double Pound1 = input.nextDouble();
              double Kilogram1 = Pound1 * 0.453;
              System.out.println(Pound1 + " Pound is equal to " + Kilogram1 + " Kilogram");
              break;

            case 3:
              System.out.println("Enter the value in Gram: ");
              double Gram = input.nextDouble();
              double Ounce = Gram / 28.349;
              System.out.println(Gram + " Gram is equal to " + Ounce + " Ounce");
              break;

            case 4:
              System.out.println("Enter the value in Ounce: ");
              double Ounce1 = input.nextDouble();
              double Gram1 = Ounce1 * 28.349;
              System.out.println(Ounce1 + " Ounce is equal to " + Gram1 + " Gram");
              break;

            default:
            System.out.println("Invalid Input");
            break;}break;

      case 3:
        System.out.println("Which of the following unit do you want to convert?");
        System.out.println("1. Milliliter to Pint");
        System.out.println("2. Pint to Milliliter");
        System.out.println("3. Liter to Gallon");
        System.out.println("4. Gallon to Liter");
    
        System.out.println("Enter the serial number of your conversion: ");
        int choice3 = input.nextInt();
        switch(choice3){
            case 1:
              System.out.println("Enter the value in Milliliter: ");
              double Milliliter = input.nextDouble();
              double Pint = Milliliter / 568;
              System.out.println(Milliliter + " Milliliter is equal to " + Pint + " Pint");
              break;

            case 2:
              System.out.println("Enter the value in Pint: ");
              double Pint1 = input.nextDouble();
              double Milliliter1 = Pint1 * 568;
              System.out.println(Pint1 + " Pint is equal to " + Milliliter1 + " Milliliter");
              break;

            case 3:
              System.out.println("Enter the value in Liter: ");
              double Liter = input.nextDouble();
              double Gallon = Liter / 4.5;
              System.out.println(Liter + " Liter is equal to " + Gallon + " Gallon");
              break;

            case 4:
              System.out.println("Enter the value in Gallon: ");
              double Gallon1 = input.nextDouble();
              double Liter1 = Gallon1 * 4.5;
              System.out.println(Gallon1 + " Gallon is equal to " + Liter1 + " Liter");
              break;

            default:
            System.out.println("Invalid Input");
            break;}break;

      case 4:
        System.out.println("Which of the following unit do you want to convert?");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
    
        System.out.println("Enter the serial number of your conversion: ");
        int choice4 = input.nextInt();
        switch(choice4){

            case 1:
              System.out.println("Enter the value in Celsius: ");
              double Celsius = input.nextDouble();
              if(Celsius <= -273.15){System.out.println("Invalid Input");}
              else{
              double Fahrenheit = (Celsius * (9/5)) + 32;
              System.out.println(Celsius + " Degree Celsius is equal to " + Fahrenheit + " Degree Fahrenheit");}
              break;

            case 2:
              System.out.println("Enter the value in Fahrenheit: ");
              double Fahrenheit1 = input.nextDouble();
              if(Fahrenheit1 <= -460){System.out.println("Invalid Input");}
              else{
              double Celsius1 = ((Fahrenheit1 - 32) * (5/9));
              System.out.println(Fahrenheit1 + " Degree Fahrenheit is equal to " + Celsius1 + " Degree Celsius");}
              break;

            case 3:
              System.out.println("Enter the value in Celsius: ");
              double Celsius2 = input.nextDouble();
              if(Celsius2 <= -273.15){System.out.println("Invalid Input");}
              else{
              double Kelvin = (Celsius2 + 273);
              System.out.println(Celsius2 + " Degree Celsius is equal to " + Kelvin + " Celsius");}
              break;

            case 4:
              System.out.println("Enter the value in Kelvin: ");
              double Kelvin2 = input.nextDouble();
              if(Kelvin2 < 0){System.out.println("Invalid Input");}
              else{
              double Celsius3 = (Kelvin2 - 273);
              System.out.println(Kelvin2 + " Kelvin is equal to " + Celsius3 + " Degree Celsius");}
              break;
            
            default:
            System.out.println("Invalid Input");
            break;}break;

      case 5:
        System.out.println("Which of the following unit do you want to convert?");
        System.out.println("1. Mole to No. of Atom/Molecules");
        System.out.println("2. Mole to Volume");
        System.out.println("3. Volume to Mole");
        System.out.println("4. Volume to No. of Atoms");
    
        System.out.println("Enter the serial number of your conversion: ");
        int choice5 = input.nextInt();
        switch(choice5){
            case 1:
              System.out.println("Enter the value in Mole: ");
              double Mole = input.nextDouble();
              double Atoms = Mole * 6.022e23;
              System.out.println(Mole + " Mole is equal to " + Atoms + " Atoms/Molecules.");
              break;

            case 2:
              System.out.println("Enter the value in Mole: ");
              double Mole1 = input.nextDouble();
              double Volume = Mole1 * 22.4;
              System.out.println(Mole1 + " Mole of given gas corresponds to " + Volume + " Liters of Volume at STP.");
              break;

            case 3:
              System.out.println("Enter the value in Liter: ");
              double Volume1 = input.nextDouble();
              double Mole2 = Volume1 / 22.4;
              System.out.println(Volume1 + " Liter of gas at STP corresponds to " + Mole2 + " Mole of Gas.");
              break;

            case 4:
              System.out.println("Enter the value in Liter: ");
              double Volume2 = input.nextDouble();
              double Atoms1 = (Volume2 / 22.4)*6.022e23;
              System.out.println(Volume2 + " Liter of gas at STP corresponds to " + Atoms1 + " Atoms/Molecules of Gas.");
              break;

            default:
            System.out.println("Invalid Input");
            break;}break;

      default:
      System.out.println("Invalid Input");
      break;
    }        
  }
}      