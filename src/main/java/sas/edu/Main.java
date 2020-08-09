package sas.edu;

public class Main {

    public static void main(String[] args) {

        String abba = "ABba";
        PalindromeService palindromeService = new PalindromeService(abba);
        System.out.println(palindromeService.isValid());
    }
}
