
public class Pessoa implements Comparable<Pessoa>
{
  Data nascimento;
  String nome;

  public Pessoa(Data nascimento, String nome) {
    this.nascimento = nascimento;
    this.nome = nome;
  }

  public String toString(){
    return String.format("%s - %s", nascimento, nome);
  }

  public int compareTo(Pessoa p2) {
    if(this.nascimento.compareTo(p2.nascimento)<0) return 1;
    if(this.nascimento.compareTo(p2.nascimento)>0) return -1;
    return 0;
  }
}
