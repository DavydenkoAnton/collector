package by.minskdev.repositories;

import by.minskdev.entity.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message,Long> {

    List<Message> findAllByTag(String tag);
}
