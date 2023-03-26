package ejemplos;

public class Repetidos {
    public static void main(String[] args) {
        int a[] = {1,1,2,2,3,4,5,6,7};
        metodo objeto = new metodo();
        System.out.print("The array is: ");
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                System.out.print("[" + a[i]+"|");
            }
            if (i == (a.length) - 1) {
                System.out.println(a[i] + "]");
            } if( i<(a.length-1)&& i!=0) {
                System.out.print(a[i]+"|");
            }

        }

        System.out.println("Number of number in array with repeats: " + objeto.repetidos(a));
    }
}


