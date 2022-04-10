public class ArrayTest006 {
    public static void main(String[] args){
         arrayMethod();

    }

    public static void arrayMethod(){



        //二维数组，其内部没单个元素是一个数组，注意有两个中括号。
        int[][]  array1 = {
                {11,12,13,14,15},
                {21,22,23},
                {31,32,33,34,35,36},
                {41,42,43,44,45,46},
                {51,52,53,54,55}
        };

        //读取数组中的元素：
        int[] a=array1[0];
        int b=a[0];
        System.out.println(b);
        
		//上面的简洁写法:
        System.out.println(array1[0][0]);

        System.out.println("二维数组长度:"+array1.length);

        for(int i=0;i<array1.length;i++){
            System.out.println("第"+i+"个二维数组的元素的长度："+array1[i].length);
            //遍历二维数组：
            for (int j = 0; j <array1[i].length ; j++) {
                System.out.print(array1[i][j]+"  ");
            }
            System.out.print('\n');    //每个元素一维数组输出完后，换行。
        }




    }

}
