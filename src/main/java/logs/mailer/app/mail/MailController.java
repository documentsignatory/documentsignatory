package logs.mailer.app.mail;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {
	@Autowired
	private MailService mailService;
	
	@RequestMapping(method = RequestMethod.POST, value="/mail")
	public Mail addMail(@RequestBody Mail mail) {
		return mailService.addMail(mail);
	}
	
	@RequestMapping("/mail/user/{id}")
	public Optional<Mail> getMailByUser(@PathVariable int id) {
		return mailService.getMailByUser(id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/mail/{id}")
	public void deleteMail(@PathVariable int id) {
		mailService.deleteMail(id);
	}
}
