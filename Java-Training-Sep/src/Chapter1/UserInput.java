package Chapter1;


import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        String name;
        int age;
        double height;

        //assign
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter name: ");
        name=sc.nextLine();

        System.out.print("Enter age: ");
        age=sc.nextInt();

        System.out.print("Enter height: ");
        height=sc.nextDouble();
//use

        System.out.println("Name:"+ name);
        System.out.println("Age:"+ age);
        System.out.println("Height: "+ height);

    }
}
