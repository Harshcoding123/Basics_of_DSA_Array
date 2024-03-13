import java.util.*;
public class Main {

    public static void taking_input(int a[]){

        Scanner sc= new Scanner(System.in);

        for(int i=0;i<a.length;i++){
            a[i] =sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        Arrays.sort(a);





    }
    public static int sum(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age[]= new int[5]; //continuous memory allocate

        age[0]= 25;
        age[1] =10;
        age[2] =18;
        age[3] =20;
        age[4] =22;
        int []age2 ={23,22,13,18};
//        System.out.println(age[0]);
//        System.out.println(age[3]);
//        System.out.println(age2[3]);
//        for(int i=0;i<age.length;i++){
//            System.out.println(age[i]);
//        }
        //2d array;
        int a[][]= new int [4][3];
        a[0][0]=12;
        a[0][1]= 23;
        a[0][2] =22;
        a[1][0]= 33;
        a[1][1] =18;
        a[1][2]= 18;
        a[2][0]= 20;
//        for(int i=0;i<a.length;i++){
//            for(int j=0;j<a[i].length;j++){
//                System.out.print(a[i][j]+" ");
//            }
//        }
        //QUESTION
        int ar[] =new int[5];
        ar[0]= 2;
        ar[1]=3;
        ar[2] =5;
        ar[3] =7;
        ar[4]= 10;
//        System.out.println(sum(ar));
//        int a =Integer.MIN_VALUE;
        int arr[]= new int[5];

        taking_input(arr);










    }
}