package cn.cq.springboot.controller;

public class A {
    public static int binarySearch(int a[],int left,int right) {
        int middle = 0;
        while (left <= right) {
            middle = (left + right) / 2;
            if (middle == a[middle]) {
                return middle;
            }
            if (middle > a[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return middle;
    }
    public static void main(String[] args){
        int[] a ={-1,1,3,4,5};
        System.out.println(binarySearch(a,0,4));
    }
}
