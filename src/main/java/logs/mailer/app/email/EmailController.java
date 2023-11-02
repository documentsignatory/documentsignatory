package logs.mailer.app.email;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
	@Autowired
	private EmailService emailService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/email")
	public Email addEmail(@RequestBody Email email) {
		return emailService.addEmail(email);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/emails")
	public List<Email> addEmails(@RequestBody List<Email> emails) {
		return emailService.addEmails(emails);
	}
	
	@RequestMapping("/email/{id}")
	public Optional<Email> getEmail(@PathVariable int id) {
		return emailService.getEmail(id);
	}
	
	@RequestMapping("/emails")
	public List<Email> getEmails() {
		return emailService.getEmails();
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/email/{id}")
	public void deleteEmail(@PathVariable int id) {
		emailService.delete(id);
	}
}
