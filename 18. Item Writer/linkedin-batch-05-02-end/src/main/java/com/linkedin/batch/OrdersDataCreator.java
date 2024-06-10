package com.linkedin.batch;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.LongStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.javafaker.Faker;

@SpringBootApplication
public class OrdersDataCreator implements CommandLineRunner{


	public static void main(String[] args) {
		SpringApplication.run(OrdersDataCreator.class, args);
	}
	
	private Faker faker = Faker.instance();

	@Override
	public void run(String... args) throws Exception {

		LongStream.range(1, 500)
			.forEach(index -> {
					Order order = Order.builder()
							.orderId(index)
							.firstName(faker.name().firstName())
							.lastName(faker.name().lastName())
							.email(faker.name().firstName()+"."+faker.name().lastName()+"@gmail.com")
							.cost(new BigDecimal(ThreadLocalRandom.current().nextDouble(100.0, 999.9)))
							.itemId(String.valueOf(index))
							.itemName(faker.commerce().productName())
							.shipDate(new Date())
							.build();
			//System.out.println(order);
		});
	}
}
