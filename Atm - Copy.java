
import java.util.Scanner;
public class Atm { 
public static void main(String[] args)
{
System.out.println("\t\t\t enter your four number of pin passward!!!!\n\n");
Scanner pass = new Scanner(System.in);
int a;
a = pass.nextInt();
 while(a != 1234)
{
System.out.println("\t\t\twrong passward pin!!!!\n");
System.out.println("\t\t\tpleas enter correct passward pin!!!!\n\n\n");
 a = pass.nextInt();
}

System.out.println("\t\t\t\tWELCOME TO BADO BANK!!!!\n");
                    System.out.println("\tPlease Enter One of the Following Number for the Transaction."); 
                    System.out.println("\n"); 
                    System.out.println("\t\tEnter 1 ----->> to Withdraw Money."); 
                    System.out.println("\n"); 
                    System.out.println("\t\tEnter 2 ----->> to Check Balance."); 
                    System.out.println("\n"); 
                    System.out.println("\t\tEnter 3 ----->> to Change Pin."); 
                    System.out.println("\n"); 
                    System.out.println("\t\tEnter 4 ----->> to Transfer Money."); 
                    System.out.println("\n"); 
                    System.out.println("\t\tEnter 5 ----->>  cerator of this project."); 
                    System.out.println("\n"); 
                    System.out.println("\t\tEnter 0 ------>> to quite ."); 
                    System.out.println("\n"); 
                    System.out.println("\t\t\tEnter your choice : "); 
                    System.out.println("\n"); 
                    System.out.print("\t\t\t\t");  
                    System.out.println("\n"); 
 
Scanner input = new Scanner(System.in);
int u;
u = input.nextInt();
while(u != 0)
{
switch(u)
{
case 1:
System.out.println("\t\t\t\tchoose the amoun you want.\n\n\t\tEnter 1 for----->>> 100 birr.\n\t\tEnter 2 for----->>> 200 birr.\n\t\tEnter 3 for ----->> 5000 birr.\n\t\tEnter 4 for ---->> other amount\n");
{
Scanner put = new Scanner(System.in);
int h;
h = put.nextInt();
switch(h)
{
case 1:
System.out.println("pleas whgit.....");
case 2:
System.out.println("pleas whgit.....");
break;
case 3:
System.out.println("pleas whgit.....");
break;
case 4:
System.out.println("enter you amont");
Scanner ut = new Scanner(System.in);
int o;
o = ut.nextInt();
System.out.println("pleas whgit.....");
break;
default:
System.out.println("worong number");
break;
}
}
break;

case 2:
System.out.println("you balance is 12000.75 EB");
break;
case 3:
System.out.println(" \t\t\t\t\t enter your new pin\nn");
Scanner dot = new Scanner(System.in);
int m;
m = dot.nextInt();
System.out.println(" \t\t\t\t\t your  pin is changed\nn");
break;
case 4:
System.out.println("enter account you wear transfer");
Scanner sot = new Scanner(System.in);
int s;
s = sot.nextInt();
System.out.println("you are correctly transfrred to accoun no");
break;
case 5:
System.out.println("\t\t\t\t this project wear desind and developed by 3rd year student of ECE.\n\n\n\t\t\t\tABRHAM SIME\n\n\n********************************** >>>>>>> -- <<<<<<<<<**********************\n\n ");
break;
default:
System.out.println("worong number");
break;
}
System.out.println("press 0 to exit");

//int u;
u = input.nextInt();
if(u == 0)
System.out.println("\n\n\t\t\t\tTHANK YOU FOR USING THIS BADO BANK\n\n\t\t\t####################################################################\n\n");

}
}
}
                    