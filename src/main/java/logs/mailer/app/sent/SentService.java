package logs.mailer.app.sent;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import logs.mailer.app.email.Email;

@Service
public class SentService {

	@Autowired
	private SentRepository sentRepository;
	
	public Sent addSent(Email email) {
		return null;
	}
	
	public List<Sent> addSents(List<Email> emails) {
		return null;
	}
	
	public Optional<Sent> getSent(int id) {
		return sentRepository.findById(id);
	}
	
	public List<Sent> getSents() {
		return (List<Sent>) sentRepository.findAll();
	}
}
