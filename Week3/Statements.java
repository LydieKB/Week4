public class Statements {
    public static void main(String[] args) {
        int num = 50 ;
        if (num < 80) {
        
            System.out.println(" num is less than 80");
            }
            int num1 = 80 ;
            if (num1< 100) {
               System.out.println("num is greater than 100"); 
            }
            if (num1 > 50) {
             System.out.println("num is less than 50");   
            }
             int num2 = 100;
             if (num2< 70) {
                 System.out.println("num2 is less than 70");
             } else {
                System.out.println("num2 is greater than 70"); 
             } 
             int num3 = 1500;
             if (num3< 2000 && num3>= 900) {
                 System.out.println("taxes");
             }  
             else if (num3 > 2000 && num >=2500) {
                 System.out.println("taxes returns");
             }
             else if (num3 < 1000 && num3>= 1000) {
               System.out.println("amount due");  
             }
             else {
               System.out.println("error");  
             }
            }
        }