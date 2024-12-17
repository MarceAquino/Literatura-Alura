package com.curso.lliteralura;

import com.curso.lliteralura.principal.Principal;
import com.curso.lliteralura.repository.IAutorRepository;
import com.curso.lliteralura.repository.ILibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LliteraluraApplication implements CommandLineRunner {

	@Autowired
	private IAutorRepository autorRepositorio;
	@Autowired
	private ILibroRepository libroRepositorio;


	public static void main(String[] args) {

		SpringApplication.run(LliteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(autorRepositorio,libroRepositorio);
		principal.muestraElMenu();

	}
}
