import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number");
        int n = sc.nextInt();
        
        System.out.println("Divisors of " +n+ " are:");
         
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                System.out.println(i + " ");
            }
        }
        sc.close();
    }
}
