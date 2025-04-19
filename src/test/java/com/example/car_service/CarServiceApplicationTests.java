package com.example.car_service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CarServiceApplicationTests {

	@Test
	void contextLoads() {
		Car car = new Car("AA11BB", "Ferrari",995);
		String plateNumber = car.getPlateNumber();
		assertEquals(plateNumber, "AA11BB");

	}

}
