package es.ulpgc.bowling;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players = new ArrayList<>();

    public int getPuntuacionRoll(){
        int puntuacion = 0;
        for(Player p: players){
            int f = p.getFrames();
            puntuacion = p.getPuntuacion();
            if(f != 0){
                f -= 1;
                puntuacion += getPuntuacionRoll();
            }
        }
        return puntuacion;
    }
}
