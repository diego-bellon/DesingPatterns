package entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User extends Entity{
	
	private String name;
	
	private LocalDateTime lastLogin;
	
}
