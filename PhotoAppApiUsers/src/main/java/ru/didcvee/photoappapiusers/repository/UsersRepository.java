package ru.didcvee.photoappapiusers.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.didcvee.photoappapiusers.model.entity.UserEntity;
@Repository
public interface UsersRepository extends CrudRepository<UserEntity, Long> {
}
