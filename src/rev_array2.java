public class rev_array2 {
    public static void prefixsum(int a[]){

        for(int i=1;i<a.length;i++){
            a[i] =a[i]+a[i-1];
        }

    }
    public static void suffixsum(int a[]){
        for(int i=0;i<a.length-1;i--){
            a[i]= a[i]+a[i+1];
        }
    }
    public static void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void reversek(int a[],int k){
        int n =a.length;


        k= k%n;
        for(int j=1;j<=k;j++) {
            int p = a[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                a[i + 1] = a[i];
            }
            a[0] = p;

        }


    }
    public static void main(String[] args) {
        int ar[] =new int[5];
        ar[0]= 2;
        ar[1]=3;
        ar[2] =5;
        ar[3] =7;
        ar[4]= 10;
        print(ar);
        reversek(ar,7);
        print(ar);
    }
}
