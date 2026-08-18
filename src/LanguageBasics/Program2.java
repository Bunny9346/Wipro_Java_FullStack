package LanguageBasics;

public class Program2 {
     public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide an argument.");
            return;
        }
        
        System.out.println("Welcome " + args[0]);
    }
}
