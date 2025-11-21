package ifba;

public class Telefone {
	 	
    private String nome;
    private String numero;

   public Telefone() {
   super();
   
   }

   public Telefone(String nome, String numero) {
       this.nome = nome;
       this.numero = numero;
   }

   public String getNome() {
       return nome;
   }

   public String getNumero() {
       return numero;
   }

   @Override
   public String toString() {
       return "Nome: " + nome + " | Telefone: " + numero;
   }
}
