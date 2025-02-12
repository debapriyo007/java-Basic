import java.util.*;



class MathQuestion{
   public int reverseNumber(int n ){
    int ans = 0;
    while(n>0){
      int lastDig = n%10;
      ans = lastDig + ans*10;
      n = n/10;
    }
    
    System.out.println( "AFTER REVERSE THE NUMBER  : - > "+ans);
    return ans;
  }
  //Convert any base to base.
  //Integer -> Binary.
  public void integerToBinary(int n){
    int binary = 0;
    int p = 0;
    while(n>0){
      int rem = n%2;
      n = n/2;
      binary+= rem * Math.pow(10, p);
      p++;
    }
    System.out.println("BINARY IS : -> " + binary);;
  }
  
  //Binary -> Integer.
  public void binaryToInteger(int n){
    int decimal = 0;
    int p = 0; 
    while(n>0){
      int lastDig = n%10;
      n = n/10;
      decimal += lastDig * Math.pow(2, p);
      p++;
    }
    System.out.println("DECIMAL IS : -> " + decimal);
  }
 
  public void power(int x, int n){
    //This is brute froce what happen if bigger value ? - > TLE!
    
    // int ans = 1;
    // for(int i = 0;i<n;i++){
    //   ans*= x;
    // }
    
    /*
    
    * This is solve using a beautifull Alog called : -> "FAST EXPONENSITIONAL"
    
     if, X^n ( n is even ) -> (X^2)*n/2
     if, X^n ( n is odd ) -> (X^2)*n-1/2
    
    */
    double ans = 1;
    long p  = n;
    
    while(x > 0){
      if(p%2 == 0){
        //power is even..
        x = x*x; //which is x(squre)
        p = p/2;
      }else{
        ans = ans*x;
        p = p-1;
      }
    }
    if(ans < 0){
       System.out.println("POWER OF NUMBER IS : -> " + 1/ans);
    }
    System.out.println("POWER OF NUMBER IS : -> " + ans);
  }
  
  public void countDigits(int n){
    int cnt = 0;
    while(n>0){
      int lastDig = n%10;
      cnt++;
      n/=10;
    }
    System.out.println("NUMBER OF DIGITS ARE : -> " + cnt);
  }
  
  public void isArmstrongNumber(int n ){
    
    int orgNumber = n;
    int xx = 0;
    while(n>0){
      int lastDig = n%10;
      xx+= Math.pow(lastDig, 3);
      n/= 10;
    }
    if(orgNumber  == xx){
      System.out.println("IT'S ARMSTRONG NUMBER :)");
    }else{
    System.out.println("NOT! ARMSTRONG NUMBER :(");
    }
  }
  
  public void isPalindromNumber(int n){
    int orgNumber = n;
    int revNum = reverseNumber(n);
    if(orgNumber == revNum){
      System.out.println("IT'S PALINDROM NUMBER :)");
    }else{
      System.out.println("NOT! PALINDROM NUMBER :(");
    }
  }

  public  void isPrime(int n){
        int cnt = 0;
        for(int i = 1;i<= n ;i++){
            if(n%i == 0){
                cnt++;
            }
        }
        if(cnt == 2){
            System.out.println("PRIME :) ");
        }else{
            System.out.println("NOT PRIME :(");
        }
    }
    
  public void printDivisorOfNumber(int n){
    ArrayList<Integer> list = new ArrayList<>();
    for(int i = 1;i<= n;i++){
      if(n%i == 0){
        list.add(i);
      } 
    }
    System.out.println("DIVISOR ARE : - > " + list);
  }
  
  public void GCD(int n1, int n2){
    int ans = 1;
    for(int i = 1;i<Math.min(n1, n2);i++){
      if(n1%i == 0 && n2%i == 0){
        ans = i;
      }
    }
    System.out.println("GCD IS : -> " + ans);
  }
  
  public int optimalGCD(int n1, int n2){
    while(n1>0 && n2>0){
      if(n1>n2){
        n1 = n1%n2;
      }else{
        n2 = n2%n1;
      }
    }
    if(n1 == 0){
      // System.out.println("GCD IS (OPTIMAL) : -> " + n2);
      return n2;
    }else{
      // System.out.println("GCD IS (OPTIMAL) : -> " + n1);
      return n1;
    }
  }
  
  public void LCM(int n1, int n2){
    //Simple formula of LCM is : n1 * n2 / GCD(n1, n2);
    System.out.println("LCM IS : -> " + n1*n2 / optimalGCD(n1, n2));
  }
  
  public void isPerfectNumebr(int n){
    //chcek if the number is prfect or not.
    // what is Parfect Number : 6 -> 1 + 2 + 3 = 6 sum of it's all factorial.
        int sum = 0;
        for(int i = 1;i<n;i++){
            if(n%i == 0){
                sum += i;
            }
        }
        if(sum == n){System.out.println("THIS IS PARFECT NUMBER :) ");};
        System.out.println("NOT! PARFECT NUMBER :) ");
    }
    
  public void checkOddEven(int n){
    if((n&1) == 0){
      System.out.println("THIS IS EVEN :)");
    }else{
      System.out.println("THIS IS ODD :(");
    }
  }


  void printPrimes(int n){
    int count = 0;
    boolean[] isPrime = new boolean[n+1];
    for(int i=0; i<=n; i++){
        isPrime[i] = true;
    }
    isPrime[0] = false;
    isPrime[1] = false;
    for(int i=2; i*i<=n; i++){
        if(isPrime[i]){
            for(int j=i*i; j<=n; j+=i){
                isPrime[j] = false;
            }
        }
    }
    for(int i=0; i<=n; i++){
        if(isPrime[i]){
            System.out.println(i + " ");
            count++;
        }
    }
    System.out.println("No of Primes are :"+ count);
}
  
}

public class AllMaths {
    public static void main(String[] args) {
      
      
      MathQuestion math = new MathQuestion();
      math.reverseNumber(1234);
      math.integerToBinary(7);
      math.binaryToInteger(111);
      math.power(2, 5);
      math.countDigits(970090);
      math.isArmstrongNumber(1532);
      math.isPalindromNumber(12211);
      math.printDivisorOfNumber(225);
      math.GCD(24, 36);
      math.optimalGCD(24, 36);
      math.LCM(24, 36);
      math.isPerfectNumebr(102);
      math.checkOddEven(12);
      
    }
    
}
