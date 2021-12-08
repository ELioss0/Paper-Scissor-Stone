package fr.elioss.chifoumi;
import java.util.Scanner;
import java.util.Random;

public class Main {
    static String choiceBot;
    static String choiceInput;
    public static void main(String[] args) {
        game();
    }

    public static void game() {
    	Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Papier, Pierre ou Ciseaux :");
            choiceInput = input.nextLine();
            randomChoice();
            
            if(choiceInput.equals("Ciseaux") && choiceBot.equals("Papier")
                 ||choiceInput.equals("Papier") && choiceBot.equals("Pierre")
                 ||choiceInput.equals("Pierre") && choiceBot.equals("Ciseaux")){
                System.out.println(choiceInput + " contre " + choiceBot + ". Gagné !");
            }
            else if(choiceInput.equals("Papier") && choiceBot.equals("Ciseaux")
                     ||choiceInput.equals("Pierre") && choiceBot.equals("Papier")
                     ||choiceInput.equals("Ciseaux") && choiceBot.equals("Pierre")) {
                System.out.println(choiceInput + " contre " + choiceBot + ". Perdu...");
            }
            else {
                System.out.println(choiceInput + " contre " + choiceBot + ". Egalité ! (ou mauvaise entrée)");
            }
        }
    }
    
    public static void randomChoice() {
        Random r = new Random();
        int choiceRandom = r.nextInt(3);
        String choice[] = {"Pierre", "Papier", "Ciseaux"};
        choiceBot = choice[choiceRandom];
    }
    
}