package robertoBelchiorADO1;
public class Rato {
    private String nome;
    private int idade;
    private String cor;

    public Rato() {
        // Construtor vazio
    }

    public Rato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // Métodos do animal
    public void correr() {
        System.out.println(nome + " está correndo.");
    }

    public void roer() {
        System.out.println(nome + " está roendo algo.");
    }
    public void dormindo() {
        System.out.println("\n"+nome + " está dormindo.");
    }
}
