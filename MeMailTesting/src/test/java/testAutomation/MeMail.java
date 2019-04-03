package testAutomation;

public class MeMail {
		public static void main(String[] args) throws InterruptedException {
			
			
			Login objLogin = new Login();
			Registration registrationtest = new Registration();
			
			objLogin.startTest();				
			registrationtest.registration();
			objLogin.login();
			objLogin.endTest();
		     
	}

}
