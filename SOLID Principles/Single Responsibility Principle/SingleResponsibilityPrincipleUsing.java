package com.keyword;

class StudentId               // Each classes containing their own functions.This follows Single Responsibility Principle.
{
    public void printStudentId()
    {
        System.out.println("Id : 1");
    }
}

class StudentName
{
    public void printStudentName()
    {
        System.out.println("Name : Ram");
    }
}

class StudentAge
{
    public void printStudentAge()
    {
        System.out.println("Age : 18");
    }
}

class StudentGender
{
    public void printStudentGender()
    {
        System.out.println("Gender : Male");
    }
}

class StudentStandard
{
    public void printStandard()
    {
        System.out.println("Student Standard : 10th ");
    }
}

class StudentSchoolName
{
    public void printSchoolName()
    {
        System.out.println("School Name : Montessori");
    }
}

class StudentRank
{
    public void printRank()
    {
        System.out.println("Student Rank : 2");
    }
}

class StudentTotalMark
{
    public void printTotalMark()
    {
        System.out.println("Student Mark : 490/500");
    }
}
class StudentDepartment
{
    public void printDepartment()
    {
        System.out.println("Student Department : Computer Science");
    }
}

class StudentSchoolFee
{
    public void printSchoolFee()
    {
        System.out.println("School Fee : 30,000");
    }
}

public class SingleResponsibilityPrincipleUsing
{
    public static void main(String[] args)
    {
        StudentId id = new StudentId();
        StudentName name = new StudentName();
        StudentAge age = new StudentAge();
        StudentGender gender = new StudentGender();
        StudentStandard standard = new StudentStandard();
        StudentSchoolName schoolName = new StudentSchoolName();
        StudentRank rank = new StudentRank();
        StudentTotalMark totalMark = new StudentTotalMark();
        StudentDepartment department = new StudentDepartment();
        StudentSchoolFee schoolFee = new StudentSchoolFee();
        System.out.println("The Details are : ");
        id.printStudentId();
        name.printStudentName();
        age.printStudentAge();
        gender.printStudentGender();
        standard.printStandard();
        schoolName.printSchoolName();
        rank.printRank();
        totalMark.printTotalMark();
        department.printDepartment();
        schoolFee.printSchoolFee();
    }
}
