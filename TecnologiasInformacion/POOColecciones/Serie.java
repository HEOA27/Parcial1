public class Serie {
        private String titulo;
        private int num_temporadas;
        private boolean visto;
        private String director;
        private double duracion;
        public Serie(String titulo, String director) {
            super();
            this.titulo = "Ann with a E";
            this.num_temporadas = 3;
            this.visto = false;
            this.director = "A.J";
            this.duracion = 1.40;
        }
        public Serie() {
        }
        public Serie(String titulo, int num_temporadas, String director, double duracion) {
            super();
            this.titulo = titulo;
            this.num_temporadas = num_temporadas;
            this.director = director;
            this.duracion = duracion;
        }
        public String getTitulo() {
            return titulo;
        }
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
        public int getNum_temporadas() {
            return num_temporadas;
        }
        public void setNum_temporadas(int num_temporadas) {
            this.num_temporadas = num_temporadas;
        }
        public String getDirector() {
            return director;
        }
        public void setDirector(String director) {
            this.director = director;
        }
        public double getDuracion() {
            return duracion;
        }
        public void setDuracion(double duracion) {
            this.duracion = duracion;
        }
        @Override
        public String toString() {
            return "Serie [titulo=" + titulo + ", num_temporadas=" + num_temporadas + ", visto=" + visto + ", director="
                    + director + ", duracion=" + duracion + "]";
        }
        
        
    
    
}
