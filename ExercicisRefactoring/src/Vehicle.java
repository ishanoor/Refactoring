
public class Vehicle {

	private String model;
	private String marca;
	private int categoria;
	
	public static int BASIC = 0;
	public static int GENERAL = 1;
	public static int LUXE = 2;

	

	 public Vehicle(String marca,String model, int categoria){
	     	this.marca=marca;
	     	this.model=model;
	     	this.categoria=categoria;
	     }

	public String getModel() {
		return model;
	}

	public String getMarca() {
		return marca;
	}

	public int getCategoria() {
		return categoria;
	}
}