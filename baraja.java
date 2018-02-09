import java.util.Random;
public class barajas{
  private naipe[] cartas;

    public baraja (){
      //se llama el arreglo con la variable=new
      this.cartas=new naipe[52];
      int c=0;
        for (int i=0;i<naipe.palosStr.length;i++){ //en arreglos no lleva parentesis despues del length
          for (int j=0;j<naipe.valoresStr.length;j++){
            this.cartas[c++]=new naipe(j,i);
            //c++ va guardand las cartas hasta llegar al 52, se pone el c++ para ser independiente de el contador.
          }
        }


    }
    public void mezcla(){
      Random ran=new Random();
      int aleatorio;
      naipe aux;
      for(int i=0;i<this.cartas.length;i++){
        aleatorio=ran.nextInt(this.cartas.length);
        aux=carta[i];
        cartas[i]=cartas[aleatorio];
        cartas[aleatorio]=aux;

      }
    }
    //to string es para saber que se va a hacer.
public String toString(){
  String res="";
  for(int i=0;i<this.cartas.length;i++){
    res+=this.cartas[i]+"\t";
  }
  return res;
}
}
//Conocer metodos String, CharAt,Indexof
