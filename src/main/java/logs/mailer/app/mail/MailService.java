package logs.mailer.app.mail;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailService {
	@Autowired
	private MailRepository mailRepository;
	
	public Mail addMail(Mail mail) {
		return mailRepository.save(mail);
	}
	
	public Optional<Mail> getMailByUser(int id) {
		return mailRepository.findByUserId(id);
	}
	
	public List<Mail> getMailsByUser(int id) {
		return mailRepository.findAllByUserId(id);
	}
	
	public void deleteMail(int id) {
		mailRepository.deleteById(id);
	}
}
