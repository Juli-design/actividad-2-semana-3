
public class suma_arreglo {
    public static void main(String[] args) {
        //definir suma, numeros del arreglo
        int sum=0; 
        int[] n={5,10,15,20,25};
        for (int i=0; i<n.length;i++){
            //sumar numeros del arreglo
            sum=sum+n[i];
        }
        //imprimir la suma del arreglo
        System.out.println("La suma del arreglo es "+sum);
        
    }
}
