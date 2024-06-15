/* ***************
 *  Concept -
 *  Pass function as variable e.g x= foo();
 *  Pass function as parameter to another function e.g. getTotal(x, getInput());
 * */
package com.pkp.funtionalprogrammingconcept;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalProgrammingRunner {

    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Bat", "Cat", "Dog");
        List<Integer> numbers = List.of(2,6,8,10,12,16);
        printBasic(words);
        printBasicFP(words);
        printFPFilter(words);
        int sum = sumOfNumbers(numbers);
        System.out.println(sum);

        int sumOdd = sumOfOdd(numbers);
        System.out.println(sumOdd);

        sortNumbers(numbers);

        //Print squares of first 10 nos
        squares();

        //Map to lowercase and print them
        printLowerCase(words);

        //Map to length and print them
        printLength(words);

        //Print Max
        System.out.println("Max: "+printMax(numbers));

        //Print Min
        System.out.println("Min: "+printMin(numbers));

        //Print List of Odd numbers to another list
        System.out.println("List of Odd" +listofOdd(numbers));

        //Print List of Odd numbers to another list
        System.out.println("Squares of first 10 integers" +listofSquares());

        //Avoid nulls to be returns using Optionals -> orElse
        System.out.println("Avoid returning nulls: "+ optionalExample(numbers));

    }

    /* BEFORE */
    private static void printBasic(List<String> words) {
        for(String item : words) {
            System.out.println(item);
        }
    }

    /* AFTER FUNCTIONAL PROGRAMMING */
    private static void printBasicFP(List<String> words){
        words.stream().forEach(
                element -> System.out.println( "Element - " +element)
             );
    }

    /* AFTER FUNCTIONAL PROGRAMMING - FILTERING */
    private static void printFPFilter(List<String> words){
        words.stream()
                .filter(element -> element.endsWith("at"))
                .forEach(element -> System.out.println( "Element - " +element)
                );
    }

    /* AFTER FUNCTIONAL PROGRAMMING - SUM OF NUMBERS via reduce() */
    private static int sumOfNumbers(List<Integer> numbers){

        return numbers.stream()
                .reduce(0, (number1, number2) -> number1 + number2
                );
    }

    /* AFTER FUNCTIONAL PROGRAMMING - SUM OF ODD NUMBERS via reduce(), filter() */
    private static int sumOfOdd(List<Integer> numbers){

        return numbers.stream()
                .filter(number -> number % 2 != 0)
                .reduce(0, (number1, number2) -> number1 + number2
                );
    }

    /* Filter distinct numbers, square them and then sort it */

    private static void sortNumbers(List<Integer> numbers){
        numbers.stream()
                .distinct()
                .map(e -> e*e)
                .sorted()
                .forEach(element -> System.out.println(element));
    }

    private static void squares(){
        IntStream.range(1,11)
                 .map(e -> e*e)
                 .forEach(n -> System.out.println(n));
    }

    private static void printLowerCase(List<String> words){
        words.stream()
                .map(e -> e.toLowerCase())
                .forEach(w -> System.out.println(w));
    }

    private static void printLength(List<String> words){
        words.stream()
                .map( e -> e.length())
                .forEach(w-> System.out.println(w));
    }

    private static int printMax(List<Integer> numbers){
        return numbers.stream()
               .max((n1,n2) -> Integer.compare(n1,n2)).get();
    }

    private static int printMin(List<Integer> numbers){
        return numbers.stream()
                .min((n1,n2) -> Integer.compare(n1,n2)).get();
    }

    private static List<Integer> listofOdd(List<Integer> numbers){
        return numbers.stream()
                .filter(o-> o%2==1)
                .collect(Collectors.toList());
    }

    private static List<Integer> listofSquares(){
        return IntStream.range(1,11)
                .map(n-> n*n)
                .boxed()
                .collect(Collectors.toList());
    }

    private static int optionalExample(List<Integer> numbers){
        return numbers.stream()
                .filter(n-> n%2 ==1)
                .max((n1,n2) -> Integer.compare(n1,n2))
                .orElse(0);
    }



}