package vehiculos;

import java.util.ArrayList;
public class Pais {
    private String nombre;
    static ArrayList<String> paises = new ArrayList<>();
    static ArrayList<Integer> cantidadDePaises = new ArrayList<>();

    public Pais(String nombre){
        this.nombre=nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public static Pais paisMasVendedor(){
    	int indice_maximo = -1;
        int cantidad_maxima = -1;
        
        for (int i=0;i<Pais.cantidadDePaises.size();i++){
            if (Pais.cantidadDePaises.get(i)>cantidad_maxima){
                cantidad_maxima = cantidadDePaises.get(i);
                indice_maximo = i;
            }

        }
        return new Pais(Pais.paises.get(indice_maximo));
    }
}
