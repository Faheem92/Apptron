package javat1;
import java.util.Scanner;

public class JavaT1 {
    
    public static String name,fname,cls,lcls,rollno,engs,phys;
    public static int marks,lmarks,Adfee,Mfee,ECfee,Sfee,Tfee,eng,phy;
    
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        Stdid();
        fee();
        marks();
        System.out.println("===========School Management System============");
        display();
    }
    
    public static void Stdid()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Student Name:");
        name=s.next();
        System.out.println("Enter Father Name:");
        fname=s.next();
        System.out.println("Enter Class:");
        cls=s.next();
        System.out.println("Enter Last Class attended:");
        lcls=s.next();
     //   System.out.println("Enter Last Class Marks:");
     //   lmarks=s.nextInt();
        System.out.println("Enter Student Roll No.:");
        rollno=s.next();
    }
    
    public static void fee()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Admission Fee:");
        Adfee=s.nextInt();
        System.out.println("Monthly Fee:");
        Mfee=s.nextInt();
        System.out.println("Extra Curricullar Fee:");
        ECfee=s.nextInt();
        System.out.println("Sports Fee:");
        Sfee=s.nextInt();
        Tfee=Adfee+Mfee+ECfee+Sfee;
    }
    
    public static void marks()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("English Marks:");
        eng=s.nextInt();
        System.out.println("Physics Marks:");
        phy=s.nextInt();
        if (eng<40)
        {
        engs="Fail";
        }
        else
        {
        engs="Pass";
        }
        if (phy<40)
        {
        phys="Fail";
        }
        else
        {
        phys="Pass";
        }     
    }
    
    public static void display()
    {
        System.out.println("==============Student ID===============");
        System.out.println("\nStudent Name:\t\t\t"+name);
        System.out.println("Father Name:\t\t\t"+fname);
        System.out.println("Class:\t\t\t\t"+cls);
        System.out.println("Last Class:\t\t\t"+lcls);
        System.out.println("Last Class Marks:\t\t"+lcls);
        System.out.println("Roll No:\t\t\t"+rollno);
        System.out.println("\n============Fee Structure=============");
        System.out.println("\nAdmission Fee:\t\t\tRs."+Adfee);
        System.out.println("Monthly Fee:\t\t\tRs."+Mfee);
        System.out.println("Extra Curricullar Fee:\t\tRs."+ECfee);
        System.out.println("Sports Fee:\t\t\tRs."+Sfee);
        System.out.println("Total Fee=\t\t\tRs."+Tfee);
        System.out.println("\n===========Academic Record=============");
        System.out.println("English Status:\t\t\t"+engs);
        System.out.println("Physics Status:\t\t\t"+phys);
    }
}
