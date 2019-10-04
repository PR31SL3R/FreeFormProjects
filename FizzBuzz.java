//For multiples of 3, print Fizz instead of the number.
//For the multiples of 5, print Buzz.
//For numbers which are multiples of both 3 and 5, print FizzBuzz.

public class FizzBuzz{
  
  
  
  
  
  public static void main(String[] args){
    
    for (int i =1; i <=100; i++){
      
      if ((i % 3 !=0) && (i % 5 !=0)){
        System.out.println(i);
      }
      
      if ((i % 3 ==0) && (i % 5 !=0) ){
      System.out.println("Fizz");
        
    }
     if (i % 5 ==0 && (i % 3 !=0)){
      System.out.println("Buzz");
       
    }
    
    if ((i % 3 ==0) && (i % 5 ==0)){
      System.out.println("FizzBuzz");
       
    }   
      
    }
    
  }
  
  
}