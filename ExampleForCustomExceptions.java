import java.util.Scanner;
import java.util.Scanner;

class InvalidUserException extends Exception{
public String getMessage()
{
return "Invalid user details. Try again!";
}
}
class ATM
{
int user_name=sushmitha;
int password=1111;
int UN,PWD;
void acceptInput()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the user name:");
AN=s.nextInt();
System.out.println("Enter the password:");
PWD=s.nextInt();
}
void verify()throws InvalidUserException
{
if(user_name==AN && password==PWD)
{
System.out.println("collect your money");
}
else
{

InvalidUserException i = new InvalidUserException();
System.out.println(i.getMessage());
throw i;
}
}
}class Bank
{
void initiate()
{
ATM atm = new ATM();
try {
atm.acceptInput(); 
atm.verify();
}
catch(Exception e)
{
try {
atm.acceptInput();
atm.verify();
 }
catch(Exception a)
{
try {
atm.acceptInput(); 
atm.verify();
}
catch(Exception b)
{
System.out.println("Card blocked!");
System.exit(0);
}
}
}
}
}
public class ExampleForCustomExceptions {

public static void main(String[] args) {
		
Bank b = new Bank();
b.initiate();
	
	

}

}