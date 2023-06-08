import java.util.Random;

public class Registro {
    private Integer dni;
    private Double temp;
    private String barrio;

    public Registro() {
    }

    public Registro(Integer dni, Double temp, String barrio) {
        this.dni = dni;
        this.temp = temp;
        this.barrio = barrio;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }


    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
}
