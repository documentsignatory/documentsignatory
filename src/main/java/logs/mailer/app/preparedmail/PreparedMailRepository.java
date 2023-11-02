package logs.mailer.app.preparedmail;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreparedMailRepository extends CrudRepository<PreparedMail, Integer> {
	public List<PreparedMail> findAllByUserId(int id);
}
