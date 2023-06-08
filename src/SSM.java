import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class SSM {
    private ArrayList<Persona> listaP;
    private Integer kit;
    private Integer id;

    //region const
    public SSM() {
    }

    public SSM(Integer tests) {
        this.listaP = new ArrayList<>();
        this.kit = kit;
        this.id = 0;
    }
    //endregion

    //region gys
    public ArrayList<Persona> getListaP() {
        return listaP;
    }

    public void setListaP(ArrayList<Persona> listaP) {
        this.listaP = listaP;
    }

    public Integer getTests() {
        return kit;
    }

    public void setTests(Integer tests) {
        this.kit = tests;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //endregion

    public boolean tieneKit(Persona persona) throws Exept{
        boolean disponible;
        if(persona.getKit()!=null){
            disponible = true;
        }else{
            disponible = false;
            throw new Exept();
        }
        return disponible;
    }

    public void sumarPersonaLista(Persona p1) {
        try {
            for (Persona p : listaP) {
                Integer dni = p.getDni();
                if (p1.getDni() != dni) {
                    listaP.add(p1);
                }else{
                    System.out.println("dni repetido");
                }
            }
        } catch (Exception e) {
            System.out.println("la persona no tiene kit");
        }
    }
    public HashMap<Integer,Persona> armarHashdeLista (){
        HashMap<Integer,Persona> hm= new HashMap<>();
        for(Persona p: listaP){
            hm.put(p.getKit(),p);
        }
        return hm;
    }
    public HashMap<Integer,Registro> testear(){
        HashMap<Integer,Registro> hashmaptest = new HashMap<>();
        for (Persona p: armarHashdeLista().values()) {
            hashmaptest.put(p.getKit(),p.registrarse());
        }
        return hashmaptest;
    }
    public void aislarArchiBin() throws Exception{
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("urgente.dat"));
            ArrayList<Registro> personasAislar = new ArrayList<>();
            boolean estado = true;
            try {
                for(Registro r : testear().values()){
                    try{
                        if(r.getTemp() < 38){
                            estado = true;
                            //sanos.add(persona);
                        }else{
                            estado = false;
                        }
                    }catch(Exception e){
                        personasAislar.add(r);
                    }
                }
                oos.writeObject(personasAislar);
                System.out.println("personas aisladas");
            } catch (Throwable var6) {
                try {
                    oos.close();
                } catch (Throwable var5) {
                    var6.addSuppressed(var5);
                }
                throw var6;
            }
            oos.close();
        } catch (IOException var7) {
            var7.printStackTrace();
        }
    }
    public void sanosYaislados(){
        ObjetoJson objj = new ObjetoJson();

        try(FileWriter writer = new FileWriter("sanosyAislar")){
            Gson gson = new GsonBuilder().create();
            for(Registro r : testear().values()){
                if(r.getTemp() < 38){
                    Integer dni = r.getDni();
                    for (Persona p : listaP){
                        if (dni == p.getDni()){
                            objj.addPersona(p);
                            //sanos.add(p);
                        }
                    }
                }else{
                    objj.addRegistro(r);
                }
            }
            String json = gson.toJson(objj);

            writer.append(json);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}



/*

*/