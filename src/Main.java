public class Main {
    public static void main(String[] args) throws Exception {
        Persona p1 = new Persona("juan", "lopez",34,"sanJose",34562342,"cantante");
        Persona p2 = new Persona("jose", "rojas",37,"rosa",34565422,"pesca");
        Persona p3 = new Persona("laura", "vega",67,"constitucion",65445432,"costura");

        SSM ssm1 = new SSM(5);
        ssm1.sumarPersonaLista(p1);
        ssm1.sumarPersonaLista(p2);
        ssm1.sumarPersonaLista(p3);

        try {
            ssm1.aislarArchiBin();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        ssm1.sanosYaislados();

    }
}