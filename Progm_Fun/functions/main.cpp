#include <iostream>

using namespace std;

/**
  Question 1
*/
int input(int num_1, int num_2){


    return num_1 + num_2;

}

/**
Question 2
*/

// Function with parameter type of int
void output(int number){

    cout<<typeid(number).name()<<endl;
}

// Function with parameter type of string
void output(string word){

    cout<<typeid(word).name()<<endl;
}

//Function with  parameter type of char
void output(char letter){

    cout<<typeid(letter).name()<<endl;
}

//Function with paarmeter type of float
void output(float decimal){

    cout<<typeid(decimal).name()<<endl;
}

//Function with paarmeter type of long
void output(long long_decimal){

    cout<<typeid(long_decimal).name()<<endl;
}

/**
Question 6
*/
double factorial(int number){

    double factorial = 1;

    for(int i = 1; i <= number;i++){

        factorial *= i;
    }

    return factorial;
}


int main()
{

    /**
   Question 1
   */

   cout<<"Result is "<<input(1,2)<<endl;

   /**
   Question 2
   */
   output(23); // int function
   output('A'); // char
   string word = "Word";
   output(word); // string function

   float decimal = 3.14;
   output(decimal); // float function

   long long_decimal = 7.1234456778;
   output(long_decimal); // float function

   /**
   Question 6
   */
   //cout<<"Factorial of 4 = "<<factorial(4)<<endl;

    return 0;
}
