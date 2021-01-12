package entity;

import lombok.Data;

import java.time.LocalDateTime;

//Order entity class
@Data
public class Order extends Entity {

	private LocalDateTime orderPlacedOn;
	
	private double totalValue;
	
}
