package a24_���������.swing.dto;

import a24_���������.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SigninDto {

	private String username;
	private String passsword;
	
	public User toEntity() {
		return User.builder()
				.username(username)
				.password(passsword)
				.build();
	}
}
