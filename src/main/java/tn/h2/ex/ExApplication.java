package tn.h2.ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import tn.h2.ex.entity.condidat;
import tn.h2.ex.repo.Candidatrepo;


@SpringBootApplication
@EnableDiscoveryClient
public class ExApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExApplication.class, args);
	}
	@Autowired
	private Candidatrepo repository;
	@Bean
	ApplicationRunner init() {
		return (args) -> {
// save
			repository.save(new condidat("Mariem" ,"ma@esprit.tn"));
			repository.save(new condidat("Sarra","sa@esprit.tn"));
			repository.save(new condidat("Mohamed",  "mo@esprit.tn"));
			repository.save(new condidat("Maroua",  "maroua@esprit.tn"));
// fetch
			repository.findAll().forEach(System.out::println);
		};
	}
}
