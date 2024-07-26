public class con_par_imp{
    public static void main(String[] args) {
        //definir par y impar
        int par=0, impar=0;
        //array
        int [] n= {12,26,9,14,15,7,23,10,17,41};
        for (int i=0; i<n.length;i++){
            //si los numeros son divisible por 2 es par
            if (n[i]%2==0){
                par++;
            }
            //si el nujmero no es divisible por 2 es impar
            else{
                impar++;
            }
        }//imporimir numeros pares y imparesa
         System.out.println("numeros pares: "+par);
         System.out.println("numeros impares: "+impar);
    }
}