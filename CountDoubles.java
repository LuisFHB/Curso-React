package ejemplos;

public class CountDoubles {


   public static void main(String[]args) {
      /* Scanner input = new Scanner(System.in);
       do {
           int[] a = new int[5];
        System.out.println("Enter next number or A to finish to introduce numbers");
       }while(input.nextInt()!='A');
      */
       int[] a = {1,1,2,2,3,4,5,6,6,7,8,8};
                //0,1,2,3,4,5,6,7,8
       CountDoublesObj obj = new CountDoublesObj();
       int count= obj.duobles(a);
       System.out.println("The cout is: "+count);

        }
}

