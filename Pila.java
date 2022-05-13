public class Pila{

    String arreglo[];
    int tamanoMax;
    int cima;

    public Pila(int n){
      tamanoMax=n;
      arreglo = new String [tamanoMax];
      cima=0;
   }

   public boolean vacio(){
      if (cima==0)
         return true;
        else { 
         return false;}
    }

    public void agregar(String str){
      if (cima < tamanoMax){
         arreglo[cima]=str;
         cima++;
       }
   }

   public String mostrarCima(){
     if (cima > 0){
         return arreglo[cima-1];
    } else
     return null;
    }

    public String extraer(){
       String temp=null;
       if (cima>0){
         temp= arreglo [cima-1];
         arreglo[cima-1]=null;
         cima--;
       }
        return temp;
    }

}