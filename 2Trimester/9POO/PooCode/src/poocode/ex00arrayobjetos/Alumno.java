package poocode.ex00arrayobjetos;

public class Alumno {
  
  private String nombre;
  private double notaMedia = 0.0;
  
  

  
  
  
  
  
  
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public double getNotaMedia() {
    return notaMedia;
  }
  public void setNotaMedia(double notaMedia) {
    this.notaMedia = notaMedia;
  }

  @Override
  public String toString() {
    return "Alumno{" + "Nombre = " + nombre + ", Nota Media = " + notaMedia + '}';
  }

  public Alumno() {
    this.nombre = "Sin Nombre";
    this.notaMedia = 0.0;
  }
  
  
  
  
  
}
