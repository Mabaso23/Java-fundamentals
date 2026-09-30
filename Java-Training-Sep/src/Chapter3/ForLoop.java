package Chapter3;

public class ForLoop {
    public static void main(String[] args){
        // Display Jaba 5 times

        //Single condition
        System.out.println("=========================Single condition========================");
        for(int x = 1; x <= 5; x++){
            System.out.println(x + " - Java");

        }

        //multiple conditions
        System.out.println("=========================Multiple condition========================");
        for(int x = 1, y = 10; x <=5; x++, y-- ){
            System.out.println(x + " - " + y);


        }
        //Compound conditions
        System.out.println("=========================Compound condition========================");
        for(int x = 1, y = 10; x <= 5 || y == 3; x++, y-- ){
            System.out.println(x + " - " + y);

        }


    }
}
