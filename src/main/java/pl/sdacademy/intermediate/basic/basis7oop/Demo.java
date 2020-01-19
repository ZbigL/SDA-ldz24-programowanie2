package pl.sdacademy.intermediate.basic.basis7oop;

import java.util.Scanner;

public class Demo {
    private static int gameNumber = 0;
    private static int wins = 0;

    public static void main(String[] args) {
        //Czy kontynuujemy grę?
        boolean isGameFinished = false;
        while (!isGameFinished) {

            //Pojedyncza gra
            Game game = new Game();
            game.showWordInfo();
            gameNumber++;
            while (game.getHealthPoints() > 0 && !game.isWordGuessed()) {
                System.out.println("Podaj jedna litere");
                char[] input = putLettersIn().toCharArray();
                // sprawdzenie czy uzytkownik podal wiecej niz jedna litere
                if (input.length > 1) {
                    System.out.println("Wprowadziłes więcej niż jedna litere. \nPrzegrales :(");
                    break;
                }
                char letter = input[0];
                //sprawdzenie czy slowo zawiera litere , jesli tak to ujawnienie jej w tablicy odgadnioneLitery , jesli nie to zmniejszenie zmiennej hp
                if (!game.consistOf(letter)) {
                    game.decreaseHealthPoints();
                }
                game.showWordStatus();

                if (game.isWordGuessed()) {
                    System.out.println("\n O D G A D L E S,  G R A T U L A C J E !!!");
                    wins++;
                } else if (game.getHealthPoints() > 0)
                    System.out.printf(" - pozostały Ci %d życia.\n", game.getHealthPoints());
                else System.out.println("Straciłes ostatnie życie. Nie odgadles slowa");
            }

            if (Words.wordsList.size() > 0) {
                System.out.println("Jeśli chcesz zagrac ponownie wpisz tak");
                if (!putLettersIn().equals("tak")) {
                    isGameFinished = true;
                    showSummary();
                } else System.out.println("GRAMY PONOWNIE");
            } else {
                isGameFinished = true;
                System.out.printf("\nWykorzystałeś wszytkie dostępne słowa. Musimy zakończyć grę.");
                showSummary();
            }
        }
    }

    public static void showSummary() {
        System.out.printf("\nZagrales %d razy. Wygrales %d razy, Przegrales %d razy. Do następnego razu", gameNumber, wins, (gameNumber - wins));
    }

    public static String putLettersIn() {
        Scanner in = new Scanner(System.in);
        return in.next();
    }
}
