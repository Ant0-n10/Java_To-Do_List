package Ant0_n10.todolist.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Ant0_n10.todolist.models.Task, Long> {
}
