import java.util.Vector;

public class GestorLloguersLite {

	public static void main(String[] args) {
		
		Vehicle vehicleBasic = new Vehicle("Tata", "Vista", Vehicle.BASIC);
		Vehicle vehicleGeneral = new Vehicle("Toyota", "C1", Vehicle.GENERAL);
		Vehicle vehicleLux = new Vehicle("Lemb", "Damp", Vehicle.LUXE);
		
		Lloguer L1 = new Lloguer("10-04-2019", 5, vehicleBasic);
		Lloguer L2 = new Lloguer("11-05-2019", 6, vehicleGeneral);
		Lloguer L3 = new Lloguer("12-06-2019", 7, vehicleLux);
		
		Client newClicnt = new Client("X9838711R", "Isha Noor", "623 654 456");
		
		newClicnt.afegeix(L1);
		newClicnt.afegeix(L2);
		newClicnt.afegeix(L3);
		
		InformacionGeneralClient(newClicnt, newClicnt.getLloguers());
			
	} 
	
	 
    public static void InformacionGeneralClient(Client client, Vector<Lloguer> lloguers){
    	System.out.println("Informació del Client");
        System.out.println("Nom: " + client.getNom());
        System.out.println("Nif: "+ client.getNif());
        System.out.println("Telefon: "+ client.getTelefon());
        
        System.out.println("\nInformació del lloguers");
        System.out.println("Lloguers: " + client.numlloguers());
        for (int i = 0; i < client.numlloguers(); i++) {
        	System.out.println("Marca: " + client.getMarca(lloguers.get(i)));
        	System.out.println("Model: " + client.getModel(lloguers.get(i)));
            System.out.println("Data d'inici: " + client.getData(lloguers.get(i)));
            System.out.println("Dies llogats: " + client.getDies(lloguers.get(i)) + "\n");
        }
        
    }	
}