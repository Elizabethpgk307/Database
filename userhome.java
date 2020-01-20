package bankaccountmanagement;

import java.sql.SQLException;
import java.util.Scanner;

import bankaccountmanagement.bankconnection;
import shopping.Buy;
import shopping.View;
import shopping.home;
public class userhome
{
public static void main(String args[]) throws ClassNotFoundException, SQLException {
	bankconnection con=new bankconnection();
	userhome first=new userhome();
	first.option1();
}
		public void option1() throws ClassNotFoundException, SQLException
		{
		Scanner s=new Scanner(System.in);
		System.out.println("1)DEPOSIT\n2)WITHDRAW AMOUNT\n3)VIEW BALANCE\n4)LOGOUT");
		System.out.println("enter the choice");
		int n=s.nextInt();
		switch(n){
		case 1:
		addmoney bu=new addmoney();
		bu.money();
		break;
		case 2:
		addmoney v=new addmoney();
		v.withdraww();
		break;
		case 3:
		viewbal b=new viewbal();
		b.viewbalance();
		break;
		case 4:
		System.out.println("Logout Successfully..");
		System.out.println("THANKYOU!!!VISIT AGAIN.....");
		bankhome first=new bankhome();
		first.choice();
	}
}
}
