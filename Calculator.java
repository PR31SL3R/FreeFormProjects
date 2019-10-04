public class Calculator {


  
  Calculator() {
    }
  
  public int add(int a, int b){
    
    int addSum = (a + b);
    System.out.println(addSum);
    return addSum;
  }
  
  public int subtract(int a, int b){
    
    int subtractSum = (a - b);
    System.out.println(subtractSum);
    return subtractSum;
    
  }
  
  public int multiply(int a, int b){
    
    int multiplySum = (a*b);
    System.out.println(multiplySum);
    return multiplySum;
  }
  
  public int divide(int a, int b){
    if (b!=0){
      int divideSum = (a/b);
      System.out.println(divideSum);
      return divideSum;
    }
    System.out.println("cannot divide by zero");
    return 0;
  }
  
  public int modulo(int a, int b){
    if (b!=0){
     int moduloSum = (a%b);
      System.out.println(moduloSum);
      return moduloSum;
    }
    System.out.println("cannot divide by zero");
    return 0;
  }
  
  public int procent(int a, int b){
  int procent = ((a/100)*b);
  return procent;
  
  
  
  }
  
  
   
  
}