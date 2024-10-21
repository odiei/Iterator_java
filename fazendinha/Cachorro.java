class Cachorro implements Animal {
    private String nome;

    // Construtor que recebe o nome
    public Cachorro(String nome) {
        this.nome = nome;
    }

    // Implementação do método som
    @Override
    public void som() {
        System.out.println(nome + " (Cachorro) late");
    }

    // Implementação do método getNome
    @Override
    public String getNome() {
        return nome;
    }
}