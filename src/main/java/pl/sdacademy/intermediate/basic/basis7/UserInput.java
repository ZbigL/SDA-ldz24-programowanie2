package pl.sdacademy.intermediate.basic.basis7;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int gameNumber = 0;
        int wins = 0;

        //Czy gramy ponownie?
        boolean isGameFinished = false;
        while (!isGameFinished) {

            //Pojedyncza gra

            gameNumber++;
            char[] word = Words.drawWord().toCharArray();
            boolean[] guessedLetters = new boolean[word.length];
            System.out.printf("\nSłowo sklada sie z %d liter.\n", word.length);
            int healthPoints = 5;

            while (healthPoints > 0 && !isWordGuessed(guessedLetters)) {
                System.out.println(" Podaj jedna litere");
                char[] input = putLettersIn().toCharArray();
                // sprawdzenie czy uzytkownik podal wiecej niz jedna litere
                if (input.length > 1) {
                    System.out.println("Wprowadziłes więcej niż jedna litere. \nPrzegrales :(");
                    break;
                }
                char letter = input[0];
                boolean losehealth = true;
                //sprawdzenie czy slowo zawiera litere , jesli tak to ujawnienie jej w tablicy odgadnioneLitery + zmniejszenie zmiennej hp
                for (int i = 0; i < word.length; i++) {
                    if (letter == word[i]) {
                        guessedLetters[i] = true;
                        losehealth = false;
                    }
                }
                if (losehealth) healthPoints--;
                showWordStatus(word, guessedLetters);

                if (isWordGuessed(guessedLetters)) {
                    System.out.println("\n O D G A D L E S,  G R A T U L A C J E !!!");
                    wins++;
                } else if (healthPoints > 0) System.out.printf(" - pozostały Ci %d życia", healthPoints);
                else System.out.println("Straciłes ostatnie życie. Nie odgadles slowa");
            }

            if (Words.wordsList.size() > 0) {
                System.out.println("Jeśli chcesz zagrac ponownie wpisz tak");
                if (!putLettersIn().equals("tak")) {
                    isGameFinished = true;
                    System.out.printf("\nZagrales %d razy. Wygrales %d razy, Przegrales %d razy. Do widzenia", gameNumber, wins, (gameNumber - wins));
                } else System.out.println("GRAMY PONOWNIE");
            } else {
                isGameFinished = true;
                System.out.printf("\nWykorzystałeś wszytkie dostępne słowa. Musimy zakończyć grę.\nZagrales %d razy. Wygrales %d razy, Przegrales %d razy. Do widzenia", gameNumber, wins, (gameNumber - wins));
            }
        }
    }


    public static boolean isWordGuessed(boolean[] guessedLetters) {
        boolean isWordGuessed = true;
        for (boolean c : guessedLetters) {
            if (!c) isWordGuessed = false;
        }
        return isWordGuessed;
    }

    public static void showWordStatus(char[] word, boolean[] guessedLetters) {
        for (int i = 0; i < word.length; i++) {
            if (guessedLetters[i] == true) System.out.print(word[i] + " ");
            else System.out.print("_ ");
        }

    }

    public static void showGameStatus(boolean isWordGuessed, char[] slowo, boolean[] guessedWord) {

        if (isWordGuessed) {
            System.out.println("\n O D G A D L E S,  G R A T U L A C J E !!!");
        } //else if (iloscZyc > 0) System.out.printf(" - pozostały Ci %d życia", iloscZyc);
    }

    public static String putLettersIn() {
        Scanner in = new Scanner(System.in);
        return in.next();
    }


}
