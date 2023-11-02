package logs.mailer.app.send;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SendRepository extends CrudRepository<Send, Integer> {

}
