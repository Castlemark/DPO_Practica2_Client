package Model;

import java.io.Serializable;

/**
 * Classe que s'encarrega de guardar les posicions X i Y de la serp.
 *
 * Created by Grup 6 on 06/04/2017.
 */
public class Posicio implements Serializable {

    //Atributs
    private int x;
    private int y;

    //Constructors
    public Posicio(int x, int y){
        this.x = x;
        this.y = y;
    }

    //Metodes

    /**
     * Segons la direcció que rep, segons ha indicat l'usuari, es canvien les coordenades x i y.
     * @param dir indica la direcció que ha clicat el jugador.
     */
    public void mouCap(int dir){
        switch (dir) {
            case 1:
                x++;
                break;
            case 2:
                x--;
                break;
            case 3:
                y++;
                break;
            case 4:
                y--;
                break;
        }
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
