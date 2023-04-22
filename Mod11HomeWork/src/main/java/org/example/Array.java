package org.example;

public class Array {
    static String[] array = new String[]{"1,2,0","4,5","10,45,55"};

    public static String arraySort(String[] array){
        StringBuilder result = new StringBuilder();
        StringBuilder result1 = new StringBuilder();
        for (String s : array) {
            result.append(s).append(",");
        }
        String[] arrayBuffer = result.toString().split(",");
        int[] arrayBuffer1 = new int[arrayBuffer.length];
        for (int i = 0; i < arrayBuffer.length; i++) {
            arrayBuffer1[i] = Integer.parseInt(arrayBuffer[i]);
        }
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i <arrayBuffer1.length-1; i++) {
                if(arrayBuffer1[i] > arrayBuffer1[i+1]){
                    isSorted = false;

                    buf = arrayBuffer1[i];
                    arrayBuffer1[i] = arrayBuffer1[i+1];
                    arrayBuffer1[i+1] = buf;
                }
            }
        }
        for (int i = 0; i <arrayBuffer1.length ; i++) {
            if(i==arrayBuffer1.length-1){
                result1.append(arrayBuffer1[i]);
            }else{
            result1.append(arrayBuffer1[i]).append(", ");
            }
        }
        return result1.toString();
    }


    public static void main(String[] args) {
        System.out.println((arraySort(array)));
    }
}
