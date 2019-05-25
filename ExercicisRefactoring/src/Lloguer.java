public class Lloguer {

	private String data;
	private int dies;
	private Vehicle vehicle; 


	public Lloguer(String data, int dies, Vehicle vehicle) {
		this.data = data;
		this.dies = dies;
		this.vehicle = vehicle;
	}
	
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getDies() {
		return dies;
	}

	public void setDies(int dies) {
		this.dies = dies;
	}
	
	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
    public String getMarca(Vehicle vehicle) {
        return vehicle.getMarca();
    }

    public String getModel(Vehicle vehicle) {
        return vehicle.getModel();
    }
     
    private static final int UNITAT_DE_COST_BASIC = 3;
    private static final int NOMBRE_DE_DIES_INICIAL_BASIC = 3;
    private static final int UNITAT_DE_COST_GENERAL = 4;
    private static final int NOMBRE_DE_DIES_INICIAL_GENERAL = 2;
    private static final int UNITAT_DE_COST_LUXE = 6;
    private static final double MULTIPLICACIÓ_BASIC = 1.5;
    private static final double MULTIPLICACIÓ_GENERAL = 2.5;
    
    public double quantitat() {
		double quantitat = 0;
        switch (this.getVehicle().getCategoria()) {
            case Vehicle.BASIC:
                quantitat += UNITAT_DE_COST_BASIC;
                if (this.getDies() >  NOMBRE_DE_DIES_INICIAL_BASIC) {
                    quantitat += (this.getDies() -  NOMBRE_DE_DIES_INICIAL_BASIC) * MULTIPLICACIÓ_BASIC;
                }
                break;
            case Vehicle.GENERAL:
                quantitat += UNITAT_DE_COST_GENERAL;
                if (this.getDies() > NOMBRE_DE_DIES_INICIAL_GENERAL) {
                    quantitat += (this.getDies() - NOMBRE_DE_DIES_INICIAL_GENERAL) * MULTIPLICACIÓ_GENERAL;
                }
                break;
            case Vehicle.LUXE:
                quantitat += this.getDies() * UNITAT_DE_COST_LUXE ;
                break;
        }
 
		return quantitat;
	}
    
    public int bonificacions() {
    	int bonificacions = 1;
    	if (this.getVehicle().getCategoria() == Vehicle.LUXE &&
                this.getDies()>1 ) {
            bonificacions ++;
        }
		return bonificacions;
	}

}