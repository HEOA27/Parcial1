public class Pelicula implements Visualizable{
	private String titulo;
	private String genero;
	private String director;
	private int año;
	private double duracion;
	private boolean visto;
	public Pelicula(String titulo2, String director2, double duracion2, int num_temporadas) {
		super();
	}
	public Pelicula(String titulo,  String director) {
		super();
		this.titulo = "Agua";
		this.genero = "Drama";
		this.director = "Farme.R";
		this.año = 1999;
		this.duracion = 2.5;
		this.visto = false;
	}
	public Pelicula(String titulo, String genero, String director, int año, double duracion) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.director = director;
		this.año = año;
		this.duracion = duracion;

	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", genero=" + genero + ", director=" + director + ", año=" + año
				+ ", duracion=" + duracion + ", visto=" + visto + "]";
	}
/*public boolean marcarVisto(){

}
public boolean esVisto(){

}
public boolean tiempoVisto(){

}*/
	@Override
	public boolean marcarVisto(boolean visto) {
		if(visto==false) {
			visto=true;
		}		return visto;
	}
	@Override
	public boolean esVisto() {
		// TODO Auto-generated method stub
		return esVisto();
	}
	@Override
	public double tiempoVisto() {
		// TODO Auto-generated method stub
		return 0;
	}

}
