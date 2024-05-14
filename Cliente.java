package cliente;

public class Cliente {
    private SomadorEsperado somador;

    private Cliente(SomadorEsperado somador) {
        this.somador = somador;
    }
    
    public void executar() {
        int[] vetor = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int soma = somador.somaVetor(vetor);
        System.out.println(String.format("\nResultado: %d\n", soma)); // Coloquei o line break para deixar o valor isolado, pois na minha IDE estava dando algum problema no print
    }

    public interface SomadorEsperado {
        public int somaVetor(int[] vetor);
    }

    public static void main(String[] args) {
        SomadorAdapter adaptador = new SomadorAdapter();
        Cliente cliente = new Cliente(adaptador);
        cliente.executar();
    }
}
