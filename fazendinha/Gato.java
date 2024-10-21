class Gato implements Animal {
    private String nome;

    // Construtor que recebe o nome
    public Gato(String nome) {
        this.nome = nome;
    }

    // Implementação do método som
    @Override
    public void som() {
        System.out.println(nome + " (Gato) mia");
    }

    @Override
    public String getNome() {
        return nome;
    }
}