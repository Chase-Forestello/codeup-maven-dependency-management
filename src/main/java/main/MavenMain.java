// Complete - Java II - Dependency Management Exercise
package main;

import org.apache.commons.lang3.StringUtils;
import util.Input;

public class MavenMain {
    public static void main(String[] args) {
        Input input = new Input();
        String userInput = input.getString("Enter a number: ");
        System.out.println("Is " + userInput + " numeric?: " + StringUtils.isNumeric(userInput));

        userInput = input.getString("Enter a sentence: ");
        System.out.println("Your sentence with flipped case: " + StringUtils.swapCase(userInput));
        System.out.println("Your sentence reversed: " + StringUtils.reverse(userInput));
    }
}
