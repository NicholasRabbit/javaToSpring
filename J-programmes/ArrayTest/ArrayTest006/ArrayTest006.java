public class ArrayTest006 {
    public static void main(String[] args){
         arrayMethod();

    }

    public static void arrayMethod(){



        //��ά���飬���ڲ�û����Ԫ����һ�����飬ע�������������š�
        int[][]  array1 = {
                {11,12,13,14,15},
                {21,22,23},
                {31,32,33,34,35,36},
                {41,42,43,44,45,46},
                {51,52,53,54,55}
        };

        //��ȡ�����е�Ԫ�أ�
        int[] a=array1[0];
        int b=a[0];
        System.out.println(b);
        
		//����ļ��д��:
        System.out.println(array1[0][0]);

        System.out.println("��ά���鳤��:"+array1.length);

        for(int i=0;i<array1.length;i++){
            System.out.println("��"+i+"����ά�����Ԫ�صĳ��ȣ�"+array1[i].length);
            //������ά���飺
            for (int j = 0; j <array1[i].length ; j++) {
                System.out.print(array1[i][j]+"  ");
            }
            System.out.print('\n');    //ÿ��Ԫ��һά���������󣬻��С�
        }




    }

}