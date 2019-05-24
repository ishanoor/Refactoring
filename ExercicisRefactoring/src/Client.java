import java.util.Date;
import java.util.Vector;

public class Client {
    private String nif;
    private String nom;
    private String telefon;
    private Vector<Lloguer> lloguers;
	

    public Client(String nif, String nom, String telefon) {
        this.nif = nif;
        this.nom = nom;
        this.telefon = telefon;
        this.lloguers = new Vector<Lloguer>();
    }

    public String getNif()     { return nif;     }
    public String getNom()     { return nom;     }
    public String getTelefon() { return telefon; }
    public Vector<Lloguer>  getLloguers() { return lloguers; }

    public void setNif(String nif) { this.nif = nif; }
    public void setNom(String nom) { this.nom = nom; }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public void afegeix(Lloguer lloguer) {
        if (! lloguers.contains(lloguer) ) {
            lloguers.add(lloguer);
        }
    }
    public void elimina(Lloguer lloguer) {
        if (lloguers.contains(lloguer) ) {
            lloguers.remove(lloguer);
        }
    }
    public boolean conte(Lloguer lloguer) {
        return lloguers.contains(lloguer);
    }

    public String informe() { 
        double total = 0;
        int bonificacions = 0;
        String resultat = "Informe de lloguers del client " +
            getNom() +
            " (" + getNif() + ")\n";
        for (Lloguer lloguer: lloguers) {
            double quantitat = 0;
            switch (lloguer.getVehicle().getCategoria()) {
                case Vehicle.BASIC:
                    quantitat += 3;
                    if (lloguer.getDies() > 3) {
                        quantitat += (lloguer.getDies() - 3) * 1.5;
                    }
                    break;
                case Vehicle.GENERAL:
                    quantitat += 4;
                    if (lloguer.getDies() > 2) {
                        quantitat += (lloguer.getDies() - 2) * 2.5;
                    }
                    break;
                case Vehicle.LUXE:
                    quantitat += lloguer.getDies() * 6;
                    break;
            }

            // afegeix lloguers freq�ents
            bonificacions ++;

            // afegeix bonificaci� per dos dies de lloguer de Luxe
            if (lloguer.getVehicle().getCategoria() == Vehicle.LUXE &&
                    lloguer.getDies()>1 ) {
                bonificacions ++;
            }
 
            // composa els resultats d'aquest lloguer
            resultat += "\t" +
                lloguer.getVehicle().getMarca() +
                " " +
                lloguer.getVehicle().getModel() + ": " +
                (quantitat * 30) + "�" + "\n";
            total += quantitat * 30;
        }

        // afegeix informaci� final
        resultat += "Import a pagar: " + total + "�\n" +
            "Punts guanyats: " + bonificacions + "\n";
        return resultat;
    }

	public int numlloguers() {
		return lloguers.size();
	}
	
    public String getMarca(Lloguer lloguer) {
        return lloguer.getMarca(lloguer.getVehicle());
    }

    public String getModel(Lloguer lloguer) {
        return lloguer.getModel(lloguer.getVehicle());
    }

    public String getData(Lloguer lloguer) {
        return lloguer.getData();
    }

    public int getDies(Lloguer lloguer) {
        return lloguer.getDies();
    }
    
}