import java.util.Objects;

public class Cadastro {
    private Animal[] animaisDisponiveis = new Animal[10];


    public void disponivel(Animal animal) {
        for (int i = 0; i < animaisDisponiveis.length; i++) {
            if (Objects.isNull(animaisDisponiveis[i]))
                if (Dono.class != null) {
                    animaisDisponiveis[i] = animal;
                    break;
                }
        }
    }

    public void mostraAnimaisdisponiveis() {
        System.out.println("ANIMAIS DISPONIVEIS: ");
        for (Animal animal : animaisDisponiveis) {
            if (Objects.nonNull(animal)) {
                System.out.println(animal);
            }
        }
    }
}



