package Ordenacao;

import java.util.Arrays;

public class GeraVetor {
    
    public GeraVetor() {
    }    
    
    public void vetorCrescente(int[] vetor) {
        vetorAleatorio(vetor);
        Arrays.sort(vetor);
    }
    
    public void vetorDecrescente(int[] vetor) {
        vetorAleatorio(vetor);
        for (int i = 0; i < vetor.length / 2; i++) {
            int aux = vetor[i];
            vetor[i] = vetor[vetor.length - 1 - i];
            vetor[vetor.length - 1 - i] = aux;
        }
    }    
    
    public void vetorAleatorio(int[] vetor) {
        for (int i=0; i < vetor.length; i++)
            vetor[i] = (int)(Math.random()*1000000);        
    }    
}
