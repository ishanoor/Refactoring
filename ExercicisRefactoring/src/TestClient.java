import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;

public class TestClient {
	
	//Test: més d’un lloguer
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
	
	//Test: lloguer de vehicle basic amb un dia
	@Test
	public void lloguerBasic() {
		Client nouClient = new Client ("9845678X", "Noor", "632 879 098");
		
		Vehicle v1 = new Vehicle("Tata", "Vista", Vehicle.BASIC);
		Lloguer L4 = new Lloguer("10-04-2018", 1, v1);
		nouClient.afegeix(L4);
		
		String informe = nouClient.informe();
		String resultat = "Informe de lloguers del client Noor (9845678X)\n" +	
				"\tTata Vista: 90.0€\n" +
				"Import a pagar: 90.0€\n" +
				 "Punts guanyats: 1\n";
		
		Assert.assertEquals(resultat,informe);		
	}
	
	//Test: lloguer de vehicle Basic amb mes dies
		@Test
		public void lloguerBasic2() {
			Client nouClient = new Client ("9845678X", "Noor", "632 879 098");
			
			Vehicle v1 = new Vehicle("Tata", "Vista", Vehicle.BASIC);
			Lloguer L4 = new Lloguer("10-04-2018", 16, v1);
			nouClient.afegeix(L4);
			
			String informe = nouClient.informe();
			String resultat = "Informe de lloguers del client Noor (9845678X)\n" +	
					"\tTata Vista: 675.0€\n" +
					"Import a pagar: 675.0€\n" +
					 "Punts guanyats: 1\n";
			
			Assert.assertEquals(resultat,informe);		
		}
		
		//Test: lloguer de vehicle general amb un dia
		@Test
		public void lloguerGeneral() {
			Client nouClient = new Client ("9845678X", "Noor", "632 879 098");
			
			Vehicle v2 = new Vehicle("Toyota", "C1", Vehicle.GENERAL);
			Lloguer L5 = new Lloguer("11-05-2018", 1, v2);
			nouClient.afegeix(L5);
			
			String informe = nouClient.informe();
			String resultat = "Informe de lloguers del client Noor (9845678X)\n" +	
					 "\tToyota C1: 120.0€\n" +
					"Import a pagar: 120.0€\n" +
					 "Punts guanyats: 1\n";
			
			Assert.assertEquals(resultat,informe);		
		}
	
		//Test: lloguer de vehicle general amb mes dies
				@Test
				public void lloguerGeneral2() {
					Client nouClient = new Client ("9845678X", "Noor", "632 879 098");
					
					Vehicle v2 = new Vehicle("Toyota", "C1", Vehicle.GENERAL);
					Lloguer L5 = new Lloguer("11-05-2018", 60, v2);
					nouClient.afegeix(L5);
					
					String informe = nouClient.informe();
					String resultat = "Informe de lloguers del client Noor (9845678X)\n" +	
							 "\tToyota C1: 4470.0€\n" +
							"Import a pagar: 4470.0€\n" +
							 "Punts guanyats: 1\n";
					
					Assert.assertEquals(resultat,informe);		
				}
				
		//Test: lloguer de vehicle LUXE amb un dia
			@Test
			public void lloguerLuxe() {
				Client nouClient = new Client ("9845678X", "Noor", "632 879 098");
				
				Vehicle v3 = new Vehicle("Lemb", "Damp", Vehicle.LUXE);
				Lloguer L6 = new Lloguer("12-06-2018",1, v3);
				nouClient.afegeix(L6);
				
				String informe = nouClient.informe();
				String resultat = "Informe de lloguers del client Noor (9845678X)\n" +
															 "\tLemb Damp: 180.0€\n" +
															 "Import a pagar: 180.0€\n" +
															 "Punts guanyats: 1\n";
				Assert.assertEquals(resultat,informe);
				
			}
			
			//Test: lloguer de vehicle LUXE amb mes dies
			@Test
			public void lloguerLuxe2() {
				Client nouClient = new Client ("9845678X", "Noor", "632 879 098");
				
				Vehicle v3 = new Vehicle("Lemb", "Damp", Vehicle.LUXE);
				Lloguer L6 = new Lloguer("12-06-2018",10, v3);
				nouClient.afegeix(L6);
				
				String informe = nouClient.informe();
				String resultat = "Informe de lloguers del client Noor (9845678X)\n" +
															 "\tLemb Damp: 1800.0€\n" +
															 "Import a pagar: 1800.0€\n" +
															 "Punts guanyats: 2\n";
				Assert.assertEquals(resultat,informe);
				
			}
			//Test: cap lloguer
			@Test
			public void caplloguer() {
				Client nouClient = new Client ("9845678X", "Noor", "632 879 098");
				String informe = nouClient.informe();
				String resultat = "Informe de lloguers del client Noor (9845678X)\n" +
															 "Import a pagar: 0.0€\n" +
															 "Punts guanyats: 0\n";
				Assert.assertEquals(resultat,informe);
				
			}
			
			public static void main(String args[]) {
		        org.junit.runner.JUnitCore.main("TestClient");
		    }
		
} 
	
