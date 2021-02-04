package com.company;

import java.util.Random;

public class Main {
    static Random r = new Random();

    public static void main(String[] args) {
	// write your code here
        double rand = Math.random();
//        System.out.println(""+rand);

        /**
         * Question 2
         */

        int number = r.nextInt(100) + 0;

        //Checking if number is odd or even
        if (number % 2 == 0){
            System.out.println(number + " is even");
        }else{
            System.out.println(number + " is odd");
        }

        //Cheking the scale
        if (number == 0){
            System.out.println("Frozen");

        }else if (number >= 1 && number <= 14){

            System.out.println("Cold");
        }else if (number >= 15 && number <= 24){

            System.out.println("Cool");

        }else if (number >= 25 && number <= 40){

            System.out.println("warm");

        }else if (number >= 41 && number <= 60){

            System.out.println("hot");

        }else if (number >= 61 && number <= 80){

            System.out.println("very hot");

        }else if (number >= 81 && number <= 99){

            System.out.println("extremely hot");

        }else if (number == 100){
            System.out.println("Boiling");
        }

        /**
         * Question 3
         */
        number = r.nextInt(9) + 0;

        System.out.print("Random number is : ");

        if (number == 1){

            System.out.println("One");

        }else if (number == 2){

            System.out.println("two");

        }else if (number == 3){

            System.out.println("three");

        }else if (number == 4){

            System.out.println("four");

        }else if (number == 5){

            System.out.println("five");

        }else if (number == 6){

            System.out.println("six");

        }else if (number == 7){

            System.out.println("seven");

        }else if (number == 8){

            System.out.println("eight");

        }else if (number == 9){

            System.out.println("nine");

        }


        /**
         * Question 5
         */
        number = 1;

        for (int i = 1; i<= 10 ; i++){

            for (int j = 1; j<= 10 ; j++){

                System.out.println(i + " * "+ j +" = "+ i*j);

            }
            System.out.println();
        }

        /**
         * Question 6
         */
        System.out.println("Random number btn 1-49 is "+generateNumbers(49));




    }

    /**
     * Question 6
     * @return random number btn 49-1
     */
    public static int generateNumbers(int n){

        int number = r.nextInt(n-1) + 1;

        return number;
    }
}
