package br.com.ifba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Classe principal da aplicação Spring Boot.
 *
 * Esta classe inicializa a aplicação Spring Boot e configura o contexto do Spring para suportar uma interface gráfica.
 */
@SpringBootApplication
public class Prg03sgsApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context =
                        new SpringApplicationBuilder(Prg03sgsApplication.class).
                        headless(false).run(args);
                
                TelaInicial telaInicial = context.getBean(TelaInicial.class);
                telaInicial.setVisible(true);
	}
}
