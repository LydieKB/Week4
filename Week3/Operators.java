
public class Operators{
    public static void main(String[] args){
        int num1 = 200;
        int num2 = 100 ;
        System.out.println("num1 + num2 : " + (num1 + num2));
        System.out.println("num1 - num2 : " + (num1 - num2));
        System.out.println("num1 * num2 : " + (num1 * num2));
        System.out.println("num1 / num2 : " + (num1/ num2));
        System.out.println("num1 % num2 : " + (num1 % num2));
       
        int num3 = 50 ;
        int num4 = 20 ;
        
        num3 = num4  ;
        System.out.println("= output : " +num3);
        num3 += num4 ;
        System.out.println("+= output: " +num3);
        num3 -= num4 ;
        System.out.println("-= output : " +num3);
        num3 *= num4 ;
        System.out.println("*= output : " +num3);
        num3 /= num4 ;
        System.out.println("/= output : " +num3);
        num3 %= num4 ;
        System.out.println("%= output: " +num3);

        int num5 = 30 ;
        int num6 = 50;
        num5 -- ;
        num6 ++ ;
        System.out.println(" num5 -- : " +num5);
        System.out.println( " num6 ++ : " +num6);

        boolean b1 = true;
        boolean b2 = false;
        System.out.println( "b1 && b2 : " + (b1 && b2));
        System.out.println(" b1 || b2 : " + (b1||b2));
        System.out.println(" !b1 : " + (!b1));

        int num7 = 10 ;
        int num8 = 20 ;
         if (num7 == num8){
        System.out.println("num7 and num8 are equal"); 
         } else {
           System.out.println("num7 and num8 are not equal");  
         }  
      if (num7 != num8) {
          System.out.println("num7 is not equal to num8");
      } else {
          System.out.println("num7 is equal to num8");
      } 
      if (num7 > num8) {
          System.out.println("num7 is greater than num8");
      } else {
        System.out.println("num7 is not greater than num8");  
      } 
      if (num7 < num8) {
          System.out.println("num7 is less than num8");
      } else {
          System.out.println("num7 is not less than num8");
      }  
      if (num7 >= num8) {
          System.out.println("num7 is greater or equal to num8");
      } else {
          System.out.println("num7 is less than num8");
      } 
      if (num7 <= num8) {
          System.out.println("num7 is less or equal to num8");
      } else {
          System.out.println("num7 is  than num8");
      }  

      int num9 = 13 ;  /* 13 = 0001101 */ 
      int num10 = 22 ; /* 22 = 0010110 */
      int result = 0 ;
      result = num9 & num10 ;
      System.out.println("num9 & num10 : " +result );
      result = num9 |num10 ;
      System.out.println("num9|num10 : "+result);
      result = num9 ^ num10 ;
      System.out.println("num9 ^ num10 : "+result);
      result = ~num10 ;
      System.out.println("~num10 : "+result);
      result = num10<< 2 ;
      System.out.println("num10 << 2: "+result);
      result = num9 >> 2 ;
      System.out.println("num9 >> 2: "+result);
    }     
} 