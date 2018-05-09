package springAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;
//@EnableTransactionManagement
@Configuration
@Import(Config2.class)
	public class TextEditorConfig {
	   @Bean 
	   public TextEditor textEditor(){
	      return new TextEditor(spellChecker());
	   }

	   @Bean(initMethod = "init", destroyMethod = "destroy" )
	   @Scope("prototype")
	   public SpellChecker spellChecker(){
	      return new SpellChecker( );
	   }
	}
