package springAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config2 {
	
	@Bean
	@Scope("prototype")
	public Config2Class config2Class() {
		return new Config2Class();
	}

}
