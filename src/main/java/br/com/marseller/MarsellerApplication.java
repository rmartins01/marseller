package br.com.marseller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.marseller.model.Product;
import br.com.marseller.repository.ProductRepository;

@SpringBootApplication
public class MarsellerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarsellerApplication.class, args);
	}
	
	@Bean
	CommandLineRunner com (ProductRepository rep) {
		return args -> rep.save(Product.builder().title("produto "+Math.random()+1000).description("descrição "+Math.random()+1000).build());
	}

}
