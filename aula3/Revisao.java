void main() {
    int[] vetor = new int[5];

    vetor[0] = 10;
    vetor[4] = 15;

    /*
    // Iniciar em 3 e ir pelos ímpares até 100
    // int[] impares = new int[100];
    // impares[0] = 3;

    // for(int i = 1; i < 100; i++){
    //    impares[i] = impares[i - 1] + 2;
    //    System.out.print(impares[i - 1] + " - "); 
    // }

    // int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if(i == j){
                System.out.print("[" + matriz[i][j] + "]");
            } else {
                System.out.print("[ ]");
            }
        }
        System.out.println();
    }
    */

    int a = -10;
    int b = Math.abs(a);
    System.out.println(b);
}