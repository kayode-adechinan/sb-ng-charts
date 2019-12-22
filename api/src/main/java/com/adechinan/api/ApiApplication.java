package com.adechinan.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.stream.Stream;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}


	@Bean
	CommandLineRunner runner(StatRepository statRepository){
		return args -> {
			Stream.of(
					new Stat("Switzerland", BigDecimal.valueOf(82878)),
					new Stat("Norway", BigDecimal.valueOf(71993)),
					new Stat("Denmark", BigDecimal.valueOf(70407)),
					new Stat("Israel", BigDecimal.valueOf(64198)),
					new Stat("Sweden", BigDecimal.valueOf(54494)),
					new Stat("Germany", BigDecimal.valueOf(53713))
			).forEach(statRepository::save);
		};
	}

}
