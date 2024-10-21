import java.util.*;
public class Main {
    public static void main(String[] args) {
        Fazenda minhaFazenda = new Fazenda();
        minhaFazenda.adicionarAnimal(new Cachorro("Rex"));
        minhaFazenda.adicionarAnimal(new Gato("Mimi"));

        minhaFazenda.fazerSomDosAnimais();

        minhaFazenda.NomeAnimais();

        testarFazenda(minhaFazenda, "Rex");

        minhaFazenda.fazerSomDosAnimais();
    }

    public static void testarFazenda(Fazenda fazenda, String nome) {
        Iterator<Animal> iter = fazenda.getIterator();  // Declaração do Iterator
        while (iter.hasNext()) {
            Animal next = iter.next();
            System.out.println("Verificando animal: " + next.getNome());

            if (nome.equals(next.getNome())) {
                iter.remove(); 
            }
        }
    }
}