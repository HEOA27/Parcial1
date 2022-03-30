public class SerieHerencia extends Pelicula implements Visualizable{
    private int num_temporadas;

	
    //EN LA CLASE PELÍCULA YA TENEMOS UN CONSTRUCTOR DONDE ESTAN INICIALIZADOS
   public SerieHerencia(String titulo, String director, double duracion, int num_temporadas) {
        super(titulo,director,duracion,num_temporadas);
        this.num_temporadas = num_temporadas;

    }

	public int getNum_temporadas() {
		return num_temporadas;
	}

	public void setNum_temporadas(int num_temporadas) {
		this.num_temporadas = num_temporadas;
	}
    public boolean marcarVisto(boolean visto){
        if(visto==false) {
			visto=true;
		}
        return visto;

    }
    public boolean esVisto(){
        return esVisto();
    
    }
    public double tiempoVisto(){
        return num_temporadas;
    
    }
    
    public String toString() {
		return "SerieHerencia [titulo=" + getTitulo() + ", director=" + getDirector() + ", duracion=" + getDuracion() + ", numtemporadas=" + num_temporadas + "]";
	}
}
