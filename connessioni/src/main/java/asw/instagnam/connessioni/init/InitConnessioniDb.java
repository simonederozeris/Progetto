package asw.instagnam.connessioni.init;

import asw.instagnam.connessioni.domain.*; 

import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;

import org.springframework.beans.factory.annotation.Autowired;

@Component
public class InitConnessioniDb implements CommandLineRunner {

	@Autowired 
	private ConnessioniService connessioniService; 

	public void run(String[] args) {		
		if(connessioniService.checkIfEmpty()) {
			connessioniService.createConnessioneInit( "Cristiano", "Gennaro" );	
			connessioniService.createConnessioneInit( "Gennaro", "Cristiano" );	
			connessioniService.createConnessioneInit( "Paolo", "Cristiano" );	
			connessioniService.createConnessioneInit( "Paolo", "Gennaro" );	
			connessioniService.createConnessioneInit( "Anna", "Antonino" );	
			connessioniService.createConnessioneInit( "Anna", "Benedetta" );	
		}
	}
}
