package cliente;

import cliente.Cliente.SomadorEsperado;

public class SomadorAdapter implements SomadorEsperado {
    public int somaVetor(int[] vetor) {
        int resultado = 0;
        for(int i: vetor) {
            resultado += i;
        }
        return resultado;
    }
}