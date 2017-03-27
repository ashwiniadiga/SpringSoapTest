package SpringSoapClient.Test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.wsdl.src.GetQuoteResponse;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class);
    }
    
    @Bean
    CommandLineRunner lookup(QuoteClient quoteClient){
    	
    	return args -> {
    	 

    		String ticker = "MSFT";
    		if(args.length > 0){
    			ticker = args[0];
    		}
    		GetQuoteResponse response = quoteClient.getQuote(ticker);
    		System.err.println(response.getGetQuoteResult());
    	};
    }
}
