package com.linkedin.batch;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

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
}
