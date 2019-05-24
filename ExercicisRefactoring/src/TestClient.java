import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;

public class TestClient {
	
	@Test
	public void TestInforme() { 
		Client nouClient = new Client ("9845678X", "Noor", "632 879 098");
		
		
		Vehicle v1 = new Vehicle("Tata", "Vista", Vehicle.BASIC);
		Vehicle v2 = new Vehicle("Toyota", "C1", Vehicle.GENERAL);
		Vehicle v3 = new Vehicle("Lemb", "Damp", Vehicle.LUXE);
		
		Lloguer L4 = new Lloguer("10-04-2018", 9, v1);
		Lloguer L5 = new Lloguer("11-05-2018", 10, v2);
		Lloguer L6 = new Lloguer("12-06-2018",11, v3);
		
		 
		nouClient.afegeix(L4);
		nouClient.afegeix(L5);
		nouClient.afegeix(L6);
		
		String informe = nouClient.informe();
		String resultat = "Informe de lloguers del client Noor (9845678X)\n" +
													 "\tTata Vista: 360.0€\n" +
													 "\tToyota C1: 720.0€\n" +
													 "\tLemb Damp: 1980.0€\n" +
													 "Import a pagar: 3060.0€\n" +
													 "Punts guanyats: 4\n";
		Assert.assertEquals(resultat,informe);
	}

} 
	
