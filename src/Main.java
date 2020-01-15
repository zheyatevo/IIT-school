import java.util.Scanner;
public class Main {
    public static void main(String[] argv){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int [n];
        int f = 0;
        int v = 437;
        int t =0;
        if (f == 0){}
        for(int i=0;i<n;i++){
            a[i]= in.nextInt();}
        for(int i=0;i<n;i++){
            if (a[i]<=v) { f = 1;} }
        for(int i=0;i<n;i++){
            if (a[i]<=v) { t = i;break;} }
        switch(f){
            case 1 :
                System.out.print("Crash " + (t+1));
                break;
            case 0:
                System.out.print("No crash");
        }
    }
}