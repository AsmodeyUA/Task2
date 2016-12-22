package com.company;

import static com.company.Main.isPalindrome;

public class Main {

    //return True is String is Pallindrome
    //and return False in other case
    static boolean isPalindrome(String possiblePalindrome) {
        int lenWord = possiblePalindrome.length();
        for (int i = 0; i < lenWord / 2; i++)
            if (possiblePalindrome.charAt(i) != possiblePalindrome.charAt(lenWord - i - 1))
                return false;
        return true;
    }

    public static void main(String[] args) {
	    String pallindrome1="AbbAbbA";
        System.out.println(isPalindrome(pallindrome1));
        String pallindrome2="AbAb";
        System.out.println(isPalindrome(pallindrome2));
        String pallindrome3="AwbbAbbwA";
        System.out.println(isPalindrome(pallindrome3));
        String pallindrome4="QwerTrewq";
        System.out.println(isPalindrome(pallindrome4));
    }
}
