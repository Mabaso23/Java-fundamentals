package Chapter1;


public class ExploreStrings {

    public static void main(String[] args) {
        String sentence= "In Java, variables must be declared before they can be used.";

        System.out.println("Length: "+sentence.length());
        System.out.println("Position: "+sentence.indexOf("a",5,10));//5
        System.out.println("10th position has: "+sentence.charAt(10));

        System.out.println("Position: "+sentence.lastIndexOf("a",15));//counts backwards from right to left

    }
}
