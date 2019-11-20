package mo.izi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mo.izi.entities.AppRole;

public interface RoleRepository extends JpaRepository<AppRole, Long> {

	public AppRole findByRoleName(String roleName);
}
