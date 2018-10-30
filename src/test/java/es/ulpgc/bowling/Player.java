package es.ulpgc.bowling;

public class Player {
    private String nombre;
    private int puntuacion;
    private int frames;

    public Player(String nombre, int puntuacion){
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.frames = 10;
    }

    public int getPuntuacion(int puntuacion){ return this.puntuacion; }
    public String getNombre(int nombre){ return this.nombre; }
}
