/*
 * Problem Statement

Oviya is fascinated by automorphic numbers and wants to create a program to determine whether a given number is an automorphic number or not.

An automorphic number is a number whose square ends with the same digits as the number itself. For example, 25 = (25)2 = 625 

Oviya has defined two interfaces, NumberInput for taking user input and AutomorphicChecker for checking if a given number is automorphic. The class AutomorphicNumber implements both interfaces.

Help her to complete the task.
Input format :
The input consists of a single integer n.
Output format :
If the input number is an automorphic number, print "n is an automorphic number".
Otherwise, print "n is not an automorphic number".

Refer to the sample output for formatting specifications.
Code constraints :
1 ≤ n ≤ 500
Sample test cases :
Input 1 :
25
Output 1 :
25 is an automorphic number
Input 2 :
7
Output 2 :
7 is not an automorphic number
 */

interface NumberInput{

    void input(int a);

}

interface AutomorphicChecker{

    void Checker();

}

class AutomorphicNumber implements NumberInput,AutomorphicChecker{

    int a;

    public void input(int a){
        this.a = a;
    }

    public void Checker(){

        int a = this.a;

        int n = a;

        int s = a*a;

        int rem = 1;

        int count = 0;

        while(n>0){

            count++;
            n = n/10;
        }

        for(int i=1; i<=count; i++){

            rem = rem *10 ;
        }

        if(s%rem == a){

            System.out.println("automorphic");
        } else{

            System.out.println("not");
        }
    }

}

class Main{

    public static void main(String[] args) {
        
        AutomorphicNumber obj1 = new AutomorphicNumber();

        obj1.input(376);
        obj1.Checker();
    }
}