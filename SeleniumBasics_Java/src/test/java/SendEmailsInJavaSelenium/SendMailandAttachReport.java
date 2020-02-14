package SendEmailsInJavaSelenium;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendMailandAttachReport {

	public static void main(String[] args) {
		
		System.out.println("=============================Email Started=========================================");
		
		
		//authentication info
		final String username = "vidyaclk12@gmail.com";
		final String password = "vidya@1993";
		String fromEmail = "vidyaclk12@gmail.com";
		String toEmail = "vidyashri@matryxsoft.com";
		
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		
		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username,password);
			}
		});
		//Start our mail message
		MimeMessage msg = new MimeMessage(session);
		try {
			msg.setFrom(new InternetAddress(fromEmail));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
			msg.setSubject("Selenium Test Report");
			
			Multipart emailContent = new MimeMultipart();
			
			//Text body part
			MimeBodyPart textBodyPart = new MimeBodyPart();
			textBodyPart.setText("Hi Team, \r\n" + 
					"Greetings!\r\n" + 
					"\r\n" + 
					"Please find the work update for the day.\r\n" + 
					"\r\n" + 
					"•	Working on Selnium test scripts\r\n" + 
					"•	Created Tests and attachment of report  \r\n" + 
					"•	Working on Selenium XLST report \r\n" + 
					"•	Working on Sending emails\r\n" + 
					"\r\n" + 
					"Please let me know For any clarifications needed.\r\n" + 
					"\r\n" + 
					"Regards,\r\n" + 
					"Vidyashri D\r\n" + 
					" \r\n" + 
					"#9/2,Near BEL Circle, Hebbal Ring Road \r\n" + 
					"Bengaluru 560094,  Ph#: 8970293082\r\n" + 
					"Website: www.matryxsoft.com\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"");
			
			//Attachment body part.
			MimeBodyPart pdfAttachment = new MimeBodyPart();
			pdfAttachment.attachFile("./Reports/testReport.html");
			
			//Attach body parts
			emailContent.addBodyPart(textBodyPart);
			emailContent.addBodyPart(pdfAttachment);
			
			//Attach multipart to message
			msg.setContent(emailContent);
			
			Transport.send(msg);
			System.out.println("Sent message");
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		System.out.println("=============================Email Ended=========================================");
	}

	
	
}