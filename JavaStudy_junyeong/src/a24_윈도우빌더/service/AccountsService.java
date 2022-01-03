package a24_À©µµ¿ìºô´õ.service;

import a24_À©µµ¿ìºô´õ.domain.user.User;
import a24_À©µµ¿ìºô´õ.domain.user.UserDao;
import a24_À©µµ¿ìºô´õ.domain.user.UserDaoImpl;
import a24_À©µµ¿ìºô´õ.session.Principal;
import a24_À©µµ¿ìºô´õ.swing.dto.AccountsDto;

public class AccountsService {

	private UserDao userDao;
	private Principal principal;
	
	public AccountsService() {
		userDao = new UserDaoImpl();
		principal = Principal.getInstance();
	}
	
	public boolean UpdateProfile(AccountsDto accountsDto) {
		User user = accountsDto.toEntity(principal.getUser().getId());
		
		int result = userDao.updateProfileById(user);
		
		if(result == 0) {
			return false;
		} else {
			principal.getUser().setName(accountsDto.getName());
			principal.getUser().setEmail(accountsDto.getEmail());
			return true;
		}
	}
	
	public boolean UpdatePassword(AccountsDto accountsDto) {
		User user = accountsDto.toEntity(principal.getUser().getId());
		
		int result = userDao.updatePasswordById(user);
		
		if(result == 0) {
			return false;
		} else {
			principal.getUser().setPassword(accountsDto.getPassword());
			return true;
		}
	}
	
	public boolean DeleteUser() {
		int result = userDao.deleteUserByUsername(principal.getUser().getUsername());
		
		if(result > 0) {
			return true;
		} else {
			return false;
		}
	}
}
