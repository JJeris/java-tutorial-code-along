import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        // takeUserInput();
        // concatStrings();
        outputStory();

    }

    /**
     * Takes in user input.
     * 
     */
    public static void takeUserInput() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Input a message in the cli: ");

        System.out.println(myScanner.nextLine());    
    }


    /**
     * Concatenates strings. 
     * 
     */
    public static void concatStrings() {
        System.out.println("Hello " + "World");

        Scanner myScanner = new Scanner(System.in);
        System.out.print("What's your name? ");

        System.out.println("Hi, " + myScanner.nextLine());
    }

    /**
     * Outputs the story.
     */
    public static void outputStory() {
        Scanner scanner = new Scanner(System.in);
        
        String name = scanner.nextLine();
        String job = scanner.nextLine();
        System.out.println("Once upon a time there was " + name + ", who was a " + job + ".");
        System.out.println("On the way to work, " + name + " reflected on life.");
        System.out.println("Perhaps " + name + " will not be a " + job + " forever.");


    }
}
