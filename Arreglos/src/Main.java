public class Main {
    public static void main(String[] args) {

        int lista[]= {10, 9, -8, 2, 3, 3, 100};

        //for(int i=lista.length-1;i>=0;i--){
        //   System.out.println(lista[i]);
        //}

        //Calcular el Mayor
        int nMayor = lista[0];
        for (int i=1;i< lista.length;i++){
            if (lista[i] > nMayor) {
                 nMayor = lista[i];
            }
        }
        System.out.println(nMayor);
    }
}
