package logs.mailer.app.preparedmail;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PreparedMailController {
	@Autowired
	private PreparedMailService preparedMailService;

	@RequestMapping(method = RequestMethod.POST, value = "/preparedmail")
	public PreparedMail addPreparedMail(@RequestBody PreparedMail preparedMail) {
		return preparedMailService.addPreparedMail(preparedMail);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/preparedmails")
	public List<PreparedMail> addPreparedMails(@RequestBody List<PreparedMail> preparedMails) {
		return preparedMailService.addPreparedMails(preparedMails);
	}

	@RequestMapping("/preparedmail/{id}")
	public Optional<PreparedMail> getPreparedMail(@PathVariable int id) {
		return preparedMailService.getPreparedMail(id);
	}

	@RequestMapping("/preparedmail/user/{id}")
	public List<PreparedMail> getPreparedMailsByUser(@PathVariable int id) {
		return preparedMailService.getPreparedMailsByUser(id);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
	public void deletePreparedMail(int id) {
		preparedMailService.deletePreparedMail(id);
	}
}
