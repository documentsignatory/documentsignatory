package logs.mailer.app.sent;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SentRepository extends CrudRepository<Sent, Integer> {

}
