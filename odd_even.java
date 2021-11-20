public class odd_even {
    public static void main(String[] args) {
        Even_Odd();
    }

    public static void Even_Odd(){
        System.out.println("odd numbers : ");
        for(int x = 0; x<10;x++){
            if (x%2 != 0)
                System.out.println("square of "+x+" = "+x*x);
        }

        System.out.println("even numbers : ");
        for(int x = 0; x<10;x++){
            if (x%2 == 0)
                System.out.println("square of "+x+" = "+x*x);
        }
    }
}
