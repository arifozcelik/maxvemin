import java.util.Scanner;
public class Arraydeneme2 {
    public static void main(String[] args) {
        int[] list = {54,34,1,8,101,-2,-33};
        //min = lisy[0]
        //max = list[0]
        int max = list[0];
        int min = list[0];
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("sayi giriniz: ");
        n = input.nextInt();

        for(int i : list){
            if(i<min){
                min = i;
            }
            if(i>max){
                max = i;
            }
        }
        System.out.println("min :" +min);
        System.out.println("max :" +max);
    }
}
