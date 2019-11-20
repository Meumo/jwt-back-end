package mo.izi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mo.izi.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
