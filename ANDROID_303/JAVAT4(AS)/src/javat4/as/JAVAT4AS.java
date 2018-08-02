package javat4.as;
import java.util.Scanner;

public class JAVAT4AS {

    public static void main(String[] args)
    {
        String name = null, fullname=null, fname = null, date = null, time = null,nic=null;   
        int attd=0,otallow=0,basic = 0,advance = 0,basalary=0,tallow = 0,ballow = 0,allow = 0,bpm = 0;
        float tax = 0f,salary = 0f;
        
        Scanner s=new Scanner(System.in);
        Employee o=new Employee();
        
        System.out.println("========ACCOUNTING SYSTEM========");
        System.out.println("\n======EMPLOYEE PERSONAL INFORMATION(M1)======");
        System.out.println("\tEnter Employee Personal Data\n");
        o.setdate(date);
        o.settime(time);
        o.setname(name);
        o.setfullname(fullname);
        o.setfname(fname);
        o.setnic(nic);
        o.setattd(attd);
        
        System.out.println("\n==========SALARY INFORMATION (M2)===========");
        System.out.println("\tEnter Employee Salary Details");
        Salary obj=new Salary();
        obj.setbasic(basic);
        obj.setadvance(advance);
        obj.setbasalary(basalary);
        obj.setotallow(otallow);
        obj.settallow(tallow);
        obj.setattd(attd);
        obj.setballow(ballow);
        obj.setbonus(allow);
        obj.setbpm(bpm);
        obj.settax(tax);
        obj.setsalary(salary);
        o.display();
        obj.SalaryDetails();
    }
}

class Employee
        
{
    String name, fullname, fname, date, time, nic;   
    int attd,wdays,otallow;
    double per;
    public Scanner s=new Scanner(System.in);
    
     public void display()
    {
        System.out.println("\n===========EMPLOYEE BIODATA===========\n");
        System.out.print("DATE:"+java.time.LocalDate.now());
        System.out.println("\t\tTIME:"+java.time.LocalTime.now());
        System.out.println("\nName:\t\t\t"+getname());
        System.out.println("Full Name:\t\t"+getfullname());
        System.out.println("Father Name:\t\t"+getfname());
        System.out.println("NIC No:\t\t\t"+getnic()); 
        System.out.println("Attendence:\t\t"+getattd()+" out of "+wdays+" working Days"); 
        System.out.println("Overtime Allowance:\tRs."+getotallow());
    }
    
    public void setdate(String date)
    {
        this.date=date;
    }
    public void settime(String time)
    {
        this.time=time;
    }
    public void setname(String name)
    {   
        System.out.print("Enter Employee Name:\t\t\t");
        this.name=s.nextLine();
    }
    public void setfullname(String fullname)
    {   
        System.out.print("Enter Employee Full Name:\t\t");
        this.fullname=s.nextLine();
    }
    public void setfname(String fname)
    {
        System.out.print("Enter Employee Father Name:\t\t");
        this.fname=s.nextLine();
    }
    public void setnic(String nic)
    {   
        System.out.print("Enter Employee NIC:\t\t\t");
        this.nic =s.nextLine();
    }
    public void setattd(int attd)
    {
        System.out.print("Enter Employee Attendence :\t\t");
        this.attd=s.nextInt();
        System.out.print("Enter Total no. of working days:\t");
        wdays=s.nextInt();
    }
    public void setotallow(int otallow)
    {
        System.out.println("\n=====Setting Overtiem Allowance=====\n");
        System.out.print("Enter Employee Overtime Allowance:\t");
        this.otallow=s.nextInt();
    }
    
    String getdate()
    {   
        System.out.println(java.time.LocalDate.now());
        return date;
    }
    String gettime()
    {   
        System.out.println(java.time.LocalTime.now());
        return time;
    }
    String getname()
    {
        return name;
    }
    String getfullname()
    {
        return fullname;
    }
    String getfname()
    {    
        return fname;
    }
    String getnic()
    {       
        return nic;
    }
    int getattd()
    {
        return attd;
    }
    int getotallow()
    {
        return otallow;
    }  
}

class Salary extends Employee
{
    int basic,advance,basalary,tallow,ballow,allow,bpm;
    float tax,salary;
    
    public void SalaryDetails()
    {
        System.out.println("\n===========SALARY DETAILS ===========");
        System.out.println("\n____BASIC SALARY____");
        System.out.println("Basic Salary:\t\t\t"+getbasic());
        System.out.println("Advance Salary:\t\t\t"+getadvance());
        System.out.println("Total Salary:\t\t\t"+getbasalary());
        System.out.println("\n____ALLOWANCES____");
        System.out.println("Overtime Allowance:\t\tRs."+getotallow());
        System.out.println("Travelling Allowance:\t\tRs."+gettallow());
        System.out.println("Bonus Allowance:\t\tRs."+getballow());
        System.out.println("Total Allowances:\t\tRs."+getallow());
        System.out.println("\n____PER MONTH BONUS____");
        System.out.println("Bonus Per Month:\t\tRs."+getbpm());
        System.out.println("\n____TAX DEDUCTED____");
        System.out.println("Tax Amount:\t\t\tRs."+gettax());
        System.out.println("\n____NET SALARY____");
        System.out.println("Net Salary Receivable:\t\tRs."+getsalary());
    }
    
