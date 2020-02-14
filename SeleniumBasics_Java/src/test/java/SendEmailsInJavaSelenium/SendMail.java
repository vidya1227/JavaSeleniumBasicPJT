package SendEmailsInJavaSelenium;



import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendMail {
	public static void main(String[] args) throws EmailException   {
		
	
	

	System.out.println("=============================Email Started=========================================");
		
	
	Email email = new SimpleEmail();
	email.setHostName("smtp.gmail.com");
	email.setSmtpPort(465);
	email.setAuthenticator(new DefaultAuthenticator("vidyaclk12@gmail.com", "vidya@1993"));
	email.setSSLOnConnect(true);
	email.setFrom("vidyashri@matryxsoft.com");
	email.setSubject("Selenium Test report");
	email.setMsg("This is a test mail From Selenium Testing... :-)");
	email.addTo("vidyashri@matryxsoft.com");
	email.send();
	
	
	
		  
	System.out.println("=============================Email Ended=========================================");
}
}


//https://commons.apache.org/proper/commons-email/userguide.html  ----->>>>>>>Reference
//https://youtu.be/qGq9K85mGyA
