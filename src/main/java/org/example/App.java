/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sabrina Lopez
 */

package org.example;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("\nEnter a noun: "); //output #1
        Scanner noun = new Scanner(System.in); //scan for noun
        String nounInput = noun.next();

        System.out.println("\nEnter a verb: "); //output #2
        Scanner verb = new Scanner(System.in); //scan for verb
        String verbInput = verb.next();

        System.out.println("\nEnter a adjective: "); //output #3
        Scanner adjective = new Scanner(System.in); //scan for adjective
        String adjectiveInput = adjective.next();

        System.out.println("\nEnter a adverb: "); //output #4
        Scanner adverb = new Scanner(System.in); //scan for adverb
        String adverbInput = adverb.next();

        System.out.println("\nDo you " + verbInput + " your " + adjectiveInput + " " + nounInput + " " + adverbInput + "?" + " That's hilarious!"); //output #5

    }
}