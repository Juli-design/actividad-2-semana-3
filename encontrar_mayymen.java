public class encontrar_mayymen {
    public static void main(String[] args) { 
        //areglo
        int[] n={26,38,13,59,31,43,-87,8};
        int mayor=n[0];
        int menor=n[0]; 
        //ciclo for
        for (int i=0; i<n.length; i++){
            //encontrar numero menor
            if (n[i]<menor){
                menor=n[i];
            }
            //encontrar numero mayor
            if (n[i]>mayor){
                mayor=n[i];
            }
        
    }//imprimir numero menor y mayor
    System.out.println("El numero menor es " +menor+ " El numero mayor es "+mayor);
}

}