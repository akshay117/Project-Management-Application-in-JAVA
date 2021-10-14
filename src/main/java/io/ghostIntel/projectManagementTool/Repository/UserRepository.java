package io.ghostIntel.projectManagementTool.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.ghostIntel.projectManagementTool.Domain.User;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {


    User findByUsername(String username);
    User getById(Long id);
}
