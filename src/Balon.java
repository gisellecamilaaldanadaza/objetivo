
 public class Balon {
    //atributo
 String nombre;
 String dimenciones;
 String textura;
 String formar;

 public static void main (String [] args) {
     Balon  Balon1 =new Balon();

     Balon1.nombre = "balon de futbol";
     Balon1.dimenciones= "68*70 cm";
     Balon1.textura="blanco con negro";
     Balon1.formar="redonda";

     System.out.println("el nombre de su Balon1 es:"+Balon1.nombre);
     System.out.println("el dimenciones de su Balon1 es:"+Balon1.dimenciones);
     System.out.println("el textura  de su Balon1 es:"+Balon1.textura);
     System.out.println("el formar  de su Balon1 es"+Balon1.formar);

     Balon Balon2 =new Balon();

     Balon2.nombre = "balon beisbol";
     Balon2.dimenciones= "67*71 cm ";
     Balon2.textura="negro con rojo";
     Balon2.formar="redonda";

     System.out.println("el nombre de su Balon2 es:"+Balon2.nombre);
     System.out.println("el dimenciones de su Balon2 es:"+ Balon2.dimenciones);
     System.out.println("el texturas de su Balon2  es:"+Balon2.textura);
     System.out.println("el formar de su Balon2 es:"+Balon2.formar);

     Balon  Balon3 =new Balon();

     Balon3.nombre = "balon tennis";
     Balon3.dimenciones="57*61";
     Balon3.textura="verde con blando";
     Balon3.formar="redonda";

     System.out.println("el nombre de su Balon3 es:"+Balon3.nombre);
     System.out.println("el dimenciones  de su Balon3 es:"+Balon3.dimenciones);
     System.out.println("el textura de su Balon3 es:"+Balon3.textura);
     System.out.println("el formar  de su Balon3 es:"+Balon3.formar);


 }
 }

