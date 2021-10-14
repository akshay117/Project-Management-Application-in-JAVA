package io.ghostIntel.projectManagementTool.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.ghostIntel.projectManagementTool.Domain.ProjectTask;

import java.util.List;

@Repository
public interface ProjectTaskRepository extends CrudRepository<ProjectTask, Long> {

    List<ProjectTask> findByProjectIdentifierOrderByPriority(String id);

    ProjectTask findByProjectSequence(String sequence);
}
