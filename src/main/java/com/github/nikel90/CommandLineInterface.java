package com.github.nikel90;

import com.github.nikel90.db.PersonalData;
import com.github.nikel90.db.Result;

import java.util.Scanner;

/**
 * Console operation interface.
 *
 * @author Bazhenov Nikita
 *
 */
public class CommandLineInterface {
    private static final int CHAR_LIMIT = 50;
    private static Scanner scanner;

    private CommandLineInterface() {
    }

    /**
     * Reading data from the console.
     * Saving data to an object.
     *
     * @return object PersonalData read from the console.
     */
    public static PersonalData getPersonalData() {
        String firstName;
        String secondName;
        String patronymicName;

        System.out.println("Enter the person's first name:");
        firstName = normalize(scanner.nextLine());
        System.out.println("Enter the person's second name:");
        secondName = normalize(scanner.nextLine());
        System.out.println("Enter the person's patronymic name:");
        patronymicName = normalize(scanner.nextLine());

        return new PersonalData(firstName, secondName, patronymicName);
    }

    /**
     * Open the scanner.
     */
    public static void openScanner() {
        scanner = new Scanner(System.in);
    }

    /**
     * Closed the scanner.
     */
    public static void closeScanner() {
        scanner.close();
    }

    /**
     * Output to the console of the PersonalData object.
     *
     * @param personalData Object PersonalData.
     */
    public static void printPersonData(PersonalData personalData) {
        System.out.println(personalData.toString() + System.lineSeparator());
    }

    /**
     * Output to the console of the result object.
     *
     * @param result Object result.
     */
    public static void printResult(Result result) {
        System.out.println(result.toString());
    }

    /**
     * Normalize the string to the correct form.
     * Convert to lowercase
     * Check all constraints (length < 50 etc.).
     * If the string is more than 50 characters, the string will be truncated to 50.
     * Delete all (N@ ., -="+-/*;:?()}{[]|!'#$%^&_\<>~, and space)
     *
     * @param source The source String.
     * @return Normalize string.
     */
    static String normalize(String source) {
        source = source.replaceAll("[^\\p{L}\\p{N}]+", "").toLowerCase();

        if (source.length() <= CHAR_LIMIT) {
            return source;
        } else {
            System.out.println("The character limit has been exceeded. The string is trimmed to 50 characters!");
            return source.substring(0, CHAR_LIMIT);
        }
    }
}
