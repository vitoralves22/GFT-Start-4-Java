package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Livro livro = factory.getBean(Livro.class);
		livro.setNome("O alquimista");
		livro.setCodigo("V22");
		
		Autor autor = factory.getBean(Autor.class);
		autor.setNome("Paulo Coelho");
		
		livro.exibir();
		
	}

}
