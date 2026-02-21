public class Array {

    private Pet[] lista = new Pet[3];
    private int contador = 0;

    /**
     * insere um objeto do tipo Pet no array lista.
     *
     * @param pet Pet
     */

    public void inserir(Pet pet) {
        lista[contador++] = pet;
    }

    /**
     * Exibir o conteúdo relevante do array lista.
     */

    public void exibir() {
        for (int i = 0; i < contador; i++) {
            System.out.println(lista[i]);
        }
    }
}

