package com.linkedin.batch;

import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Order {

	private Long orderId;
	private String firstName;
	private String lastName;
	private String email;
	private BigDecimal cost;
	private String itemId;
	private String itemName;
	private Date shipDate;

	@Override
	public String toString() {
		return orderId + "," + firstName + "," + lastName + "," + email + "," + cost + "," + itemId + "," + itemName
				+ "," + shipDate;
	}

}
