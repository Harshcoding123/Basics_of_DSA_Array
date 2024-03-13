import java.util.*;
public class rev_array {
    public static boolean pre_suff_equal(int a[]) {
        int n = a.length;
        int pre[] = new int[n];
        int suff[] = new int[n];
        pre[0] = a[0];
        suff[n - 1] = a[n - 1];
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] + a[i];
        }
        for (int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] + a[i];
        }
        for (int i = 1; i < n - 1; i++) {
            if (pre[i] == suff[i + 1]) {
                return true;
            }

        }
        return false;
    }

    public static void suffixsum(int a[]){
        for(int i=a.length-2;i>=0;i--){
            a[i]= a[i]+a[i+1];
        }
        print(a);
    }
    public static void prefixSum(int a[]){
        for(int i=1;i<a.length;i++){
            a[i] =a[i]+a[i-1];
//
        }
        print(a);

    }
    public static void prefixsum_extraarray(int a[]){
        int ans []= new int[a.length];
        ans[0] =a[0];
        for(int i=1;i<a.length;i++){
            ans[i]= a[i]+ans[i-1];
        }
        print(a);
        print(ans);
    }
    public static void sort_neg_pos_sorted_array_square(int a[],int ans[]){

        int p=0;int q=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                p =i-1;
                q =i;
                    break;
            }
        }
        int idx=0;
        while(p>=0&&q<a.length){
            if(Math.abs(a[p])<=Math.abs(a[q])){
                ans[idx++]=a[p]*a[p];
                ans[idx++] =a[q]*a[q];
            }else {
                ans[idx++] =a[q]*a[q];
                ans[idx++]= a[p]*a[p];
            }
            p--;q++;
        }
        if(p>=0){
            for(int i=0;i<=p;i++){
                ans[idx++] =a[i]*a[i];
            }

        }
        if(q<a.length){
            for(int i=q;i<a.length;i++){
                ans[idx++]= a[i]*a[i];
            }
        }

    }
  Scanner sc =new Scanner(System.in);
    public static void check_freq_med_q_Query(int a[],int q){
        Scanner sc =new Scanner(System.in);
        int freq[]= new int[1000000];
        for(int i=0;i<a.length;i++){
            freq[a[i]]++;
        }
        for(int i=1;i<=q;i++){
            int p =sc.nextInt();
            if(freq[p]>0) System.out.println("present");
            else System.out.println("absent");;
        }

    }
    public static void swap(int a[],int i,int j){
//        a= a+b;
//        b =a-b;
//        a =a-b;
        int c=0;
        c=a[i];
        a[i]=a[j];
        a[j]=c;

    }
    public static void reverse(int a[]){
        int i=0;int j=a.length-1;
        while(i<j){
            swap(a,i,j);
            i++;
            j--;
        }
    }
    public static void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
//        int a=2;int b=5;
        //swapping 1st method
//        int c=-1;
//        c=b;
//        b=a;
//        a=c;
//        System.out.println(a+" "+b);
        //swapping 2nd method
//        a =a+b;
//        b= a-b;
//        a= a-b;
//        System.out.println(a+" "+b);
//
//        Scanner sc =new Scanner(System.in);
//        int ar[] =new int[6];
//        ar[0]= -10;
//        ar[1]=-3;
//        ar[2] =-2;
//        ar[3] =1;
//        ar[4]= 4;
//        ar[5] =5;


//        print(ar);
//        reverse(ar);
//        print(ar);
//        int a=5;int b=10;
//        swap(ar,0,3);
//        System.out.println(ar[0]+" "+ar[3]);
//        System.out.println("no of query");
//        check_freq_med_q_Query(ar,sc.nextInt());
//        int ans[]= new int [ar.length];
//        sort_neg_pos_sorted_array_square(ar,ans);
//        print(ar);
//        print(ans);
//        prefixsum_extraarray(a);
//        prefixSum(a);
//        prefixSum(a);
//        int a1[]= {5,3,2,-6,3,1};
//        suffixsum(a1);
        int a[]= {5,3,2,20,3,1};
        System.out.println(pre_suff_equal(a));




    }
}
