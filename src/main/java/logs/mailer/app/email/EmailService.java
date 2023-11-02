package logs.mailer.app.email;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	@Autowired
	private EmailRepository emailRepository;
	
	public Email addEmail(Email email) {
		return emailRepository.save(email);
	}
	
	public List<Email> addEmails(List<Email> emails) {
		return (List<Email>) emailRepository.saveAll(emails);
	}
	
	public Optional<Email> getEmail(int id) {
		return emailRepository.findById(id);
	}
	
	public List<Email> getEmails() {
		return (List<Email>) emailRepository.findAll();
	}
	public void delete(int id) {
		emailRepository.deleteById(id);
	}
	
	
}
