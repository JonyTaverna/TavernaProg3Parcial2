import java.util.ArrayList;

public class ObjetoJson {
    private ArrayList<Persona> personas;
    private ArrayList<Registro> registros;

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public ArrayList<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(ArrayList<Registro> registros) {
        this.registros = registros;
    }

    public ObjetoJson() {
        this.personas = new ArrayList<>();
        this.registros = new ArrayList<>();
    }

    public void addPersona (Persona p1){
        personas.add(p1);
    }
    public void addRegistro (Registro r1){
        registros.add(r1);
    }
}
