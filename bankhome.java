package bankaccountmanagement;
import java.util.*;
import java.sql.SQLException;
import java.util.Scanner;

import shopping.adminlogin;
import shopping.agentlogin;

public class bankhome 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		bankconnection con=new bankconnection();
		
		bankhome first=new bankhome();
		first.choice();
	}
		public void choice() throws ClassNotFoundException, SQLException {
			Scanner s=new Scanner(System.in);
			System.out.println("1)Admin login\n2)User login\n3)Exit");
			System.out.println("enter the choice");
			int n=s.nextInt();
			switch(n) {
			case 1:
			bankadmin aa=new bankadmin();
			aa.adminlogin();
			break;
			case 2:
				bankuser bb=new bankuser();
				bb.userlogin();
			break;
			case 3:
				System.exit(0);
				break;
	}	

}
}