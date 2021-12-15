package a20_ÄÃ·º¼Ç;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Message<T> {

	private int code;
	private T data;
}
