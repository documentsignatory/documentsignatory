package logs.mailer.app.send;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendController {

	@Autowired
	private SendService sendService;

	@RequestMapping(method = RequestMethod.POST, value = "/addsends")
	public void addSends(@RequestBody List<Send> sends) {
		sendService.addSends(sends);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/addsendsreminder")
	public void addSendsReminder(@RequestBody List<Send> sends) {
		sendService.addSendsReminder(sends);
	}
}
