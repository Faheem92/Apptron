package javat1a;
import java.util.Scanner;

public class JAVAT1a {

    public static void main(String[] args) 
    {
        char res;
        String name = null,fname = null,cls = null,lcls = null,engs,phys;
        int  rollno=0,lmarks=0,Adfee = 0,Mfee = 0,ECfee = 0,Sfee = 0,Tfee,eng = 0,phy = 0;
        
        Scanner s=new Scanner(System.in);
        Student obj=new Student();
        System.out.println("===========School Management System============");
        do{
        obj.setname(name);
        obj.setfname(fname);
        obj.setcls(cls);
        obj.setlcls(lcls);
        obj.setlmarks(lmarks);
        obj.setrollno(rollno);
        obj.setAdfee(Adfee);
        obj.setMfee(Mfee);
        obj.setECfee(ECfee);
        obj.setSfee(Sfee);
        obj.seteng(eng);
        obj.setphy(phy);
        obj.display();
        System.out.println("\nDo you want to Enter Data Of another student then press y:");
        res=s.next().charAt(0);
        }
        while(res=='y');
    } 
}
class Student
{
    Scanner s=new Scanner(System.in);
    String name,fname,cls,lcls,engs,phys;
    int marks,lmarks,rollno,Adfee,Mfee,ECfee,Sfee,Tfee,eng,phy;
    
    public void display()
    {
        System.out.println("==============Student ID===============");
        System.out.println("\nStudent Name:\t\t\t"+getname());
        System.out.println("Father Name:\t\t\t"+getfname());
        System.out.println("Class:\t\t\t\t"+getcls());
        System.out.println("Last Class Attended:\t\t"+getlcls());
        System.out.println("Last Class Marks:\t\t"+getlmarks());
        System.out.println("Roll No:\t\t\t"+getrollno());
        System.out.println("\n============Fee Structure=============");
        System.out.println("\nAdmission Fee:\t\t\tRs."+getAdfee());
        System.out.println("Monthly Fee:\t\t\tRs."+getMfee());
        System.out.println("Extra Curricullar Fee:\t\tRs."+getECfee());
        System.out.println("Sports Fee:\t\t\tRs."+getSfee());
        System.out.println("Total Fee=\t\t\tRs."+getTfee());
        System.out.println("\n===========Academic Record=============");
        System.out.println("English Status:\t\t\t"+getengs());
        System.out.println("Physics Status:\t\t\t"+getphys());
    }
    
    public void setname(String name)
    {
        System.out.println("Enter Student Name:");
        this.name=s.nextLine();
    }
    public void setfname(String fname)
    {     
        System.out.println("Enter Father Name:");
        this.fname=s.nextLine(); 
    }
    public void setcls(String cls)
    {     
        System.out.println("Enter Class:");
        this.cls=s.nextLine(); 
    }
    public void setlcls(String lcls)
    {     
        System.out.println("Enter Last Class attended:");
        this.lcls=s.nextLine(); 
    }
    public void setlmarks(int lmarks)
    {     
        System.out.println("Enter last class Marks Scored:");
        this.lmarks=s.nextInt();
    }
    public void setrollno(int rollno)
    {     
        System.out.println("Enter Student Roll No.(In no.):");
        this.rollno=s.nextInt(); 
    }
    public void setAdfee(int Adfee)
    {     
        System.out.println("Admission Fee:");
        this.Adfee=s.nextInt(); 
    }
    public void setMfee(int Mfee)
    {     
        System.out.println("Monthly Fee:");
        this.Mfee=s.nextInt(); 
    }
    public void setECfee(int ECfee)
    {     
        System.out.println("Extra Curricular Fee:");
        this.ECfee=s.nextInt(); 
    }
    public void setSfee(int Sfee)
    {     
        System.out.println("Sports Fee:");
        this.Sfee=s.nextInt(); 
    }
    public void seteng(int eng)
    {     
        System.out.println("English Marks:");
        this.eng=s.nextInt(); 
    }
    public void setphy(int phy)
    {     
        System.out.println("Physics Marks:");
        this.phy=s.nextInt(); 
    }
     
    String getname()
    {
    return this.name;
    }
    String getfname()
    {
    return this.fname;
    }
    String getcls()
    {
    return this.cls;
    }
    String getlcls()
    {
    return this.lcls;
    }
    int getlmarks()
    {
    return this.lmarks;
    }
    int getrollno()
    {
    return this.rollno;
    }
    int getAdfee()
    {
    return this.Adfee;
    }
    int getMfee()
    {
    return this.Mfee;
    }
    int getECfee()
    {
    return this.ECfee;
    }
    int getSfee()
    {
    return this.Sfee;
    }
    int getTfee()
    {
    Tfee=Adfee+Mfee+ECfee+Sfee;
    return this.Tfee;
    }
    String getengs()
    {
    if (eng<40)
        {
        engs="Fail";
        }
        else
        {
        engs="Pass";
        }           
    return this.engs;
    }
    String getphys()
    {
    if (phy<40)
        {
        phys="Fail";
        }
        else
        {
        phys="Pass";
        }   
    return this.phys;
    }  
}