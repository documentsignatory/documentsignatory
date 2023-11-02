package logs.mailer.app.mail;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MailRepository extends CrudRepository<Mail, Integer> {
	public Optional<Mail> findByUserId(int id);
	public List<Mail> findAllByUserId(int id);
}
