package Greatest ;
public class Greatest{
    public static void main(String[] args) {
    int X = 15 ;
    int Y = 10 ;
    int Z = 25 ;

    // Z>Y>X
    if (X>Y)
     {
         if (X>Z) {
            System.out.println("X is the greatest");    
         }
        else {
            System.out.println("Z is the greatest"); 
        }
    }    
    else if (Y>Z)
     {
        if (Y<X) {    
            System.out.println("Y is the greatest");
         } 
         else {
             System.out.println("Z is the greatest");
         }
    }
}
}