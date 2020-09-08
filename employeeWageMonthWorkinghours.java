import java.util.*;
public class dailyEmployeeWage
{
        public static void main(String args[])
        {
                int fullTime=1;
                int partTime=2;
                int wagePerHour=20;
                int fullDayHour=8;
                int partTimeHour=4;
                int empCheck,dailyWage,workingDay;
                workingDay=0;
                dailyWage=0;
                int workingTime=0;
                int totalWage=0;
                Random rand=new Random();
                while(workingDay<20 && workingTime<100)
                {
                        empCheck=rand.nextInt(3);
                        if(empCheck == 1)
                        {
                                dailyWage=wagePerHour*fullDayHour;
                                System.out.println("Employee is Present, daily wage is :  " + dailyWage);
                                workingDay++;
                                totalWage=totalWage+dailyWage;
                                workingTime=workingTime+fullDayHour;
                        }
                        else if ( empCheck == 2 )
                        {
                                dailyWage=wagePerHour*partTimeHour;
                                System.out.println(" Employee is Part time , daily wage is " + dailyWage);
                                workingDay++;
                                totalWage=totalWage+dailyWage;
                                workingTime=workingTime+partTimeHour;
                        }
                        else
                        {
                                System.out.println(" Employee is absent ");
                        }
                }
                System.out.println("Monthly wage is  "  + totalWage + " Total working hour is " + workingTime );
                System.out.println(" Total working day is " + workingDay);
        }
}


