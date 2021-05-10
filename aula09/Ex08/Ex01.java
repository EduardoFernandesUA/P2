
public class Poligno {
  private Ponto[] pontos = new Ponto(5);

  public void print(){
    System.out.println("Poligno");
    for (int i = 0; i < pontos.length; i++) {
      System.out.println("Ponto"+i+": "+pontos[i].getX+" "+pontos[i].getY)
    }
  }

  public double perimetro(){
    double p = 0;
    for (int i = 0; i < pontos.length; i++) {
      p += Math.sqrt(
        Math.pow(pontos[i%pontos.length].getX()+pontos[(i+1)%pontos.length].getX(), 2)+
        Math.pow(pontos[i%pontos.length].getY()+pontos[(i+1)%pontos.length].getY(), 2)
        null
      );
    }
    p+=
    return p;
  }
}
if