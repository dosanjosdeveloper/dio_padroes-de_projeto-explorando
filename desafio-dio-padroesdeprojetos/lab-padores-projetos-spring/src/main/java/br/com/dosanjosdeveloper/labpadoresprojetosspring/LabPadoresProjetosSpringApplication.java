package br.com.dosanjosdeveloper.labpadoresprojetosspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LabPadoresProjetosSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadoresProjetosSpringApplication.class, args);
	}

}
