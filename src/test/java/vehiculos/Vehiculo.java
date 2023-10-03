package vehiculos;

import java.util.*;

public class Vehiculo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	public static int cantidadVehiculos = 0;
	public static int cantidadAutomoviles = 0;
	public static int cantidadCamionetas = 0;
	public static int cantidadCamiones = 0;
	public static ArrayList<Fabricante>fabricantes;
	public static ArrayList<Pais>paises;
	
	public Vehiculo(String placa,int puertas,int velocidadMaxima, String nombre, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		cantidadVehiculos ++;
		fabricantes.add(fabricante);
		paises.add(fabricante.getPais());
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getPlaca(){
		return this.placa;
	}
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public int getPuertas(){
		return this.puertas;
	}
	
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public int getVelocidadMaxima(){
		return this.velocidadMaxima;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public int getPeso(){
		return this.peso;
	}
	
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	
	public String getTraccion() {
		return this.traccion;
	}
	
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	public Fabricante getFabricante(){
		return this.fabricante;
	}
	
	public String vehiculosPorTipo() {
		return String.format("Automoviles: %i \n + Camionetas: %i \n Camiones: %i", cantidadAutomoviles,cantidadCamionetas, cantidadCamiones);	
	}
	private static <T> T elementoMasRepetido(ArrayList<T> lista) {
		T elementoMasRepetido = null;
		int frecuenciaMaxima = 0;
		
		for (int i = 0; i < lista.size(); i++) {
			T elementoActual = lista.get(i);
			int frecuenciaActual = 0;
			
			for  (int j = 0; j < lista.size(); j++) {
				if (lista.get(j) == elementoActual) {
					frecuenciaActual++;
				}
			}
			
			if (frecuenciaActual > frecuenciaMaxima) {
				frecuenciaMaxima = frecuenciaActual;
				elementoMasRepetido = elementoActual;
			}
		}
		return elementoMasRepetido;
	}
	
	public Fabricante fabricaMayorVentas() {
		
		return elementoMasRepetido(fabricantes);
	}
	public Pais paisMasVendedor() {
		
		return elementoMasRepetido(paises);
	}
}
