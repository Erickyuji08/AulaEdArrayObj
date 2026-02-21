//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //instânciar a classe array
        Array array = new Array();

        Pet pet1 = new Pet("SRD", "Mel", 14.1f, 1);
        Pet pet2 = new Pet("SRD", "Gaia", 16.5f, 2);

        array.inserir(pet1);
        array.inserir(pet2);

        array.exibir();
    }

}