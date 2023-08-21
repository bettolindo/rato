package robertoBelchiorADO1;
public class main {
    public static void main(String[] args) {
        Rato rato1 = new Rato("Rato exp1", 7, "Cinza");
        Rato rato2 = new Rato("Rato exp2", 3, "Marrom");

        System.out.println("Nomes dos animais:");
        System.out.println("1. Nome: " + rato1.getNome()+"\n   Cor: "+ rato1.getCor()+"\n   Idade: "+rato1.getIdade());
        System.out.println("\n2. Nome: " + rato2.getNome()+"\n   Cor: "+ rato2.getCor()+"\n   Idade: "+rato2.getIdade());

      System.out.println("\nAção - "+rato1.getNome()+":");
        rato1.correr();
      System.out.println("\nAcão - "+rato2.getNome()+":");
        rato2.roer();
        
    }
}

