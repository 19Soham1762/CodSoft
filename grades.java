//Input: Take marks obtained (out of 100) in each subject.
//Calculate Total Marks: Sum up the marks obtained in all subjects.
//Calculate Average Percentage: Divide the total marks by the total number of subjects to get the average percentage.
//Grade Calculation: Assign grades based on the average percentage achieved.
//Display Results: Show the total marks, average percentage, and the corresponding grade to the user


import java.util.*;
public class grades
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        double physics_marks, chemistry_marks, biology_marks, mathematics_marks;
        System.out.println ("Enter the physics marks: ");
        physics_marks=sc.nextDouble();
        System.out.println ("Enter the chemistry marks: ");
        chemistry_marks=sc.nextDouble();
        System.out.println ("Enter the biology marks: ");
        biology_marks=sc.nextDouble();
        System.out.println ("Enter the mathematics marks: ");
        mathematics_marks=sc.nextDouble();

        double sum=physics_marks+chemistry_marks+biology_marks+mathematics_marks;
        double average= sum/4;

        System.out.println ("Your total score in 4 subjects is "+sum);
        System.out.println ("Your average score in 4 subjects (out of 100) is "+average);

        if (average >=90)
        {
            System.out.println ("You have got A+ Grade");
        }
        else if (average>=80 && average<=90)
        {
            System.out.println ("You have got A Grade");
        }
        else if (average>=70 && average<=80)
        {
            System.out.println ("You have got B+ Grade");
        }
        else if (average>=60 && average<=70)
        {
            System.out.println ("You have got C Grade");
        }
        else if (average>=50 && average<=60)
        {
            System.out.println ("You have got P Grade-Passed");
        }
        else
        {
            System.out.println ("You have got Failed in Exam");
        }
    }
}