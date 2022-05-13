public class VocalesMain {

    

    public static void main(String[] args){
        Pila pila = new Pila(5);

        pila.agregar("A");
        System.out.println(pila.mostrarCima());
        pila.agregar("E");
        System.out.println(pila.mostrarCima());
        pila.agregar("I");
        System.out.println(pila.mostrarCima());
        pila.agregar("O");
        System.out.println(pila.mostrarCima());
        pila.agregar("U");


        //System.out.println(pila.mostrarCima());
        System.out.println(pila.vacio());
        System.out.println(pila.extraer());
        System.out.println(pila.vacio());
        System.out.println(pila.extraer());

        
    }
    
}