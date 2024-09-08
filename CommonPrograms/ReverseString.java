package com.commomPrograms;

/*

#String class represents character strings,

#We can instantiate String in two ways.

#String Literals
String s1 = "Hello";  // Creates a string literal

#New String Objects
String s2 = new String("Hello");  // Creates a new String object in heap memory

#String Literals are more memory efficient as it doesnt create a new object every time.

#String is .

#Immutability of strings in Java is achieved through the use of a final class and a final field for the character array:

public final class String {
    private final char[] value;

    public String(String original) {
        // Copying character array to ensure immutability
        this.value = Arrays.copyOf(original.value, original.value.length);
    }

    // Other methods...
}


#StringBuffer and StringBuilder are mutable classes.


## A palindrome is a word, sentence, verse, or even number that reads the same backward or forward ##


 */


public class ReverseString {
    static String actual ="Hello Baba";

    //Stringbuilder -> Not synchronized, Not thread-safe.,  Better performance
    void stringbuilder(String actual) {
        StringBuilder sb = new StringBuilder(actual);
        System.out.println(sb.reverse().toString());
    }
    //StringBuffer -> Synchronized, thread-safe, slow performance
    void stringbuffer(String actual) {
        StringBuffer sb = new StringBuffer(actual);
        System.out.println(sb.reverse().toString());
    }
    //CharAt -> String to Char array
    void StringTochar(String actual) {
        String reverse = "";
        for (int i = actual.length() - 1; i >= 0; i--) {
            reverse = reverse + actual.charAt(i);
        }
        System.out.println(reverse);
    }
    //Recursion
    void recurrsionreverse(String actual) {
        if (actual.isEmpty()) {
            System.out.println(actual);
        } else {
            System.out.print(actual.charAt(actual.length() - 1));
            recurrsionreverse(actual.substring(0, actual.length() - 1));
        }
    }

    void palindromeCheck(String actual) {
        StringBuilder sb = new StringBuilder(actual);
        if(sb.reverse().toString().equals(actual)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }


    void mutablityCheck(){

        //String -> immutable(Values can't be changed)
        String s1 = "Hello";
        String s2 = s1.concat("Baba");

        System.out.println("String: "+ s1);
        System.out.println("String: "+ s2);

        //StringBuilder -> mutable(Values can be changed)
        StringBuilder sb = new StringBuilder("Hello");
        StringBuilder sb1 = sb.append(" Baba");
        System.out.println("StringBuilder: "+ sb);
        System.out.println("StringBuilder: "+ sb1);

        //StringBuffer -> mutable(Values can be changed)
        StringBuffer sbf = new StringBuffer("Hello");
        StringBuffer sbf1 = sbf.append("Baba");
        System.out.println("StringBuffer: "+ sbf);
        System.out.println("StringBuffer: "+ sbf1);

    }

    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        obj.stringbuilder(actual);
        obj.stringbuffer(actual);
        obj.StringTochar(actual);
        obj.recurrsionreverse(actual);
        obj.mutablityCheck();
        obj.palindromeCheck("MADAMI");
    }


}
