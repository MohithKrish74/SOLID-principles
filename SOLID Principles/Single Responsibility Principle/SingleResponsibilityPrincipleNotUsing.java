package com.keyword;

class Student       // A class containing multiple functions.This violates Single Responsibility Principle.
{
    public void studentId()
    {
        System.out.println("Id : 1");
    }
    public void studentName()
    {
        System.out.println("Name : Ram");
    }
    public void studentAge()
    {
        System.out.println("Age : 18");
    }
    public void studentGender()
    {
        System.out.println("Gender : Male");
    }
    public void studentStandard()
    {
        System.out.println("Student Standard : 10th ");
    }
    public void schoolName()
    {
        System.out.println("School Name : Montessori");
    }
    public void studentRank()
    {
        System.out.println("Student Rank : 2");
    }
    public void studentTotalMark()
    {
        System.out.println("Student Mark : 490/500");
    }
    public void studentDepartment()
    {
        System.out.println("Student Department : Computer Science");
    }
    public void schoolFee()
    {
        System.out.println("School Fee : 30,000");
    }
}

public class SingleResponsibilityPrincipleNotUsing
{
    public static void main(String[] args)
    {
        Student obj = new Student();
        System.out.println("The Details are : ");
        obj.studentId();
        obj.studentName();
        obj.studentAge();
        obj.studentGender();
        obj.studentStandard();
        obj.schoolName();
        obj.studentRank();
        obj.studentTotalMark();
        obj.studentDepartment();
        obj.schoolFee();
    }
}
