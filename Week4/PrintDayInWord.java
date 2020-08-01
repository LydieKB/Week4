import java.util.Scanner;

public class PrintDayInWord{
    public static void main(String[] args) {
        int day ;
        Scanner KB = new Scanner(System.in);
        System.out.println("Input the number; ");
        day = KB.nextInt();
      
        System.out.println(getWeekDay (day));
  
    }
    public static String getWeekDay (int day){

        String  WeekDay = " " ;
        switch (day){
            case 0 : WeekDay = "SUNDAY" ;
            break;
            case 1 : WeekDay =  "MONDAY";
            break ;
            case 2 : WeekDay = "TUESDAY" ;
            break;
            case 3 : WeekDay = "WEDNESDAY";
            break;
            case 4 : WeekDay = "THURSDAY" ;
            break;
            case 5 : WeekDay = "FRIDAY" ;
            break;
            case 6 : WeekDay = "SAMEDI";
            break ;
            default : WeekDay = "NOT A VALID DAY";
        }
        return WeekDay ;
    }
    
}