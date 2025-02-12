import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


class Question{
    int reverseDigit(int n ){

        int rev = 0;
        while(n != 0){
            int lastDig = n%10;
            rev = lastDig + rev*10;
            n = n/10;
        }
//        System.out.println("Reverse number is  : " + rev);
        return rev;
    }

    void convertBinaryToDecimal(int n){

        int power = 0;
        int decimal = 0;
        while(n > 0){
            int lastDig = n%10;
            decimal += lastDig * (int)Math.pow(2,power);
            power++;
            n = n/10;
        }
        System.out.println("The Decimal Number is :" + decimal);
    }

    void convertDecimalToBinary(int n){

        int binary = 0;
        int power = 0;
        while(n>0){
            int rem = n%2;
            n = n/2;
            binary+= rem * (int)Math.pow(10, power);
            power++;
        }
        System.out.println("Binary Number is : " + binary);
    }

    void primeNumberInRange(int n1, int n2){
        ArrayList<Integer>list = new ArrayList<>();
        for(int i = n1;i<= n2;i++){

            if(Main.isPrime(i)){
               list.add(i);
            }
        }
        System.out.println("Primes Numbers in this range : " + list);
    }

    void printPalindromeGivenRange(int n1, int n2){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = n1;i<= n2;i++){
            if(Main.isPalindrom(i)){
                list.add(i);
            }
        }
        System.out.println("Palindrome Number given range : " + list);
    }

    void sumOfDigit(int n){
        int ans = 0;
        while(n>0){
            int lastDigit = n%10;
            ans+= lastDigit;
            n = n/10;
        }
        System.out.println("Sum of Digits are  : " + ans);
    }

    void checkArmstrongNumber(int n){
        int org = n;
        int ans = 0;
        while(n>0){
            int last = n%10;
            ans+= (int)Math.pow(last, 3);
            n = n/10;
        }
       if(org == ans){
           System.out.println("IT'S ARMSTRONG NUMBER!");
       }else{
           System.out.println("IT'S NOT ARMSTRONG NUMBER!");
       }
    }

    void GCG(int n1 , int n2){

        int ans = 1;
        int min = Math.min(n1, n2);
        for(int i = min;i>0;i--){
           if(n1%i == 0 && n2%i == 0){
               ans = i;
               break;
           }
        }
        System.out.println("GCD is : " + ans);
//        return ans;
    }
    int recursionGCD(int a, int b){

        if(b == 0){return a;}

        return recursionGCD(b, a%b);
    }
    public void optimalGCD(int n1, int n2){
        while(n1>0 && n2>0){
            if(n1>n2){
                n1 = n1%n2;
            }else{
                n2 = n2%n1;
            }
        }
        if(n1 == 0){
             System.out.println("GCD IS (OPTIMAL) : -> " + n2);
//            return n2;
        }else{
             System.out.println("GCD IS (OPTIMAL) : -> " + n1);
//            return n1;
        }
    }

    void LCM(int n1, int n2){
        //Simple formula of LCM is : n1 * n2 / GCD(n1, n2);
        System.out.println("LCM IS : -> " + n1*n2/recursionGCD(n1, n2));
    }

    int printFactorial(int n){
        if(n == 0 || n == 1){return 1;}

        return n * printFactorial(n-1);
    }

    void findTheNumberOfDigits(int n){
//        System.out.println("The Number of Digits are : " + ((int)Math.log10(n) + 1));

        int cnt = 0;
        while(n > 0){
            int lastDig = n%10;
            cnt++;
            n = n/10;
        }
        System.out.println("The Number of Digits are : " + cnt);
    }

    void isPerfectNumber(int n){

        int sum = 0;
        for(int i = 1;i<n;i++){
            if(n%i == 0){
                sum+= i;
            }
        }
        if(sum == n){
            System.out.println("PERFECT NUMBER.");
        }else{
            System.out.println("NOT PERFECT NUMBER!!");
        }
    }

    void isHarshad(int n){

        int org = n;
        int sum = 0;
        while(n > 0){
            int lastDig = n%10;
            sum+= lastDig;
            n = n/10;
        }

        if(org%sum == 0){
            System.out.println("NUMBER IS HARSHAD.");
        }else{
            System.out.println("NUMBER IS'T HARSHAD!!");
        }
    }
    void sumOfNthNaturalNumber(int n){

        int sum = 0;
        for(int i = 1;i<= n;i++){
            sum+= i;
        }
        System.out.println("Sum of N'th natural number is : " + sum);
    }

    void sumOfSqrtOfNthNaturalNumber(int n){
        //same question do it for cube also.
        int sum = 0;
        for(int i = 1;i<= n;i++){
            sum+= (int)Math.pow(i, 2);
        }
        System.out.println("Sum of sqrt of N'th Natural number is : " + sum);
    }

    void cntPrimeInRange(int n1, int n2){

        int cnt = 0;
        ArrayList<Integer>list = new ArrayList<>();
        for(int i = n1;i<= n2;i++){
            if(Main.isPrime(i)){
                cnt++;
                list.add(i);
            }
        }
        System.out.println("Number of primes in this range is : " + cnt);
        System.out.println("PRIME NUMBER LIST : " + list);
    }

    void findNextPrimeNumberGreaterThanN(int n){

        int num = n;
        int ans = 0;
        while(true){
           if(num > n && Main.isPrime(num)){
               ans = num;
               break;
           }
           num++;
        }
        System.out.println("Next Greater prime number is : " + ans);
    }

    void findNextPalindromeGreaterThanN(int n){

        int num = n;
        int ans = 0;
        while(true){

            if(num > n && Main.isPalindrom(num)){
                ans = num;
                break;
            }
            num++;
        }
        System.out.println("Next greater Palindrome is  : "+ ans);
    }

    void convertDecimalIntoHexadecimal(int n){
//        System.out.println("Convert Decimal -> HexaDecimal : " + Integer.toString(n, 16));

    }

    void printFibonacciNthTerm(int n){

        if(n <= 0){ System.out.println("Please enter a valid input!!");}

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        int i = 0;
        int j = 1;
        while(list.size() < n){
            list.add(list.get(i) + list.get(j));
            i++;
            j++;
        }
        System.out.println("Fibonacci Sequence is : "  + list);
    }

    int findNthFibonacci(int n){

        if(n == 0){return 0;}
        if(n == 1){return 1;}

        return findNthFibonacci(n-1) + findNthFibonacci(n-2);
    }

    void doOpUntilSingleDigit(int n){
        //Find the sum of the digits of a number until it becomes a single digit.


//        while(n >= 10){
//            int sum = 0;
//            while(n>0){
//              sum+= n%10;
//              n = n/10;
//            }
//            n = sum;
//        }
//        System.out.println("Single Digit is : " + n);

        int xx = (n == 0) ? 0 : 1 + (n - 1) % 9;
        System.out.println("Single digit: " + xx);
    }

    void isAutomorphicNumber(int n){

        int xx = n*n;
        int tem = n;
        while(tem > 0){
            if(xx%10 != tem%10){
                System.out.println("FALSE!");
            }
            xx = xx/10;
            tem = tem/10;
        }
        System.out.println("TRUE");
    }

    void printMultiplicationTable(int n){

        System.out.println("--- MULTIPLICATION TABLE ---");
        for(int i = 1;i<= 10;i++){
            System.out.println(n + " * " + i + " = "+ n*i);
        }
    }

    void checkItPalindromeAfterAddRev(int n){

        int xx = n; //store original number.

        int revNum = 0;
        while(n!= 0){
            int lastDig = n%10;
            revNum = lastDig + revNum*10;
            n = n/10;
        }

        int xxx = xx + revNum;
        if(Main.isPalindrom(xxx)){
            System.out.println(xxx);
        }
    }

    //Replace even numbers with "Even" and odd numbers with "Odd" in an array..
    void replaceNumber(int[]num){

        ArrayList<String> list = new ArrayList<>();
        for(int xx : num){
            if(xx % 2 == 0){
                list.add("EVEN");
            }else{
                list.add("ODD");
            }
        }
        System.out.println(list);
    }

}



