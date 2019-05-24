
public class Vehicle {

	private String model;
	private String marca;
	private int categoria;
	
	public static final int BASIC = 0;
	public static final int GENERAL = 1;
	public static final int LUXE = 2;

	

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
	
	public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
	
	public void setMarca(String marca) {
        this.marca = marca;
    }
	
    public void setModel(String model) {
        this.model = model;
    }


}