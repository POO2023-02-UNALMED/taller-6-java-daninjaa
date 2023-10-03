package vehiculos;

public class Automovil extends Vehiculo {
	private int puestos;

	public Automovil(int puestos, String placas, String nombre, int peso, Fabricante fabricante) {
		super(placas, 4, 100, nombre, peso,"FWD", fabricante);
		this.puestos = puestos;
		Vehiculo.cantidadAutomoviles ++;
	}

}