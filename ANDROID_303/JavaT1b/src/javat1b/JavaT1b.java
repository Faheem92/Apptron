package javat1b;
import java.util.Scanner;

public class JavaT1b {

    public static void main(String[] args)
    {
        String id = null,name = null,fname = null,cls = null,uid = null;
        Scanner s=new Scanner(System.in);
        char res;
        Userinfo o=new Userinfo();
        System.out.println("========Library Management System========\n");
        o.setid(id);
        o.setname(name);
        o.setfname(fname);
        o.setcls(cls);
        o.setuid(uid);  
        o.display();
        do{
            o.book();
            System.out.println("\nIf you want to Register more book on your ID then press y:");
            res=s.next().charAt(0);
        }
        while(res=='y');
    }
}
class Userinfo
{
    String id,name,fname,cls,uid;
    Scanner s=new Scanner(System.in);
    
    public void display()
    {
        System.out.println("\n===========User Information===========");
        System.out.println("\nUser ID:\t\t\t"+getid());
        System.out.println("User Name:\t\t\t"+getname());
        System.out.println("User Father Name:\t\t"+getfname());
        System.out.println("Class Of Student:\t\t"+getcls());
        System.out.println("User University ID:\t\t"+getuid());  
    }
    public void setid(String id)
    {
        System.out.print("Enter User ID:\t\t\t");
        this.id=s.nextLine();
    }
    public void setname(String name)
    {
        System.out.print("Enter User Name:\t\t");
        this.name=s.nextLine();
    }
    public void setfname(String fname)
    {
        System.out.print("Enter User Father Name:\t\t");
        this.fname=s.nextLine();
    }
    public void setcls(String cls)
    {
        System.out.print("Enter Student Class:\t\t");
        this.cls=s.nextLine();
    }
    public void setuid(String uid)
    {
        System.out.print("Enter User University ID:\t");
        this.uid=s.nextLine();
    }
    String getid()
    {
    return id;
    }
    String getname()
    {
    return name;
    }
    String getfname()
    {
    return fname;
    }
    String getcls()
    {
    return cls;
    }
    String getuid()
    {
    return uid;
    }
    
    public void book()
    {
        int i;
        char reg;
        String cat,select,status=null;
        String[] arrphy={"phy1","phy2","phy3","phy4","phy5","phy6","phy7","phy8","phy9","phy10"};
        String[] arrchm={"chm1","chm2","chm3","chm4","chm5"};
        String[] arrbot={"bot1","bot2","bot3","bot4","bot5",};
        String[] arrzoo={"zoo1","zoo2","zoo3","zoo4","zoo5",};
        Scanner sc=new Scanner(System.in);
        System.out.println("\n==========Book Selection & Registration==========");
        System.out.println("\nEnter which category book you want:\nphy for PHYSICS\nchm for CHEMISTRY\nbot for BOTANY\nzoo for ZOOLOGY");
        cat=sc.nextLine();
        switch (cat) {
            case "phy":
                System.out.println("\nWrite Book name you want:");
                select=sc.nextLine();
                for(i=0;i<arrphy.length;i++)
                {
                    if(arrphy[i].equals(select))
                    {
                        status="Found";
                        System.out.println("\nThe Book you have selected is:\t"+select);
                        System.out.println("This book is avaiable.\nTo register it against your ID press y:");
                        reg=sc.next().charAt(0);
                        if (reg=='y')
                        {
                            System.out.println(arrphy[i]+" Registered against " +id);
                        }
                        else
                        {
                            System.out.println(arrphy[i]+" Not Registered against " +id);
                        }
                    }
                }
                if(!"Found".equals(status))
                {
                    System.out.println("Entered Book is not available");
                }
                break;
                
            case "chm":
                System.out.println("\nWrite Book name you want:");
                select=sc.nextLine();
                for(i=0;i<arrchm.length;i++)
                {
                    if(arrchm[i].equals(select))
                    {
                        status="Found";
                        System.out.println("\nThe Book you have selected is:\t"+select);
                        System.out.println("This book is avaiable.\nTo register it against your ID press y:");
                        reg=sc.next().charAt(0);
                        if (reg=='y')
                        {
                            System.out.println(arrchm[i]+" Registered against " +id);
                        }
                        else
                        {
                            System.out.println(arrchm[i]+" Not Registered against " +id);
                        }
                    }
                }  
                if(!"Found".equals(status))
                {
                    System.out.println("Entered Book is not available");
                }
                break;
                
            case "bot":
                System.out.println("\nWrite Book name you want:");
                select=sc.nextLine();
                for(i=0;i<arrbot.length;i++)
                {
                    if(arrbot[i].equals(select))
                    {
                        status="Found";
                        System.out.println("\nThe Book you have selected is:\t"+select);
                        System.out.println("This book is avaiable. \nTo register it against your ID press y:");
                        reg=sc.next().charAt(0);
                        if (reg=='y')
                        {
                            System.out.println(arrbot[i]+" Registered against " +id);
                        }
                        else
                        {
                            System.out.println(arrbot[i]+" Not Registered against " +id);
                        }
                    }
                }  
                if(!"Found".equals(status))
                {
                    System.out.println("Entered Book is not available");
                }
                break;
                
            case "zoo":
                System.out.println("\nWrite Book name you want:");
                select=sc.nextLine();
                for(i=0;i<arrzoo.length;i++)
                {
                    if(arrzoo[i].equals(select))
                    {
                        status="Found";
                        System.out.println("\nThe Book you have selected is:\t"+select);
                        System.out.println("This book is avaiable.\nTo register it against your ID press y:");
                        reg=sc.next().charAt(0);
                        if (reg=='y')
                        {
                            System.out.println(arrzoo[i]+" Registered against " +id);
                        }
                        else
                        {
                            System.out.println(arrzoo[i]+" Not Registered against " +id);
                        }
                    }
                }
                if(!"Found".equals(status))
                {
                    System.out.println("Entered Book is not available");
                }
                break;
                
            default:
                System.out.println("You have entered wrong book category.");
                break;
        }
    }
}