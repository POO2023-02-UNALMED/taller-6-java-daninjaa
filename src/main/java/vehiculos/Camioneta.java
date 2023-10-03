package vehiculos;

public class Camioneta extends Vehiculo {
	private boolean volco;
	
	public Camioneta(boolean volco, String placa, int puertas, String nombre, int peso, Fabricante fabricante) {
		super(placa, puertas, 90,  nombre, peso, "4X4", fabricante);
		this.volco = volco;
		Vehiculo.cantidadCamionetas ++;
	}
	
	public void setVolco(boolean volco) {
		this.volco = volco;
	}	
	
	public boolean isVolco() {
		return this.volco;
	}
	
}
