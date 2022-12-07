package Ordenacao;

import java.util.Arrays;

public class AlgoritmosOrdenacao {
    long tempoInicial;
    long tempoTotal;
    boolean primeiraIteracao = true;

    public AlgoritmosOrdenacao() {
    }
    
    /*
        ALGORITMOS AUXILIARES
    */
    
    private void troca(int[] vetor, int i, int j) {
        int aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;
    }        
    
    /*
        ALGORITMOS DE ORDENAÇÃO
    */
    
    public long bubbleSort(int[] vetor) { // BUBBLE SORT
        tempoInicial = System.nanoTime();
        
        boolean houveTroca = true;        
        while(houveTroca == true) {
            houveTroca = false;
            for (int i = 0; i < vetor.length-1; i++) {
                if (vetor[i] > vetor[i+1]) {
                    troca(vetor, i+1, i);                    
                    houveTroca = true;                    
                }
            }
        }
        
        return tempoTotal = System.nanoTime() - tempoInicial;
    }        
    
    public long selectionSort(int[] vetor) { // SELECTION SORT
        tempoInicial = System.nanoTime();
        
        int tamanho = vetor.length, pos;        
        for (int i = 0; i < tamanho; i++) {
            pos = i;
            for (int j = i + 1; j < tamanho; j++)
                if (vetor[j] < vetor[pos])
                    pos = j;            
            troca(vetor, i, pos);
        }
        
        return tempoTotal = System.nanoTime() - tempoInicial;
    }
    
