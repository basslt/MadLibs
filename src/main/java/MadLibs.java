import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

/*
 * Create a unique Mad Libs story!
 * https://www.madtakes.com/libs/093.html
 */
public class MadLibs {

    // 1. Make a main method that includes all the steps below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random words = new Random();
        System.out.println("Welcome to Mad libs!");
        System.out.println("Please enter a Verb: ");
        String verb1 = scanner.nextLine();

        System.out.println("Please enter another verb ending in -ing: ");
        String verb2 = scanner.nextLine();
        // 4. Ask the player to enter a noun
        System.out.println("Please enter a noun: ");
        String noun = scanner.nextLine();
        // 5. Ask the player to enter an adjective
        System.out.println("Please enter an adjective: ");
        String adjective = scanner.nextLine();
        // 6. Ask the player to enter an occupation
        System.out.println("Please enter an Occupation: ");
        String occupation = scanner.nextLine();
        // 7. Ask the player to enter an animal
        System.out.println("Please enter an animal: ");
        String animal = scanner.nextLine();
        // 8. Ask the player to enter an adjective
        System.out.println("Please enter an adjective: ");
        String adjective2 = scanner.nextLine();
        // 9. Ask the player to enter a verb ending in 'ing'
        System.out.println("Please enter a verb ending in -ing: ");
        String verb3 = scanner.nextLine();
        // 10. Ask the player to enter a noun
        System.out.println("Please enter a noun: ");
        String noun2 =scanner.nextLine();
        // The quotes below have been written as a group of Strings joined together by + signs.
        // The story contains placeholders, indicated by [** **] which you need to replace with
        // the values entered by the player.
        // Note the \n characters represent newlines that move the following text onto the next line

        String quotes = "'My name is " + verb1 + " learn it well, for it`s the " + verb2 + " sound of your " + noun + ".'\n" +
                "'I told Killian I`d be " + adjective + ". I wouldn`t want to be a/an " + occupation + ".'\n" +
                "'I`m a cybernetic " + animal + ": living tissue over a/an " + adjective2 + " endoskeleton.'\n" +
                "'If things have gone wrong, I`m " + verb3 + " myself, and you`ve got a wet " + noun2 + " wrapped around your head.'\n" +
                "- Arnold Schwarzenegger";

        // 11. Print the quotes to the console to display the Mad Lib!
        System.out.println(quotes);

        /*
         * EXTRA:
         * Create a random word generator to allow the user to let the program
         * select a random word.
         */
    }
}

