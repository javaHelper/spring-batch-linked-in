package com.linkedin.batch;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


/**
 * An interface used by JdbcTemplate for mapping rows of a java.sql.ResultSet on a per-row basis. Implementations of this 
 * interface perform the actual work of mapping each row to a result object but don't need to worry about exception handling. 
 * SQLExceptions will be caught and handled by the calling JdbcTemplate.
 */
public class OrderRowMapper implements RowMapper<Order> {

	@Override
	public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
		Order order = new Order();
		order.setOrderId(rs.getLong("order_id"));
		order.setCost(rs.getBigDecimal("cost"));
		order.setEmail(rs.getString("email"));
		order.setFirstName(rs.getString("first_name"));
		order.setLastName(rs.getString("last_name"));
		order.setItemId(rs.getString("item_id"));
		order.setItemName(rs.getString("item_name"));
		order.setShipDate(rs.getDate("ship_date"));
		return order;
	}

}
