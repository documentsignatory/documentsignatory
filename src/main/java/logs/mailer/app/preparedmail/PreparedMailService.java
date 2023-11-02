package logs.mailer.app.preparedmail;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PreparedMailService {
	@Autowired
	private PreparedMailRepository preparedMailRepository;

	public PreparedMail addPreparedMail(PreparedMail preparedMail) {
		return preparedMailRepository.save(preparedMail);
	}

	public List<PreparedMail> addPreparedMails(List<PreparedMail> preparedMails) {
		return (List<PreparedMail>) preparedMailRepository.saveAll(preparedMails);
	}
	
	public Optional<PreparedMail> getPreparedMail(int id) {
		return preparedMailRepository.findById(id);
	}
	
	public List<PreparedMail> getPreparedMailsByUser(int id) {
		return (List<PreparedMail>) preparedMailRepository.findAllByUserId(id);
	}
	
	public void deletePreparedMail(int id) {
		preparedMailRepository.deleteById(id);
	}
}
