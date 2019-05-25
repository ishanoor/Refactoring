import org.junit.Test;
import org.junit.Assert;

public class TestInformeHTML {
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
		
		String informe = nouClient.informeHTML();
		String resultat = "<h1>Informe de lloguers</h1>\n" +
				 "<p>Informe de lloguers del client <em>Noor</em> (<strong>9845678X</strong>)</p>\n" +
				 "<table>\n<tr><td><strong>Marca</strong></td><td><strong>Model</strong></td><td><strong>Import</strong></td></tr>" +
				 "<tr><td>Tata</td><td>Vista</td><td>360.0€</td></tr>\n" +
				 "<tr><td>Toyota</td><td>C1</td><td>720.0€</td></tr>\n" +
				 "<tr><td>Lemb</td><td>Damp</td><td>1980.0€</td></tr>\n" +
				 "</table>\n" +
				 "<p>Import a pagar: <em>3060.0€</em></p>\n" +
				 "<p>Punts guanyats: <em>4</em></p>\n";
		
		Assert.assertEquals(resultat, informe);
	}
	
	//Test: Un sol lloguer
		@Test
		public void TestInformeUnlloguer() { 
			Client nouClient = new Client ("9845678X", "Noor", "632 879 098");		
			
			Vehicle v1 = new Vehicle("Tata", "Vista", Vehicle.BASIC);		
			Lloguer L4 = new Lloguer("10-04-2018", 9, v1);			 
			nouClient.afegeix(L4);

			
			String informe = nouClient.informeHTML();
			String resultat = "<h1>Informe de lloguers</h1>\n" +
					 "<p>Informe de lloguers del client <em>Noor</em> (<strong>9845678X</strong>)</p>\n" +
					 "<table>\n<tr><td><strong>Marca</strong></td><td><strong>Model</strong></td><td><strong>Import</strong></td></tr>" +
					 "<tr><td>Tata</td><td>Vista</td><td>360.0€</td></tr>\n" +
					 "</table>\n" +
					 "<p>Import a pagar: <em>360.0€</em></p>\n" +
					 "<p>Punts guanyats: <em>1</em></p>\n";
			
			Assert.assertEquals(resultat, informe);
		}
		
	
	public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("TestInformeHTML");
    }
}

