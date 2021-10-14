package io.ghostIntel.projectManagementTool.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.ghostIntel.projectManagementTool.Domain.Backlog;

@Repository
public interface BacklogRepository extends CrudRepository<Backlog, Long> {

    Backlog findByProjectIdentifier(String Identifier);
}
