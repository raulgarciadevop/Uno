package objects;

public class Carta {
    private String simbolo;
    private int color;//1=Rojo,2=Verde,3=Azul,4=Amarillo
    
    public Carta(){
        
    }
    
    public Carta(String s, int c){
        this.color=c;
        this.simbolo=s;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
    
    
    
    

  

}