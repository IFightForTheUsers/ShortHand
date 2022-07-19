import java.util.Scanner;

public class ShortHand {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {

        System.out.print("Enter string to be Short-Handed: -> ");

        String orig = input.nextLine();

        System.out.println("Short-Handed:");

        if (orig.contains(" ")) {
            String[] strArray = orig.split(" ");
            for (String s : strArray) {
                shortHandMagic(s);
            }
        }
        else {
            shortHandMagic(orig);
        }
        
    }

    private static void shortHandMagic(String orig) {
        
        if(orig.length() > 2) {
            int origLength = orig.length();

            Character firstLetter = orig.charAt(0);
            Character lastLetter = orig.charAt(origLength - 1);

            int lettersInBetween = origLength - 2;

            System.out.print(firstLetter.toString() + lettersInBetween + lastLetter.toString() + " ");
        }
        else {
            System.out.print(orig + " ");
        }
        
    }
}
