package day08;

public class Demo04 {
    public static void main(String[] args) {
        //二维数组的定义方式一1
        /*
           2代表二维数组中有几个一维数组
           3一维数组中有几个元素
             特点：所有的一维数组的长度固定
         */
        int array[][]=new  int [2][3];
        int  arr1[]={23,45};
        int  arr2[]={29,56,45};
        //二维数组的定义方式二
       // int  array1[][]={arr1,arr2};
        int  array1[][]={{23,45},{29,56,45},{34,56}};
        System.out.println("二维数组的长度："+array1.length);
        //二维数组的定义方式三
        //int  array2[][]=new  int[][]{{23,45},{29,56,45}};
        System.out.println(array1[0][0]);
        System.out.println(array1[1][1]);
        array1[1][1]=34;
        //二维数组的遍历
        System.out.println("---------------------");
      /*  for (int i = 0; i <array1.length ; i++) {
              int a[]= array1[i];
            for (int j = 0; j <a.length ; j++) {
                System.out.println(a[j]);
            }
        }
*/
          for (int i = 0; i <array1.length ; i++) {
            for (int j = 0; j <array1[i].length ; j++) {
                System.out.println(array1[i][j]);
            }
        }
          /*
            {{23,45},{29,56,45},{34,56}};:求最值，求和，求平均值


           */
    }
}
