package com.github.nikel90;

import com.github.nikel90.db.PersonalData;
import com.github.nikel90.db.Result;

/**
 * A program which inputs two PersonalData objects and checks for equivalence by a character-by-character comparison of elements.
 * The output is the result and the number of mismatched characters in the object elements.
 *
 * @author Bazhenov Nikita
 *
 */
public class Main {
    public static void main(String[] args) {
        CommandLineInterface.openScanner();
        PersonalData firstPersonalData = CommandLineInterface.getPersonalData();
        CommandLineInterface.printPersonData(firstPersonalData);
        PersonalData secondPersonalData = CommandLineInterface.getPersonalData();
        CommandLineInterface.printPersonData(secondPersonalData);
        CommandLineInterface.closeScanner();

        int firstNamesDiff = DamerauLevenshtein.calculateDistance(firstPersonalData.getPatronymicName(), secondPersonalData.getFirstName());
        int secondNamesDiff = DamerauLevenshtein.calculateDistance(firstPersonalData.getSecondName(), secondPersonalData.getSecondName());
        int patronymicNamesDiff = DamerauLevenshtein.calculateDistance(firstPersonalData.getPatronymicName(), secondPersonalData.getPatronymicName());

        int finalErr = 0;

        finalErr = Util.countError(finalErr, firstNamesDiff);
        finalErr = Util.countError(finalErr, secondNamesDiff);
        finalErr = Util.countError(finalErr, patronymicNamesDiff);

        Result result;
        if (finalErr == 0) {
            result = new Result(true, finalErr);
        } else {
            result = new Result(false, finalErr);
        }

        CommandLineInterface.printResult(result);
    }
}

