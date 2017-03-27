/**
 * 
 */
package SpringSoapClient.Test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * @author AAdiga
 *
 */
@Configuration
public class QuoteConfiguration {
	
	@Bean
	public Jaxb2Marshaller marshaller(){
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.wsdl.src");
		return marshaller;
	}
	
	@Bean
	public QuoteClient quoteClient(Jaxb2Marshaller marshaller){
		QuoteClient client = new QuoteClient();
		client.setDefaultUri("http://www.webservicex.com/stockquote.asmx");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		
		return client;
	}

}
