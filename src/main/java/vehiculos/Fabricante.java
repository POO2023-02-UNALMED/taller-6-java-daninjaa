package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private Pais pais;
    static ArrayList<String> listaDeFabricantes=new ArrayList<>();
    static ArrayList<Integer> cantidadListaDeFabricantes=new ArrayList<>();
    

    public Fabricante(String nombre,Pais pais){
        this.nombre=nombre;
        this.pais=pais;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }

    public void setPais(Pais pais){
        this.pais=pais;
    }
    
    public Pais getPais(){
        return pais;
    }

    public static Fabricante fabricaMayorVentas(){
    	int indiceMaximo = -1;
        int cantidadMaxima = -1;
        
        for(int i=0;i<cantidadListaDeFabricantes.size();i++){
            if (cantidadListaDeFabricantes.get(i)>cantidadMaxima){
                cantidadMaxima = cantidadListaDeFabricantes.get(i);
                indiceMaximo = i;
            }
        }

        return new Fabricante(Fabricante.listaDeFabricantes.get(indiceMaximo), null);
    }

    
}