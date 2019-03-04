package site.gaoyisheng.tryCatchFinally;

public class Demo { 
    public static String output =""; 
    public static void foo(int i){ 
       try{ 
           if(i == 1){ 
              throw new Exception(); 
           } 
       }catch(Exception e){ 
           output += "2"; 
           return ; 
       }finally{ 
           output += "3"; 
       } 
       output += "4"; 
    } 
    
    public static void main(String[] args) { 
       foo(0); 
       foo(1); 
       System.out.println(output);//3423    "finally" executed abserlutelly. (include "return") 
    } 
}