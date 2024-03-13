public class array2Drev {
    public static void prefixsum2(int a[][],int r1,int l1,int r2,int l2){
        if(r1>=0&&r2<=a.length-1&&l1>=0&&l2<=a[0].length){
            System.out.println("wrong inpur");
            return;
        }
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a[i].length;j++){
                a[i][j]= a[i][j]+a[i][j-1];
            }
        }
        int sum=0;
        for(int i=r1;i<=r2;i++){
            sum+=(a[i][l2]-a[i][l1-1]);
        }
        System.out.println(sum);
    }
    public static void spiralmatrix(int n){
        int a[][]=new int[n][n];int p=1;
        int r1= 0;int r2=n-1;int c1=0;int c2=n-1;
        while(r1<=r2&&c1<=c2) {
            for (int i = c1; i <= c2; i++) {
//            System.out.print(a[r1][i]+" ");
                a[r1][i] = p++;
            }
            r1++;
            if (r1 <= r2) {
                for (int i = r1; i <= r2; i++) {
//                System.out.print(a[i][c2] + " ");
                    a[i][c2] = p++;
                }
            }
            c2--;
            if (c1 <= c2) {
                for (int i = c2; i >= c1; i--) {
//                System.out.print(a[r2][i] + " ");
                    a[r2][i] = p++;
                }
            }
            r2--;
            if (r1 <= r2) {
                for (int i = r2; i >= r1; i--) {
//                System.out.print(a[i][c1] + " ");
                    a[i][c1] = p++;
                }
            }
            c1++;
        }
        print2DArray(a);
    }
    public static void spiral_over_matrix(int a[][]) {
        int r1 = 0;
        int r2 = a.length - 1;
        int c1 = 0;
        int c2 = a[0].length - 1;
        while (r1<=r2&&c1 <= c2) {
            for (int i = c1; i <= c2; i++) {
                System.out.print(a[r1][i]+" ");
            }
            r1++;
            if(r1<=r2) {
                for (int i = r1; i <= r2; i++) {
                    System.out.print(a[i][c2] + " ");
                }
            }
            c2--;
            if(c1<=c2) {
                for (int i = c2; i >= c1; i--) {
                    System.out.print(a[r2][i] + " ");
                }
            }
            r2--;
            if(r1<=r2) {
                for (int i = r2; i >= r1; i--) {
                    System.out.print(a[i][c1] + " ");
                }
            }
            c1++;
        }
    }
    public static void pascaltriangle(int n){
        int a[][]= new int[n][];
        a[0]= new int[1];
        a[1]= new int [2];
        a[0][0]= 1;
        a[1][0]= 1;
        a[1][1]= 1;
        for(int i=2;i<n;i++){
            a[i] = new int[i+1];
            a[i][0]= 1;
            a[i][a[i].length-1]= 1;
            for(int j=1;j<a[i].length-1;j++){
                a[i][j]= a[i-1][j]+a[i-1][j-1];
            }

        }
        print2DArray(a);

    }
    public static void swap(int a[][],int i,int j){
        int temp =a[i][j];
        a[i][j]= a[j][i];
        a[j][i]= temp;
    }
    public static void transposeInPlace(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a[i].length;j++){
                swap(a,i,j);
            }
        }
        print2DArray(a);

    }
    public static void transpose(int a[][]){

        int ans[][]= new int [a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                ans[i][j]= a[j][i];
            }
        }
        print2DArray(ans);

    }

    public static void summ2darray(int a[][],int b[][]){
        if(a.length!=b.length&&a[0].length!=b[0].length){
            System.out.println("not possible");
            return;
        }
        int ans[][]= new int [a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                ans[i][j] =a[i][j]+b[i][j];
            }
        }
    }
    public static void print2DArray(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
//        int a[][]= new int [5][3];
        int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
        int ar[][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int [][]arr = {{1,1,1,1,1,1},{1,1,1,1,1,1},{1,1,1,1,1,1},{1,1,1,1,1,1},{1,1,1,1,1,1},{1,1,1,1,1,1}};
//        print2DArray(a);
//        transpose(a);
//        transposeInPlace(a);
//        pascaltriangle(6);
//        spiral_over_matrix(ar);
//        spiralmatrix(4);
        prefixsum2(arr,1,3,4,5);




    }

}
