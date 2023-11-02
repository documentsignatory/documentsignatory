package logs.mailer.app.send.mailsender;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class MailSenderService {
	@Autowired
	private JavaMailSender mailSender;
	
	public void sendEmail(String toEmail, String subject, String body) throws MessagingException, UnsupportedEncodingException {
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);
		helper.setFrom("elon_money@outlook.com", "Complete with Docusign");
		helper.setTo(toEmail);
		helper.setSubject(subject);
		helper.setText(body, true);
		
		mailSender.send(message);
		System.out.println(toEmail+ " Mail sent successfully");
	}
}