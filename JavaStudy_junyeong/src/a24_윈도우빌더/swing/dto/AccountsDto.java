package a24_���������.swing.dto;

import a24_���������.domain.user.User;
import lombok.Data;

@Data
public class AccountsDto {

	private String name;
	private String email;
	private String password;
	
	public User toEntity(int Id) {
		return User.builder()
				.id(Id)
				.name(name)
				.email(email)
				.password(password)
				.build();
	}
}
