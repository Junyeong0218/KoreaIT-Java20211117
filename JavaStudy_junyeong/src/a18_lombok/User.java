package a18_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class User {

	private String username;
	private String password;
	private String name;
	private String email;
	
	
}
