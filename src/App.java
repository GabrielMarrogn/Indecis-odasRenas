import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        List<String> renas = new ArrayList<String>();
        int a = 0;
        
        renas.add("Dasher");
        renas.add("Dancer");
        renas.add("Prancer");
        renas.add("Vixen");
        renas.add("Comet");
        renas.add("Cupid");
        renas.add("Donner");
        renas.add("Blitzen");
        renas.add("Rudolph");

        for(int i = 0; i< 9; i++){
            int bola = sc.nextInt();
            a += bola;
        }

        sc.close();
        
        while(a > 9){
            a -= 9;
        }

        System.out.println(renas.get(a-1));


    }
}