    public long insertionSort(int[] vetor){ // INSERTION SORT
        tempoInicial = System.nanoTime();
        
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (vetor[j - 1] <= vetor[j])
                    break;
                troca(vetor, j, j-1);
            }
        }
        
        return tempoTotal = System.nanoTime() - tempoInicial;
    }
        
    public long mergeSort(int[] vetor) { // MERGE SORT
        tempoInicial = System.nanoTime();
        merge(vetor);
        return tempoTotal = System.nanoTime() - tempoInicial;
    }
    
    private int[] merge(int[] vetor){ 
        if(vetor.length <= 1) return vetor;    
        int meio = vetor.length >> 1;       
        int[] esquerda = Arrays.copyOfRange(vetor, 0, meio);
        int[] direita = Arrays.copyOfRange(vetor, meio, vetor.length);        
        return sort(merge(esquerda), merge(direita));
    }

    private int[] sort(int[] lado1, int[] lado2){
        int i = 0, j = 0, k = 0;
        int[] completo = new int[lado1.length + lado2.length];        
        while(i < lado1.length && j < lado2.length)
            completo[k++] = (lado1[i] <= lado2[j]) ? lado1[i++] : lado2[j++];                
        while(i < lado1.length)
            completo[k++] = lado1[i++];                
        while(j < lado2.length)
            completo[k++] = lado2[j++];                
        return completo;
    }
        
    public long quickSort(int[] vetor, int esquerda, int direita){ // QUICK SORT
        if (primeiraIteracao) {
            tempoInicial = System.nanoTime();
            primeiraIteracao = false;
        }
        
        int esq = esquerda, dir = direita, pivot = vetor[(esq + dir) / 2];
        
        while (esq <= dir) {
            while(vetor[esq] < pivot) esq++;
            while(vetor[dir] > pivot) dir--;
            if(esq <= dir){
                if(esq != dir)
                    troca(vetor, esq, dir);                
                esq++; dir--;
            }
        }
        
        if(esquerda < dir) quickSort(vetor, esquerda, dir);
        if(esq < direita) quickSort(vetor, esq, direita);
        
        return tempoTotal = System.nanoTime() - tempoInicial;
    }
    
    public long radixSort(int[] vetor){ // RADIX SORT
        tempoInicial = System.nanoTime();
        
        int max = 0;
        for(int i = 0; i < vetor.length; i++){
            if(max < vetor[i])
                max = vetor[i];            
        }
        int digitoMax = 1;
        while(max / 10 > 0){
            digitoMax++;
            max = max / 10;
        }

        int[][] buckets = new int[10][vetor.length];
        int base = 10;

        for(int i = 0; i < digitoMax; i++){
            int[] auxBucket = new int[10];

            for(int j = 0; j < vetor.length; j++){
                int achaBucket = (vetor[j] % base) / (base / 10);
                buckets[achaBucket][auxBucket[achaBucket]] = vetor[j];
                auxBucket[achaBucket]++;
            }

            int k = 0;
            for(int b = 0; b < buckets.length; b++)
                for(int p = 0; p < auxBucket[b]; p++)
                    vetor[k++] = buckets[b][p];
            base *= 10;
        }
        
        return tempoTotal = System.nanoTime() - tempoInicial;
    }
    
    public long shellSort(int vetor[]) { // SHELL SORT
        tempoInicial = System.nanoTime();

        for (int intervalo = vetor.length/2; intervalo > 0; intervalo /= 2) {
            for (int i = intervalo; i < vetor.length; i += 1) {
                int aux = vetor[i], j;
                for (j = i; j >= intervalo && vetor[j - intervalo] > aux; j -= intervalo)
                    vetor[j] = vetor[j - intervalo];
                vetor[j] = aux;
            }
        }
        
        return tempoTotal = System.nanoTime() - tempoInicial;
    }
    
    public long  heapSort(int[] vetor){ // HEAP SORT
        tempoInicial = System.nanoTime();
        
        for(int i = vetor.length; i > 0; i--){
            heapMaximo(vetor, i);
            troca(vetor, 0, i-1);
        }
        
        return tempoTotal = System.nanoTime() - tempoInicial;
    }

    private void heapMaximo(int[] vetor, int limite){
        if(vetor.length <= 0 || vetor.length < limite) return;
        int indiceParente = limite / 2;
        for(; indiceParente >= 0; indiceParente--){
            if (indiceParente * 2 >= limite) 
                continue;            
            int esquerda = indiceParente * 2;
            int direita = (esquerda + 1) >= limite ? esquerda : (esquerda + 1);
            int nosMaximos = vetor[esquerda] >= vetor[direita] ? esquerda : direita;
            if (vetor[nosMaximos] > vetor[indiceParente])
                troca(vetor, indiceParente, nosMaximos);            
        }
    }
    
    public long gnomeSort(int[] vetor){ // GNOME SORT
        tempoInicial = System.nanoTime();
        
        int pos = 0;
        while(pos < vetor.length){
            if(pos == 0 || vetor[pos] >= vetor[pos-1]){
                pos++;
            } else {
                troca(vetor, pos, pos - 1);
                pos--;
            }
        }
        
        return tempoTotal = System.nanoTime() - tempoInicial;
    }
    
    public long pigeonHoleSort(int vetor[]) { // PIGEONHOLE SORT
        tempoInicial = System.nanoTime();

        int min = vetor[0]; 
        int max = vetor[0]; 
        int intervalo, index; 

        for(int i = 0; i < vetor.length; i++) { 
                if(vetor[i] > max) 
                        max = vetor[i]; 
                if(vetor[i] < min) 
                        min = vetor[i]; 
        }         
        intervalo = max - min + 1;

        int[] phole = new int[intervalo]; 
        Arrays.fill(phole, 0); 

        for(int i = 0; i < vetor.length; i++) 
            phole[vetor[i] - min]++; 
        index = 0; 
        for(int i = 0; i < intervalo; i++) 
            while(phole[i] --> 0) 
                vetor[index++] = i + min;

        return tempoTotal = System.nanoTime() - tempoInicial;
	} 

    public long cocktailSort(int vetor[]) { // COCKTAIL SORT 
        tempoInicial = System.nanoTime();

        boolean houveTroca = true; 
        int inicio = 0; 
        int fim = vetor.length; 
  
        while (houveTroca == true) { 
            houveTroca = false;   
            for (int i = inicio; i < fim - 1; ++i) { 
                if (vetor[i] > vetor[i + 1]) { 
                    troca(vetor, i, i + 1); 
                    houveTroca = true; 
                } 
            } 
  
            if (houveTroca == false) 
                break; 

            houveTroca = false; 
  
            fim--; 
  
            for (int i = fim - 1; i >= inicio; i--) { 
                if (vetor[i] > vetor[i + 1]) { 
                    troca(vetor, i, i + 1);
                    houveTroca = true;
                } 
            } 

            inicio++; 
        }  

        return tempoTotal = System.nanoTime() - tempoInicial;
    }

}