public class Main {
    static boolean isPrime(int n ){

        int cntFactors = 0;
        for(int i = 1;i<=n;i++){
            if(n%i == 0){
                cntFactors++;
            }
        }
        return cntFactors == 2;
    }
    static boolean isPalindrom(int n){
        int actualNumber = n;
        int revNumber = new Question().reverseDigit(n);
        return actualNumber == revNumber;
    }


    public static void main(String[] args) {


        Question question  = new Question();


        question.reverseDigit(1234);
        question.convertBinaryToDecimal(1010);
        question.convertDecimalToBinary(12);
        question.primeNumberInRange(10, 30);
        question.printPalindromeGivenRange(100, 150);
        question.sumOfDigit(456);
        question.checkArmstrongNumber(153);
        question.GCG(36, 60);
        System.out.println(question.recursionGCD(36, 60));
        question.optimalGCD(36, 60);
        question.LCM(6, 8);
        System.out.println("Factorial is : " + question.printFactorial(5));
        question.findTheNumberOfDigits(12345);
        question.isPerfectNumber(28);
        question.isHarshad(18);
        question.sumOfNthNaturalNumber(10);
        question.sumOfSqrtOfNthNaturalNumber(3);
        question.cntPrimeInRange(10, 50);
        question.findNextPrimeNumberGreaterThanN(14);
        question.findNextPalindromeGreaterThanN(123);
        question.convertDecimalIntoHexadecimal(255);
        question.printFibonacciNthTerm(15);
        System.out.println("N'th Fibonacci is : " + question.findNthFibonacci(7));
        question.doOpUntilSingleDigit(9875);
        question.isAutomorphicNumber(25);
        question.printMultiplicationTable(2);
        question.checkItPalindromeAfterAddRev(56);
        question.replaceNumber(new int[]{1, 2, 3, 4, 5});
    }
}
