package logs.mailer.app.sent;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import logs.mailer.app.email.Email;

@RestController
public class SentController {

	@Autowired
	private SentService sentService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/sent")
	public Sent addSent(@RequestBody Email email) {
		return sentService.addSent(email);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/sents")
	public List<Sent> addSents(@RequestBody List<Email> emails) {
		return sentService.addSents(emails);
	}
	
	@RequestMapping("/sent/{id}")
	public Optional<Sent> getSent(@PathVariable int id) {
		return sentService.getSent(id);
	}
	
	@RequestMapping("/sents")
	public List<Sent> getSents() {
		return sentService.getSents();
	}
}
