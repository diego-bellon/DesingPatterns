import lombok.Data;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Data
public class Message {

	private String msg;
	
	private LocalDateTime timestamp;
	
	public Message(String msg) {
		this.msg = msg;
		this.timestamp = LocalDateTime.now(ZoneId.of("UTC"));
	}
}
