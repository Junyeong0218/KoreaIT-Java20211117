package a24_À©µµ¿ìºô´õ.service;

import a24_À©µµ¿ìºô´õ.domain.user.User;
import a24_À©µµ¿ìºô´õ.domain.user.UserDao;
import a24_À©µµ¿ìºô´õ.domain.user.UserDaoImpl;
import a24_À©µµ¿ìºô´õ.session.Principal;
import a24_À©µµ¿ìºô´õ.swing.dto.SigninDto;
import a24_À©µµ¿ìºô´õ.swing.dto.SignupDto;

public class AuthService {

	private UserDao userDao;
	private Principal principal;
	
	public AuthService() {
		userDao = new UserDaoImpl();
		principal = Principal.getInstance();
	}
	
	public int signin(SigninDto signinDto) {
		User userEntity = signinDto.toEntity();
		int result = userDao.signinByUsernameAndPassword(userEntity);
		
		if(result == 2) {
			userEntity = userDao.getUserByUsername(signinDto.getUsername());
			principal.setUser(userEntity);
		}
		
		return result;
	}
	
	public int signup(SignupDto signupDto) {
		User userEntityUser = signupDto.toEntity();
		int result = userDao.insertUser(userEntityUser);
		
		return result;
	}
	
	public boolean checkUsername(String username) {
		int result = userDao.checkUsernameByUsername(username);
		
		if(result > 0) {
			return false;
		} else {
			return true;
		}
		
	}
	
	
}
