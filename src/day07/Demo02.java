package day07;

public class Demo02 {
    public static void main(String[] args) {
        int   arr[]={-90,100,23,56,89,56};
       /* int  sum=arr[0]+arr[1]+arr[2];*/

        int  sum=0;//求和
        //数组的遍历
        for (int i = 0; i <arr.length ; i++) {
               sum+=arr[i];
        }
        System.out.println("arr数组元素的和是："+sum);
        //求最大值
        int   max=arr[0];
        int   min=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }

            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
