package org.example;

public class DNA {
    // Determine whether there is a protein in a strand of DNA
    public static void main(String... lol) {

        final String dnaStrain1 = "ATGCGATACGCTTGA";
        final String dnaStrain2 = "ATGCGATACGTGA";
        final String dnaStrain3 = "ATTAATATGTACTGA";

        String dnaToDiagnose = dnaStrain3;

        int lengthOfDna = dnaToDiagnose.length(); // Currently not in use
        String startCondon = "ATG";
        String stopCondon = "TGA";
        int indexOfStartCondon = dnaToDiagnose.indexOf(startCondon);
        int indexOfStopCondon = dnaToDiagnose.indexOf(stopCondon);
        int lengthOfCondon = indexOfStopCondon - indexOfStartCondon;
        boolean isCondonDivisibleByThree = ((lengthOfCondon % 3) == 0);
        int lengthOfStopCondon = stopCondon.length();

        // Check if start condon and stop condon exists
        if (indexOfStartCondon != -1 && indexOfStopCondon != -1 && isCondonDivisibleByThree) {
            String protein = dnaToDiagnose.substring(indexOfStartCondon, indexOfStopCondon + lengthOfStopCondon);
            System.out.println("Protein found in diagnosed strain " + dnaToDiagnose + "!\nProtein: " + protein);
        } else {
            System.out.println("No protein found in diagnosed strain " + dnaToDiagnose + ".");
        }
    }
}
