import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main (String [] args){
        List<Pelicula> listapelis=new ArrayList(5);
        List<SerieHerencia> listaseries=new ArrayList(5);
            listapelis.add(new Pelicula("Animal","Terror", "Rene.H",2,1.30));
           /* listapelis.add(new Pelicula("Agua", "Marta"));
            listapelis.add(new Pelicula("Efecto", "Nora.H"));
            listapelis.add(new Pelicula("Candy", "RS.S"));
            listapelis.add(new Pelicula("Colon", "Tania.H"));*/
            Pelicula pel =new Pelicula("Nuevo", "Sage");
SerieHerencia sh =new SerieHerencia("titulo", "director", 3, 2);
            listaseries.add(new SerieHerencia("lost", "Marc.T", 1.50, 1));
            listaseries.add(new SerieHerencia("Yoyo", "Hector.P", 1.20, 2));

            for (int i = 0;  i<listapelis.size(); i++) {
                System.out.println(listapelis);
            }
            
          

    }

   
}
