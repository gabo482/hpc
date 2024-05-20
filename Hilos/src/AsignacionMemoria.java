public class AsignacionMemoria {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}


class Persona{  
    private int id;
    private String nombre;

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        for(int i=0; i<=500;i++ ){
            System.out.println(i);
            Persona persona = new Persona (i, "Nombre");
            System.out.println(persona);
        }
    }
}