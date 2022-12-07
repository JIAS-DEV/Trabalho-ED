package Ordenacao;

import java.util.Scanner;

public class Main {
    AlgoritmosOrdenacao algoritmo = new AlgoritmosOrdenacao();
    GeraVetor geraVetor = new GeraVetor();

    int[] colecao1k = new int[1000];   
    int[] colecao10k = new int[10000];   
    int[] colecao500k = new int[500000];   
    int[] colecao1kk = new int[1000000];
    
    double conversao = 1000000000.0;    
        
    public static void main(String[] args) {
        Main executa = new Main();
        
        do {
            switch (menu()) {
                case 1:                    
                    executa.bubbleSort();
                    break;
                case 2:
                    executa.selectionSort();
                    break;
                case 3:
                    executa.insertionSort();
                    break;
                case 4:
                    executa.mergeSort();
                    break;
                case 5:
                    executa.quickSort();
                    break;
                case 6:
                    executa.radixSort();
                    break;
                case 7:
                    executa.shellSort();
                    break;
                case 8:
                    executa.gnomeSort();
                    break;
                case 9:
                    executa.pigeonHoleSort();
                    break;
                case 10:
                    executa.cocktailSort();
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (menu() != 11);
    }    
    
    public static int menu() {
        Scanner leia = new Scanner(System.in);
        int opcao;        
        System.out.println("----------------MENU----------------"
                + "\n[1] BubbleSort"
                + "\n[2] SelectionSort"
                + "\n[3] InsertionSort"
                + "\n[4] MergeSort"
                + "\n[5] QuickSort"
                + "\n[6] RadixSort"
                + "\n[7] ShellSort"
                + "\n[8] GnomeSort"
                + "\n[9] PigeonHoleSort"
                + "\n[10] CocktailSort"
                + "\n[11] SAIR"
                + "\n------------------------------------\n");
        
        System.out.print("Digite aqui: ");
        opcao = leia.nextInt();
        return opcao;        
    }       
    
    public void bubbleSort() {
        System.out.println("===================================");
        geraVetor.vetorCrescente(colecao1k);
        geraVetor.vetorCrescente(colecao10k);
        geraVetor.vetorCrescente(colecao500k);
        geraVetor.vetorCrescente(colecao1kk);
        System.out.printf("Melhor cenario (1.000): %.6f Segundos\n", algoritmo.bubbleSort(colecao1k)/conversao);
        System.out.printf("Melhor cenario (10.000): %.6f Segundos\n", algoritmo.bubbleSort(colecao10k)/conversao);
        System.out.printf("Melhor cenario (500.000): %.6f Segundos\n", algoritmo.bubbleSort(colecao500k)/conversao);
        System.out.printf("Melhor cenario (1.000.000): %.6f Segundos\n", algoritmo.bubbleSort(colecao1kk)/conversao);
        System.out.println("===================================");
        geraVetor.vetorAleatorio(colecao1k);
        geraVetor.vetorAleatorio(colecao10k);
        geraVetor.vetorAleatorio(colecao500k);
        geraVetor.vetorAleatorio(colecao1kk);
        System.out.printf("Cenario medio (1.000): %.6f Segundos\n", algoritmo.bubbleSort(colecao1k)/conversao);
        System.out.printf("Cenario medio (10.000): %.6f Segundos\n", algoritmo.bubbleSort(colecao10k)/conversao);
        System.out.printf("Cenario medio (500.000): %.6f Segundos\n", algoritmo.bubbleSort(colecao500k)/conversao);
        System.out.printf("Cenario medio (1.000.000): %.6f Segundos\n", algoritmo.bubbleSort(colecao1kk)/conversao);
        System.out.println("===================================");
        geraVetor.vetorDecrescente(colecao1k);
        geraVetor.vetorDecrescente(colecao10k);
        geraVetor.vetorDecrescente(colecao500k);
        geraVetor.vetorDecrescente(colecao1kk);
        System.out.printf("Pior cenario (1.000): %.6f Segundos\n", algoritmo.bubbleSort(colecao1k)/conversao);
        System.out.printf("Pior cenario (10.000): %.6f Segundos\n", algoritmo.bubbleSort(colecao10k)/conversao);
        System.out.printf("Pior cenario (500.000): %.6f Segundos\n", algoritmo.bubbleSort(colecao500k)/conversao);
        System.out.printf("Pior cenario (1.000.000): %.6f Segundos\n", algoritmo.bubbleSort(colecao1kk)/conversao);
        System.out.println("===================================");
    }

    public void selectionSort() {
        System.out.println("===================================");
        geraVetor.vetorCrescente(colecao1k);
        geraVetor.vetorCrescente(colecao10k);
        geraVetor.vetorCrescente(colecao500k);
        geraVetor.vetorCrescente(colecao1kk);
        System.out.printf("Melhor cenario (1.000): %.6f Segundos\n", algoritmo.selectionSort(colecao1k)/conversao);
        System.out.printf("Melhor cenario (10.000): %.6f Segundos\n", algoritmo.selectionSort(colecao10k)/conversao);
        System.out.printf("Melhor cenario (500.000): %.6f Segundos\n", algoritmo.selectionSort(colecao500k)/conversao);
        System.out.printf("Melhor cenario (1.000.000): %.6f Segundos\n", algoritmo.selectionSort(colecao1kk)/conversao);
        System.out.println("===================================");
        geraVetor.vetorAleatorio(colecao1k);
        geraVetor.vetorAleatorio(colecao10k);
        geraVetor.vetorAleatorio(colecao500k);
        geraVetor.vetorAleatorio(colecao1kk);
        System.out.printf("Cenario medio (1.000): %.6f Segundos\n", algoritmo.selectionSort(colecao1k)/conversao);
        System.out.printf("Cenario medio (10.000): %.6f Segundos\n", algoritmo.selectionSort(colecao10k)/conversao);
        System.out.printf("Cenario medio (500.000): %.6f Segundos\n", algoritmo.selectionSort(colecao500k)/conversao);
        System.out.printf("Cenario medio (1.000.000): %.6f Segundos\n", algoritmo.selectionSort(colecao1kk)/conversao);
        System.out.println("===================================");
        geraVetor.vetorDecrescente(colecao1k);
        geraVetor.vetorDecrescente(colecao10k);
        geraVetor.vetorDecrescente(colecao500k);
        geraVetor.vetorDecrescente(colecao1kk);
        System.out.printf("Pior cenario (1.000): %.6f Segundos\n", algoritmo.selectionSort(colecao1k)/conversao);
        System.out.printf("Pior cenario (10.000): %.6f Segundos\n", algoritmo.selectionSort(colecao10k)/conversao);
        System.out.printf("Pior cenario (500.000): %.6f Segundos\n", algoritmo.selectionSort(colecao500k)/conversao);
        System.out.printf("Pior cenario (1.000.000): %.6f Segundos\n", algoritmo.selectionSort(colecao1kk)/conversao);
        System.out.println("===================================");
    }

    public void insertionSort() {
        System.out.println("===================================");
        geraVetor.vetorCrescente(colecao1k);
        geraVetor.vetorCrescente(colecao10k);
        geraVetor.vetorCrescente(colecao500k);
        geraVetor.vetorCrescente(colecao1kk);
        System.out.printf("Melhor cenario (1.000): %.6f Segundos\n", algoritmo.insertionSort(colecao1k)/conversao);
        System.out.printf("Melhor cenario (10.000): %.6f Segundos\n", algoritmo.insertionSort(colecao10k)/conversao);
        System.out.printf("Melhor cenario (500.000): %.6f Segundos\n", algoritmo.insertionSort(colecao500k)/conversao);
        System.out.printf("Melhor cenario (1.000.000): %.6f Segundos\n", algoritmo.insertionSort(colecao1kk)/conversao);
        System.out.println("===================================");
        geraVetor.vetorAleatorio(colecao1k);
        geraVetor.vetorAleatorio(colecao10k);
        geraVetor.vetorAleatorio(colecao500k);
        geraVetor.vetorAleatorio(colecao1kk);
        System.out.printf("Cenario medio (1.000): %.6f Segundos\n", algoritmo.insertionSort(colecao1k)/conversao);
        System.out.printf("Cenario medio (10.000): %.6f Segundos\n", algoritmo.insertionSort(colecao10k)/conversao);
        System.out.printf("Cenario medio (500.000): %.6f Segundos\n", algoritmo.insertionSort(colecao500k)/conversao);
        System.out.printf("Cenario medio (1.000.000): %.6f Segundos\n", algoritmo.insertionSort(colecao1kk)/conversao);
        System.out.println("===================================");
        geraVetor.vetorDecrescente(colecao1k);
        geraVetor.vetorDecrescente(colecao10k);
        geraVetor.vetorDecrescente(colecao500k);
        geraVetor.vetorDecrescente(colecao1kk);
        System.out.printf("Pior cenario (1.000): %.6f Segundos\n", algoritmo.insertionSort(colecao1k)/conversao);
        System.out.printf("Pior cenario (10.000): %.6f Segundos\n", algoritmo.insertionSort(colecao10k)/conversao);
        System.out.printf("Pior cenario (500.000): %.6f Segundos\n", algoritmo.insertionSort(colecao500k)/conversao);
        System.out.printf("Pior cenario (1.000.000): %.6f Segundos\n", algoritmo.insertionSort(colecao1kk)/conversao);
        System.out.println("===================================");
    }
    
    public void mergeSort() {
        System.out.println("===================================");
        geraVetor.vetorCrescente(colecao1k);
        geraVetor.vetorCrescente(colecao10k);
        geraVetor.vetorCrescente(colecao500k);
        geraVetor.vetorCrescente(colecao1kk);
        System.out.printf("Melhor cenario (1.000): %.6f Segundos\n", algoritmo.mergeSort(colecao1k)/conversao);
        System.out.printf("Melhor cenario (10.000): %.6f Segundos\n", algoritmo.mergeSort(colecao10k)/conversao);
        System.out.printf("Melhor cenario (500.000): %.6f Segundos\n", algoritmo.mergeSort(colecao500k)/conversao);
        System.out.printf("Melhor cenario (1.000.000): %.6f Segundos\n", algoritmo.mergeSort(colecao1kk)/conversao);
        System.out.println("===================================");
        geraVetor.vetorAleatorio(colecao1k);
        geraVetor.vetorAleatorio(colecao10k);
        geraVetor.vetorAleatorio(colecao500k);
        geraVetor.vetorAleatorio(colecao1kk);
        System.out.printf("Cenario medio (1.000): %.6f Segundos\n", algoritmo.mergeSort(colecao1k)/conversao);
        System.out.printf("Cenario medio (10.000): %.6f Segundos\n", algoritmo.mergeSort(colecao10k)/conversao);
        System.out.printf("Cenario medio (500.000): %.6f Segundos\n", algoritmo.mergeSort(colecao500k)/conversao);
        System.out.printf("Cenario medio (1.000.000): %.6f Segundos\n", algoritmo.mergeSort(colecao1kk)/conversao);
        System.out.println("===================================");
        geraVetor.vetorDecrescente(colecao1k);
        geraVetor.vetorDecrescente(colecao10k);
        geraVetor.vetorDecrescente(colecao500k);
        geraVetor.vetorDecrescente(colecao1kk);
        System.out.printf("Pior cenario (1.000): %.6f Segundos\n", algoritmo.mergeSort(colecao1k)/conversao);
        System.out.printf("Pior cenario (10.000): %.6f Segundos\n", algoritmo.mergeSort(colecao10k)/conversao);
        System.out.printf("Pior cenario (500.000): %.6f Segundos\n", algoritmo.mergeSort(colecao500k)/conversao);
        System.out.printf("Pior cenario (1.000.000): %.6f Segundos\n", algoritmo.mergeSort(colecao1kk)/conversao);
        System.out.println("===================================");
    }
        
    public void quickSort() {
        System.out.println("===================================");
        geraVetor.vetorCrescente(colecao1k);
        geraVetor.vetorCrescente(colecao10k);
        geraVetor.vetorCrescente(colecao500k);
        geraVetor.vetorCrescente(colecao1kk);
        System.out.printf("Melhor cenario (1.000): %.6f Segundos\n", algoritmo.quickSort(colecao1k, 0, colecao1k.length - 1)/conversao);
        System.out.printf("Melhor cenario (10.000): %.6f Segundos\n", algoritmo.quickSort(colecao10k, 0, colecao10k.length - 1)/conversao);
        System.out.printf("Melhor cenario (500.000): %.6f Segundos\n", algoritmo.quickSort(colecao500k, 0, colecao500k.length - 1)/conversao);
        System.out.printf("Melhor cenario (1.000.000): %.6f Segundos\n", algoritmo.quickSort(colecao1kk, 0, colecao1kk.length - 1)/conversao);
        System.out.println("===================================");
        geraVetor.vetorAleatorio(colecao1k);
        geraVetor.vetorAleatorio(colecao10k);
        geraVetor.vetorAleatorio(colecao500k);
        geraVetor.vetorAleatorio(colecao1kk);
        System.out.printf("Cenario medio (1.000): %.6f Segundos\n", algoritmo.quickSort(colecao1k, 0, colecao1k.length - 1)/conversao);
        System.out.printf("Cenario medio (10.000): %.6f Segundos\n", algoritmo.quickSort(colecao10k, 0, colecao10k.length - 1)/conversao);
        System.out.printf("Cenario medio (500.000): %.6f Segundos\n", algoritmo.quickSort(colecao500k, 0, colecao500k.length - 1)/conversao);
        System.out.printf("Cenario medio (1.000.000): %.6f Segundos\n", algoritmo.quickSort(colecao1kk, 0, colecao1kk.length - 1)/conversao);
        System.out.println("===================================");
        geraVetor.vetorDecrescente(colecao1k);
        geraVetor.vetorDecrescente(colecao10k);
        geraVetor.vetorDecrescente(colecao500k);
        geraVetor.vetorDecrescente(colecao1kk);
        System.out.printf("Pior cenario (1.000): %.6f Segundos\n", algoritmo.quickSort(colecao1k, 0, colecao1k.length - 1)/conversao);
        System.out.printf("Pior cenario (10.000): %.6f Segundos\n", algoritmo.quickSort(colecao10k, 0, colecao10k.length - 1)/conversao);
        System.out.printf("Pior cenario (500.000): %.6f Segundos\n", algoritmo.quickSort(colecao500k, 0, colecao500k.length - 1)/conversao);
        System.out.printf("Pior cenario (1.000.000): %.6f Segundos\n", algoritmo.quickSort(colecao1kk, 0, colecao1kk.length - 1)/conversao);
        System.out.println("===================================");
    }
    
    public void radixSort() {
        System.out.println("===================================");
        geraVetor.vetorCrescente(colecao1k);
        geraVetor.vetorCrescente(colecao10k);
        geraVetor.vetorCrescente(colecao500k);
        geraVetor.vetorCrescente(colecao1kk);
        System.out.printf("Melhor cenario (1.000): %.6f Segundos\n", algoritmo.radixSort(colecao1k)/conversao);
        System.out.printf("Melhor cenario (10.000): %.6f Segundos\n", algoritmo.radixSort(colecao10k)/conversao);
        System.out.printf("Melhor cenario (500.000): %.6f Segundos\n", algoritmo.radixSort(colecao500k)/conversao);
        System.out.printf("Melhor cenario (1.000.000): %.6f Segundos\n", algoritmo.radixSort(colecao1kk)/conversao);
        System.out.println("===================================");
        geraVetor.vetorAleatorio(colecao1k);
        geraVetor.vetorAleatorio(colecao10k);
        geraVetor.vetorAleatorio(colecao500k);
        geraVetor.vetorAleatorio(colecao1kk);
        System.out.printf("Cenario medio (1.000): %.6f Segundos\n", algoritmo.radixSort(colecao1k)/conversao);
        System.out.printf("Cenario medio (10.000): %.6f Segundos\n", algoritmo.radixSort(colecao10k)/conversao);
        System.out.printf("Cenario medio (500.000): %.6f Segundos\n", algoritmo.radixSort(colecao500k)/conversao);
        System.out.printf("Cenario medio (1.000.000): %.6f Segundos\n", algoritmo.radixSort(colecao1kk)/conversao);
        System.out.println("===================================");
        geraVetor.vetorDecrescente(colecao1k);
        geraVetor.vetorDecrescente(colecao10k);
        geraVetor.vetorDecrescente(colecao500k);
        geraVetor.vetorDecrescente(colecao1kk);
        System.out.printf("Pior cenario (1.000): %.6f Segundos\n", algoritmo.radixSort(colecao1k)/conversao);
        System.out.printf("Pior cenario (10.000): %.6f Segundos\n", algoritmo.radixSort(colecao10k)/conversao);
        System.out.printf("Pior cenario (500.000): %.6f Segundos\n", algoritmo.radixSort(colecao500k)/conversao);
        System.out.printf("Pior cenario (1.000.000): %.6f Segundos\n", algoritmo.radixSort(colecao1kk)/conversao);
        System.out.println("===================================");
    }
    
    public void shellSort() {
        System.out.println("===================================");
        geraVetor.vetorCrescente(colecao1k);
        geraVetor.vetorCrescente(colecao10k);
        geraVetor.vetorCrescente(colecao500k);
        geraVetor.vetorCrescente(colecao1kk);
        System.out.printf("Melhor cenario (1.000): %.6f Segundos\n", algoritmo.shellSort(colecao1k)/conversao);
        System.out.printf("Melhor cenario (10.000): %.6f Segundos\n", algoritmo.shellSort(colecao10k)/conversao);
        System.out.printf("Melhor cenario (500.000): %.6f Segundos\n", algoritmo.shellSort(colecao500k)/conversao);
        System.out.printf("Melhor cenario (1.000.000): %.6f Segundos\n", algoritmo.shellSort(colecao1kk)/conversao);
        System.out.println("===================================");
        geraVetor.vetorAleatorio(colecao1k);
        geraVetor.vetorAleatorio(colecao10k);
        geraVetor.vetorAleatorio(colecao500k);
        geraVetor.vetorAleatorio(colecao1kk);
        System.out.printf("Cenario medio (1.000): %.6f Segundos\n", algoritmo.shellSort(colecao1k)/conversao);
        System.out.printf("Cenario medio (10.000): %.6f Segundos\n", algoritmo.shellSort(colecao10k)/conversao);
        System.out.printf("Cenario medio (500.000): %.6f Segundos\n", algoritmo.shellSort(colecao500k)/conversao);
        System.out.printf("Cenario medio (1.000.000): %.6f Segundos\n", algoritmo.shellSort(colecao1kk)/conversao);
        System.out.println("===================================");
        geraVetor.vetorDecrescente(colecao1k);
        geraVetor.vetorDecrescente(colecao10k);
        geraVetor.vetorDecrescente(colecao500k);
        geraVetor.vetorDecrescente(colecao1kk);
        System.out.printf("Pior cenario (1.000): %.6f Segundos\n", algoritmo.shellSort(colecao1k)/conversao);
        System.out.printf("Pior cenario (10.000): %.6f Segundos\n", algoritmo.shellSort(colecao10k)/conversao);
        System.out.printf("Pior cenario (500.000): %.6f Segundos\n", algoritmo.shellSort(colecao500k)/conversao);
        System.out.printf("Pior cenario (1.000.000): %.6f Segundos\n", algoritmo.shellSort(colecao1kk)/conversao);
        System.out.println("===================================");
    }
    
    public void gnomeSort() {
        System.out.println("===================================");
        geraVetor.vetorCrescente(colecao1k);
        geraVetor.vetorCrescente(colecao10k);
        geraVetor.vetorCrescente(colecao500k);
        geraVetor.vetorCrescente(colecao1kk);
        System.out.printf("Melhor cenario (1.000): %.6f Segundos\n", algoritmo.gnomeSort(colecao1k)/conversao);
        System.out.printf("Melhor cenario (10.000): %.6f Segundos\n", algoritmo.gnomeSort(colecao10k)/conversao);
        System.out.printf("Melhor cenario (500.000): %.6f Segundos\n", algoritmo.gnomeSort(colecao500k)/conversao);
        System.out.printf("Melhor cenario (1.000.000): %.6f Segundos\n", algoritmo.gnomeSort(colecao1kk)/conversao);
        System.out.println("===================================");
        geraVetor.vetorAleatorio(colecao1k);
        geraVetor.vetorAleatorio(colecao10k);
        geraVetor.vetorAleatorio(colecao500k);
        geraVetor.vetorAleatorio(colecao1kk);
        System.out.printf("Cenario medio (1.000): %.6f Segundos\n", algoritmo.gnomeSort(colecao1k)/conversao);
        System.out.printf("Cenario medio (10.000): %.6f Segundos\n", algoritmo.gnomeSort(colecao10k)/conversao);
        System.out.printf("Cenario medio (500.000): %.6f Segundos\n", algoritmo.gnomeSort(colecao500k)/conversao);
        System.out.printf("Cenario medio (1.000.000): %.6f Segundos\n", algoritmo.gnomeSort(colecao1kk)/conversao);
        System.out.println("===================================");
        geraVetor.vetorDecrescente(colecao1k);
        geraVetor.vetorDecrescente(colecao10k);
        geraVetor.vetorDecrescente(colecao500k);
        geraVetor.vetorDecrescente(colecao1kk);
        System.out.printf("Pior cenario (1.000): %.6f Segundos\n", algoritmo.gnomeSort(colecao1k)/conversao);
        System.out.printf("Pior cenario (10.000): %.6f Segundos\n", algoritmo.gnomeSort(colecao10k)/conversao);
        System.out.printf("Pior cenario (500.000): %.6f Segundos\n", algoritmo.gnomeSort(colecao500k)/conversao);
        System.out.printf("Pior cenario (1.000.000): %.6f Segundos\n", algoritmo.gnomeSort(colecao1kk)/conversao);
        System.out.println("===================================");
    }
    
    public void pigeonHoleSort() {
        System.out.println("===================================");
        geraVetor.vetorCrescente(colecao1k);
        geraVetor.vetorCrescente(colecao10k);
        geraVetor.vetorCrescente(colecao500k);
        geraVetor.vetorCrescente(colecao1kk);
        System.out.printf("Melhor cenario (1.000): %.6f Segundos\n", algoritmo.pigeonHoleSort(colecao1k)/conversao);
        System.out.printf("Melhor cenario (10.000): %.6f Segundos\n", algoritmo.pigeonHoleSort(colecao10k)/conversao);
        System.out.printf("Melhor cenario (500.000): %.6f Segundos\n", algoritmo.pigeonHoleSort(colecao500k)/conversao);
        System.out.printf("Melhor cenario (1.000.000): %.6f Segundos\n", algoritmo.pigeonHoleSort(colecao1kk)/conversao);
        System.out.println("===================================");
        geraVetor.vetorAleatorio(colecao1k);
        geraVetor.vetorAleatorio(colecao10k);
        geraVetor.vetorAleatorio(colecao500k);
        geraVetor.vetorAleatorio(colecao1kk);
        System.out.printf("Cenario medio (1.000): %.6f Segundos\n", algoritmo.pigeonHoleSort(colecao1k)/conversao);
        System.out.printf("Cenario medio (10.000): %.6f Segundos\n", algoritmo.pigeonHoleSort(colecao10k)/conversao);
        System.out.printf("Cenario medio (500.000): %.6f Segundos\n", algoritmo.pigeonHoleSort(colecao500k)/conversao);
        System.out.printf("Cenario medio (1.000.000): %.6f Segundos\n", algoritmo.pigeonHoleSort(colecao1kk)/conversao);
        System.out.println("===================================");
        geraVetor.vetorDecrescente(colecao1k);
        geraVetor.vetorDecrescente(colecao10k);
        geraVetor.vetorDecrescente(colecao500k);
        geraVetor.vetorDecrescente(colecao1kk);
        System.out.printf("Pior cenario (1.000): %.6f Segundos\n", algoritmo.pigeonHoleSort(colecao1k)/conversao);
        System.out.printf("Pior cenario (10.000): %.6f Segundos\n", algoritmo.pigeonHoleSort(colecao10k)/conversao);
        System.out.printf("Pior cenario (500.000): %.6f Segundos\n", algoritmo.pigeonHoleSort(colecao500k)/conversao);
        System.out.printf("Pior cenario (1.000.000): %.6f Segundos\n", algoritmo.pigeonHoleSort(colecao1kk)/conversao);
        System.out.println("===================================");
    }
    
    public void cocktailSort() {
        System.out.println("===================================");
        geraVetor.vetorCrescente(colecao1k);
        geraVetor.vetorCrescente(colecao10k);
        geraVetor.vetorCrescente(colecao500k);
        geraVetor.vetorCrescente(colecao1kk);
        System.out.printf("Melhor cenario (1.000): %.6f Segundos\n", algoritmo.cocktailSort(colecao1k)/conversao);
        System.out.printf("Melhor cenario (10.000): %.6f Segundos\n", algoritmo.cocktailSort(colecao10k)/conversao);
        System.out.printf("Melhor cenario (500.000): %.6f Segundos\n", algoritmo.cocktailSort(colecao500k)/conversao);
        System.out.printf("Melhor cenario (1.000.000): %.6f Segundos\n", algoritmo.cocktailSort(colecao1kk)/conversao);
        System.out.println("===================================");
        geraVetor.vetorAleatorio(colecao1k);
        geraVetor.vetorAleatorio(colecao10k);
        geraVetor.vetorAleatorio(colecao500k);
        geraVetor.vetorAleatorio(colecao1kk);
        System.out.printf("Cenario medio (1.000): %.6f Segundos\n", algoritmo.cocktailSort(colecao1k)/conversao);
        System.out.printf("Cenario medio (10.000): %.6f Segundos\n", algoritmo.cocktailSort(colecao10k)/conversao);
        System.out.printf("Cenario medio (500.000): %.6f Segundos\n", algoritmo.cocktailSort(colecao500k)/conversao);
        System.out.printf("Cenario medio (1.000.000): %.6f Segundos\n", algoritmo.cocktailSort(colecao1kk)/conversao);
        System.out.println("===================================");
        geraVetor.vetorDecrescente(colecao1k);
        geraVetor.vetorDecrescente(colecao10k);
        geraVetor.vetorDecrescente(colecao500k);
        geraVetor.vetorDecrescente(colecao1kk);
        System.out.printf("Pior cenario (1.000): %.6f Segundos\n", algoritmo.cocktailSort(colecao1k)/conversao);
        System.out.printf("Pior cenario (10.000): %.6f Segundos\n", algoritmo.cocktailSort(colecao10k)/conversao);
        System.out.printf("Pior cenario (500.000): %.6f Segundos\n", algoritmo.cocktailSort(colecao500k)/conversao);
        System.out.printf("Pior cenario (1.000.000): %.6f Segundos\n", algoritmo.cocktailSort(colecao1kk)/conversao);
        System.out.println("===================================");
    }
}
