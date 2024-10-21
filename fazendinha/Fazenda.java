import java.util.*;
class Fazenda {

    // Lista de animais na fazenda
    private ArrayList<Animal> animais;

    // Construtor
    public Fazenda() {
        animais = new ArrayList<>();
    }

    // Método para adicionar um animal à fazenda
    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public Iterator<Animal> getIterator() {
        return animais.iterator();
    }

    // Método para percorrer e fazer todos os animais emitirem som
    public void fazerSomDosAnimais() {
        for (Animal animal : animais) {
            animal.som();
        }
    }

        public void NomeAnimais() {
        for (Animal animal : animais) {
            animal.getNome();
        }
    }
}