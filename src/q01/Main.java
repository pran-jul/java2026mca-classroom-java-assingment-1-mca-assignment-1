import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Upper part
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                system.out.print("");
            }
            for(int j=1;j<=(2*i-1); j++){
                if(j==1||j==(2*i-1)){
                    system.out.print("*");
                }else{
                    system.out.print("");
                }
            }
            system.out.println();
        }
        for(intj=1;j<=(2*i-1);j++){
            if(j==1||j=(2*i-1)){
                system.out.print("*");
            }else{
                system.out.print("");
            }
        }
        sysytem.out.println();
    }
}
}

        // TODO: Print a hollow diamond pattern of half-height n using '*'
        //
        // Rules:
        //   - Only border cells have '*', inside is spaces
        //   - No trailing spaces on any line
        //
        // Input: 4
        // Output:
        //    *
        //   * *
        //  *   *
        // *     *
        //  *   *
        //   * *
        //    *
