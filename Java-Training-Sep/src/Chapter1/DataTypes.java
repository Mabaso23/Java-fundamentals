package Chapter1;



public class DataTypes {
    public static void main(String[] args){
       //Declare
        int intAge;
        short number = 5;
        long longAge = 25;
        double salary = 5000.00;
        float wage = 5000.00f;
        boolean isEmployed;
        char letter = 'A';
        String sDay = "Today is Monday";

        //Assign
        intAge = 36;
        isEmployed = false;


        //Use
        System.out.println("Age(" + intAge + ", " + longAge + ")");
        System.out.println("Salary " + salary);
        System.out.println("Wage " + wage);
        System.out.println("Employed? " + isEmployed);
        System.out.println("Letter " + letter);
        System.out.println("Day " + sDay);
        System.out.println( "Number " + number);
    }
}
