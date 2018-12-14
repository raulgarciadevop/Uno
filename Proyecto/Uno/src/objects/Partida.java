package objects;

import java.util.ArrayList;
import java.util.Collections;

public class Partida {
    private ArrayList<Jugador> jugadores;
    private ArrayList<Carta> mazo;
    private int turno;
  
  public Partida(){
      jugadores=new ArrayList<>();
      turno=0;
      mazo=new ArrayList<>();
      
      llenarM();
      revolverM();
      System.out.println("T: "+mazo.size());
  }

  public void unirse(String nom){
      if(!partidaLlena()){
          jugadores.add(new Jugador(nom));
      }else{
          
      }
  }
  
  public void next(){
      if(turno<=8)
          turno++;
      else
          turno=0;
      
  }
  
  public boolean partidaLlena(){
      return jugadores.size()>7;
  }
  
  public void repartirC(){
      jugadores.stream().forEach((jugador) -> {
          for(int i=0;i<7;i++){
              jugador.addCa(mazo.get(i));
              
          }
          mazo.remove(0);
          mazo.remove(1);
          mazo.remove(2);
          mazo.remove(3);
          mazo.remove(4);
          mazo.remove(5);
          mazo.remove(6);
      });
          
  }
  
  public Jugador getJugador(int j){
      return jugadores.get(j);
  }
  
  public Jugador getJugador(String n){
      
      for(Jugador j:jugadores)
          if(j.getNombre().equals(n))
              return j;
          
          
          
      return null;
  }
  
  private void revolverM(){
      Collections.shuffle(mazo);
  }
  
  private void llenarM(){//1=Rojo,2=Verde,3=Azul,4=Amarillo, 5=Comodin
      
      //Numeros 1
      mazo.add(new Carta("0",1));
      mazo.add(new Carta("1",1));
      mazo.add(new Carta("2",1));
      mazo.add(new Carta("3",1));
      mazo.add(new Carta("4",1));
      mazo.add(new Carta("5",1));
      mazo.add(new Carta("6",1));
      mazo.add(new Carta("7",1));
      mazo.add(new Carta("8",1));
      mazo.add(new Carta("9",1));
      
      mazo.add(new Carta("0",2));
      mazo.add(new Carta("1",2));
      mazo.add(new Carta("2",2));
      mazo.add(new Carta("3",2));
      mazo.add(new Carta("4",2));
      mazo.add(new Carta("5",2));
      mazo.add(new Carta("6",2));
      mazo.add(new Carta("7",2));
      mazo.add(new Carta("8",2));
      mazo.add(new Carta("9",2));
      
      mazo.add(new Carta("0",3));
      mazo.add(new Carta("1",3));
      mazo.add(new Carta("2",3));
      mazo.add(new Carta("3",3));
      mazo.add(new Carta("4",3));
      mazo.add(new Carta("5",3));
      mazo.add(new Carta("6",3));
      mazo.add(new Carta("7",3));
      mazo.add(new Carta("8",3));
      mazo.add(new Carta("9",3));
      
      mazo.add(new Carta("0",4));
      mazo.add(new Carta("1",4));
      mazo.add(new Carta("2",4));
      mazo.add(new Carta("3",4));
      mazo.add(new Carta("4",4));
      mazo.add(new Carta("5",4));
      mazo.add(new Carta("6",4));
      mazo.add(new Carta("7",4));
      mazo.add(new Carta("8",4));
      mazo.add(new Carta("9",4));
      
      
      //Numeros 2
      mazo.add(new Carta("0",1));
      mazo.add(new Carta("1",1));
      mazo.add(new Carta("2",1));
      mazo.add(new Carta("3",1));
      mazo.add(new Carta("4",1));
      mazo.add(new Carta("5",1));
      mazo.add(new Carta("6",1));
      mazo.add(new Carta("7",1));
      mazo.add(new Carta("8",1));
      mazo.add(new Carta("9",1));
      
      mazo.add(new Carta("0",2));
      mazo.add(new Carta("1",2));
      mazo.add(new Carta("2",2));
      mazo.add(new Carta("3",2));
      mazo.add(new Carta("4",2));
      mazo.add(new Carta("5",2));
      mazo.add(new Carta("6",2));
      mazo.add(new Carta("7",2));
      mazo.add(new Carta("8",2));
      mazo.add(new Carta("9",2));
      
      mazo.add(new Carta("0",3));
      mazo.add(new Carta("1",3));
      mazo.add(new Carta("2",3));
      mazo.add(new Carta("3",3));
      mazo.add(new Carta("4",3));
      mazo.add(new Carta("5",3));
      mazo.add(new Carta("6",3));
      mazo.add(new Carta("7",3));
      mazo.add(new Carta("8",3));
      mazo.add(new Carta("9",3));
      
      mazo.add(new Carta("0",4));
      mazo.add(new Carta("1",4));
      mazo.add(new Carta("2",4));
      mazo.add(new Carta("3",4));
      mazo.add(new Carta("4",4));
      mazo.add(new Carta("5",4));
      mazo.add(new Carta("6",4));
      mazo.add(new Carta("7",4));
      mazo.add(new Carta("8",4));
      mazo.add(new Carta("9",4));
      
      
      //=======TRAMPAS=========
      
      //Cambios
      mazo.add(new Carta("<->",1));
      mazo.add(new Carta("<->",1));
      
      mazo.add(new Carta("<->",2));
      mazo.add(new Carta("<->",2));
      
      mazo.add(new Carta("<->",3));
      mazo.add(new Carta("<->",3));
      
      mazo.add(new Carta("<->",4));
      mazo.add(new Carta("<->",4));
      
      //Saltos
      mazo.add(new Carta("X",1));
      mazo.add(new Carta("X",1));
      mazo.add(new Carta("X",2));
      mazo.add(new Carta("X",2));
      mazo.add(new Carta("X",3));
      mazo.add(new Carta("X",3));
      mazo.add(new Carta("X",4));
      mazo.add(new Carta("X",4));
      
      
      //+4
      mazo.add(new Carta("+4",5));
      mazo.add(new Carta("+4",5));
      mazo.add(new Carta("+4",5));
      mazo.add(new Carta("+4",5));
      
      //+2
      mazo.add(new Carta("+2",1));
      mazo.add(new Carta("+2",1));
      mazo.add(new Carta("+2",2));
      mazo.add(new Carta("+2",2));
      mazo.add(new Carta("+2",3));
      mazo.add(new Carta("+2",3));
      mazo.add(new Carta("+2",4));
      mazo.add(new Carta("+2",4));
      
      //Cambio de color
      mazo.add(new Carta(":(",5));
      mazo.add(new Carta(":(",5));
      mazo.add(new Carta(":(",5));
      mazo.add(new Carta(":(",5));
      
      
  }
  
  public void iniciar(){
      repartirC();
  }
  
  public int getNoParticipantes(){
      return jugadores.size();
  }

}