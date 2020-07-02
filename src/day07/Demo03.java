package day07;

public class Demo03 {
    public static void main(String[] args) {
        int   arr[]={-90,100,23,56,89,56};
        //遍历所有的元素
        for (int i = 0; i <arr.length ; i++) {
            //冒泡排序
            for (int j = 0; j <arr.length-1 ; j++) {
                 if (arr[j]>arr[j+1]){
                     int  temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                 }
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }



        for (int i = 0; i <arr.length ; i++) {
            if (23==arr[i]){
                System.out.println("arr数组中包含23数字，位置值："+i);
            }
        }
    }
}
