package pl.sdacademy.intermediate.basic.basis7oop;

public class Game {

    private int healthPoints;
    private char[] word;
    private boolean[] guessedLetters;

    public Game() {
        healthPoints = 5;
        word = Words.drawWord().toCharArray();
        guessedLetters = new boolean[word.length];
    }

    public void showWordInfo() {
        System.out.printf("\nSłowo sklada sie z %d liter.\n", word.length);
    }

    public boolean consistOf(char letter) {
        boolean flag = false;
        for (int i = 0; i < word.length; i++) {
            if (letter == word[i]) {
                guessedLetters[i] = true;
                flag = true;
            }
        }
        return flag;
    }

    public boolean isWordGuessed() {
        for (boolean c : guessedLetters) {
            if (!c) return false;
        }
        return true;
    }

    public void showWordStatus() {
        for (int i = 0; i < word.length; i++) {
            if (guessedLetters[i] == true) System.out.print(word[i] + " ");
            else System.out.print("_ ");
        }
    }

    public void decreaseHealthPoints() {
        healthPoints--;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}
