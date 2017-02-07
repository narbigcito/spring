package mx.sisu.challengeajax;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mangofactory.swagger.plugin.EnableSwagger;
import mx.sisu.challengueajax.entities.Usuario;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableSwagger
public class ChallengeAjaxApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeAjaxApplication.class, args);
	}
        
        @Bean
	public CommandLineRunner guardarUsuario(UsuarioRepository repository) {
		return (args) -> {
			repository.save(new Usuario());

		};
	}
}
