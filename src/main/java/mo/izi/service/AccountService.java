package mo.izi.service;

import mo.izi.entities.AppRole;
import mo.izi.entities.AppUser;

public interface AccountService {

	public AppUser saveUser(AppUser user);

	public AppRole saveRole(AppRole role);

	public void addRoleToUser(String username, String roleName);

	public AppUser findUserByUsername(String username);
}
