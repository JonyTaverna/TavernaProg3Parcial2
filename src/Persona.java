import java.util.Random;

public class Persona {
    private String nombre;
    private String aprellido;
    private Integer edad;
    private String barrio;
    private Integer dni;
    private String ocupacion;
    private Integer kit;

    //region GYS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAprellido() {
        return aprellido;
    }

    public void setAprellido(String aprellido) {
        this.aprellido = aprellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Integer getKit() {
        return kit;
    }

    public void setKit(Integer kit) {
        this.kit = kit;
    }
//endregion
    //region const

    public Persona() {
    }

    public Persona(String nombre, String aprellido, Integer edad, String barrio, Integer dni, String ocupacion) {
        this.nombre = nombre;
        this.aprellido = aprellido;
        this.edad = edad;
        this.barrio = barrio;
        this.dni = dni;
        this.ocupacion = ocupacion;
        this.kit = kitRandom();
    }
    //endregion

    public Integer kitRandom(){
        Random ran = new Random();
        return ran.nextInt(50);
    }

    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.dni == null ? 0 : this.dni.hashCode());
        return result;
    }

    public Double tempRandom(){
        Random rm = new Random();
        Double temp = rm.nextDouble(36,39);
        return temp;
    }
    public Registro registrarse (){
        Registro r1 = new Registro(this.getDni(),tempRandom(),this.getBarrio() );
        return r1;
    }
}
