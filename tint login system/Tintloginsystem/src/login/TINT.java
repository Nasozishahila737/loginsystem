package login;
import java.util.Scanner;
public class TINT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String correctusername="tint uganda";
String correctpasscode="sheesh";

Scanner input= new Scanner(System.in);

for(int attempts=1;attempts<=3;attempts++) {
	System.out.println( attempts + " attempts"  + " enter credentials");
	String username=input.nextLine();
	String passcode=input.nextLine();
	if(username.equals(correctusername)&&passcode.equals(correctpasscode)) {
		
		System.out.println("login successful");
		break;
	}else {  System.out.println("login failed");
	
	}
}
	}

}
