package petshop;

public class Pet {

   private String nome;
   private String especie;
   private double peso;
   private String porte;
   private String raca;

   @Override
   public String toString() {
      return
              nome + " (" +
              especie +  ") - " +
                      raca + " - " +
              peso + " kg - Porte " + porte;
   }

   public String getRaca() {
      return raca;
   }

   public void setRaca(String raca) {
      this.raca = raca;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getEspecie() {
      return especie;
   }

   public void setEspecie(String especie) {
      this.especie = especie;
   }

   public double getPeso() {
      return peso;
   }

   public void setPeso(double peso) {
      this.peso = peso;
   }

   public String getPorte() {
      return porte;
   }

   public void setPorte(String porte) {
      this.porte = porte;
   }


   public String definirPorte() {

      if (peso < 10) {
         return "Pequeno";
      } else if (peso >= 10 && peso < 25) {
         return "Médio";
      } else {
         return "Grade";
      }
   }

   public void emitirSom(){
      System.out.println(getNome() + " está emitindo um som.");
   }
}