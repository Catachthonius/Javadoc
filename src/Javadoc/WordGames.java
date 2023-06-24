package Javadoc;

//Create a class called WordGames that has two methods:
//addHelloWord method that takes one parameter as input called word and returns the String Hello [wordHere]
//getFullName method that takes two parameters as input called name and surname and returns their concatenation

import java.util.Scanner;

public class WordGames {

    Scanner input = new Scanner(System.in)

    void addHelloWord(){
        System.out.println("Enter word: ");
        String word = input.nextLine();
        System.out.println("Hello " + word);
    }

    void getFullName(){
        System.out.println("Insert your name: ");
        String name = input.nextLine();
        System.out.println("\n Insert your surname: ");
        String surname = input.nextLine();
        System.out.println(name + " " + surname);
    }

    //The author is Antonio Antinoro
    //The class WordGames contains two methods:
    //the method "addHelloWord" takes a word as input and prints "Hello" followed by that word;
    //the method "getFullName" takes name and surname as input and prints them together.

}