    public void setbasic(int basic)
    {
        System.out.println("\n=====Setting Basic Salary====");
        System.out.print("\nEnter Basic Salary:\t\t");
        this.basic=s.nextInt();
    }
    public void setadvance(int advance)
    {
        System.out.println("\n=====Setting Advance Salary====");
        System.out.println("\nSelect amount of Advance Salary you need");
        System.out.println("\n1.Not Required\n2.Half Basic Salary\n3.Full Basic Salary");
        System.out.print("\nEnter respective number:\t");
        int res=s.nextInt();
        switch (res) {
            case 1:
                this.advance=0;
                break;
            case 2:
                this.advance=(basic*50)/100;
                break;
            case 3:
                this.advance=basic;
                break;
            default:
                System.out.println("\nWrong Input.");
                System.out.println("\nYour Advance Salary is set at Rs.0\n");
                this.advance=0;
                break;
        }
    }
    public void setbasalary(int basalary)
    {
        this.basalary=basic+advance;
    }
    public void settallow(int tallow)
    {
        System.out.println("\n=====Setting Travelling Allowance====");
        System.out.println("\nTo set travelling allowance following options are given");
        System.out.println("\n1.Enter Fix Amount\n2.Calculate Amount (for per Km)");
        System.out.print("\nEnter the option:\t");
        int res=s.nextInt();
        if(res==1)
        {
            System.out.print("Enter Travelling Allowance:\t"); 
            this.tallow=s.nextInt();
        }
        else if(res==2)
        {
            float mileage,km,rate;
            System.out.print("\nEnter Kilometers covered:\t"); 
            km=s.nextFloat();
            System.out.print("Enter Fuel rate per liter:\t");
            rate=s.nextFloat();
            System.out.print("\nVehicle mileage:\t");
            System.out.println("\n1.Motorbike\t\t(Mileage=60km/l)\n2.800cc & below Car\t(Mileage=20km/l)"
                            + "\n3.1000cc & above Car\t(Mileage=12km/l)\n4.Enter Mileage Manually");
            System.out.print("\nEnter which option you want to select:\t");
            int r=s.nextInt();
            switch (r) 
            {
                case 1:
                    mileage=60.0f;
                    break;
                case 2:
                    mileage=20.0f;
                    break;
                case 3:
                    mileage=12.0f;
                    break;
                case 4:
                    System.out.print("Enter Mileage of vehicle:\t");
                    mileage=s.nextInt();
                    break;
                default:
                    System.out.print("Invalid Option Selected.\nEnter Mileage of vehicle:\t");
                    mileage=s.nextInt();
                    break;
            }
            this.tallow=(int) ((km/mileage)*rate);
        } 
    }
    @Override
    public void setattd(int attd)
    {
        System.out.println("\n=====Setting Bonus Allowance====");
        System.out.println("\nBonus allowance depends on your Attendence");
        System.out.println("\nFor <60% Rs.1000\nFor >=70% Rs.1400\nFor >=80% Rs.1600\nFor >=90% Rs.2000");
        System.out.print("\nEnter No.of Attended working days :\t");
        attd=s.nextInt();
        System.out.print("Enter Total no. of working days:\t");
        wdays=s.nextInt();
        per=(attd*100/wdays);
        System.out.println("\nEmployee Attendence is "+per+"%");
    }
    
    public void setballow(int ballow)
    {
        if(per>=90)
        {
            ballow=2000;
        }
        else if(per>=80)
        {
            ballow=1600;
        }
        else if(per>=70)
        {
            ballow=1400;
        }
        else 
        {
            ballow=1000;
        }
        this.ballow=ballow;
    }
    public void setbonus(int bonus)
    {
        bonus=otallow+tallow+ballow;
        this.allow=bonus;
    }
    public void setbpm(int bpm)
    {
        System.out.println("\n====Setting Bonus per Month====");
        
        do
        {   
            System.out.println("\nEmployee Categories");
            System.out.println("1.Non-Permanent Employee\n2.Permanent Employee (1 year)\n"
                          + "3.Permanent Employee (3 years)\n4.Permanent Employee (5 Years or more)\n");
            System.out.print("Select Employee category:\t");
            int select=s.nextInt();
            switch(select)
            {
                case 1:
                    System.out.println("\nNon-Permanent Employee doesn't own this benefit.");
                    bpm=basic*0;
                    break;
                case 2:
                    System.out.println("\nPermanent Employee (1 year) gets 10% of basic Salary per month");
                    bpm=(basic/10);
                    break;    
                case 3:
                    System.out.println("\nPermanent Employee (3 year) gets 15% of basic Salary per month");
                    bpm=(basic/100)*15;
                    break; 
                case 4:
                    System.out.println("\nPermanent Employee (5 year) gets 20% of basic Salary per month");
                    bpm=(basic/5);
                    break;
                default:
                    System.out.println("\nWrong input");
                    bpm=0;
                    break;
            }
            this.bpm=bpm;
        }
        while(bpm<0);  
    }
    public void settax(float tax)
    {
        System.out.println("\n======Tax Calculation======");
        System.out.println("\nNOTE:Income Tax is applicable on Basic Salary & Bonuses not on Allowances.");
        System.out.print("\nEnter Income Tax Percentage Value:\t");
        float per=s.nextFloat();
        this.tax=(basalary+bpm)*(per/100);
    }
    public void setsalary(float salary)
    {
        this.salary=basalary+allow+bpm-tax;
    }
    
    int getbasic()
    {
        return basic;
    }  
    int getadvance()
    {
        return advance;
    } 
    int getbasalary()
    {
        return basalary;
    } 
    int gettallow()
    {
        return tallow;
    }  
    int getballow()
    {
        return ballow;
    } 
    int getallow()
    {
        return allow;
    }  
    int getbpm()
    {
        return bpm;
    } 
    float gettax()
    {
        return tax;
    }  
    float getsalary()
    {
        return salary;
    }  
}