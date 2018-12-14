package objects;

import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private ArrayList<Carta> mazo;
    
    public Jugador(){
        nombre="";
        mazo=new ArrayList<>();
    }
    
    public Jugador(String n){
        this.nombre=n;
        mazo=new ArrayList<>();
    }
    
    
    public void asignarM(){
        
    }
    
    public void addCa(Carta c){
        mazo.add(c);
    }
    
    public void showCartas(){
        System.out.println("Cartas: "+mazo.get(0).getSimbolo());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }
    
    
  
  

}