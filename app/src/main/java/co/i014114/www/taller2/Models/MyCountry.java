package co.i014114.www.taller2.Models;

/**
 * Created by root on 27/09/17.
 */

public class MyCountry extends Country {

    private int numeroHabitantes, area;
    private String prefijoTelefonico, dominioInternet;




    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getPrefijoTelefonico() {
        return prefijoTelefonico;
    }

    public void setPrefijoTelefonico(String prefijoTelefonico) {
        prefijoTelefonico=prefijoTelefonico.replaceAll(",",", +");
        prefijoTelefonico=prefijoTelefonico.replaceAll("\\[","");
        prefijoTelefonico=prefijoTelefonico.replaceAll("\\]","");
        prefijoTelefonico=prefijoTelefonico.replaceAll("\"","");



        this.prefijoTelefonico = prefijoTelefonico;
    }

    public String getDominioInternet() {
        return dominioInternet;
    }

    public void setDominioInternet(String dominioInternet) {
        dominioInternet=  dominioInternet.replaceAll("\\[","");
        dominioInternet=  dominioInternet.replaceAll("\\]","");
        dominioInternet=  dominioInternet.replaceAll("\"","");
        dominioInternet=dominioInternet.replaceAll(",",", +");
        this.dominioInternet = dominioInternet;
    }
}
