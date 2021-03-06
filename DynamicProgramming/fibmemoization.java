public class fibmemoization{
    public static long fibArray[]=new long[26];
 
 public static long fib(long n){
  long fibValue=0;
  if(n==0 ){
   return 0;
  }else if(n==1){
   return 1;
  }else if(fibArray[(int)n]!=0){
   return fibArray[(int)n];
  }else{
   fibValue=fib(n-1)+fib(n-2);
   fibArray[(int) n]=fibValue;
   return fibValue;
  }
 }
 
 public static void main(String args[]){
  fibArray[0]=1;
  fibArray[1]=1;
  long preTime=System.currentTimeMillis();
  System.out.println("Value of 25th number in Fibonacci series->"+fib(25));
  long postTime=System.currentTimeMillis();
  System.out.println("Time taken to compute in milliseconds->"+(postTime-preTime));
 }
}