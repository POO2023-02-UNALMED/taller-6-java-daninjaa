package vehiculos;

public class Camion extends Vehiculo {
	
	private int ejes;
	
	public Camion(int ejes, String placa, String nombre, int peso, Fabricante fabricante) {
		super(placa, 2, 80,  nombre, peso, "4X2", fabricante);
		this.ejes = ejes;
		Vehiculo.cantidadCamiones ++;
		}
	
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
	public int getEjes() {
		return this.ejes;
	}
}
