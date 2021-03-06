package com.javaSort;

public class ChoiceSort {  //选择排序
    public static void main(String[] args) {  
         Integer[] list={49,38,65,97,76,13,27,14,10}; 
         System.out.print("排序前：");
         for(int i=0;i<list.length;i++){  
             System.out.print(list[i]+" ");  
         } 
         System.out.println();
         ChoiceSort._choiceSort(list);  
         System.out.print("排序后：");
         for(int i=0;i<list.length;i++){  
             System.out.print(list[i]+" ");  
         }  
         System.out.println();  
    }  
    
    public static void _choiceSort(Integer[] a) { 
    	System.out.println("选择排序过程：");
        if (a == null || a.length <= 0) {  
            return;  
        }  
        for (int i = 0; i < a.length; i++) {  
            int min = i; /* 将当前下标定义为最小值下标 */  
  
            for (int j = i + 1; j < a.length; j++) {  
                if (a[min] > a[j]) { /* 如果有小于当前最小值的关键字 */  
                    min = j; /* 将此关键字的下标赋值给min */  
                }  
            }  
            if (i != min) {/* 若min不等于i，说明找到最小值，交换 */  
                int tmp = a[min];  
                a[min] = a[i];  
                a[i] = tmp;  
            } 
            for(int k=0;k<a.length;k++){  
                System.out.print(a[k]+" ");  
            } 
            System.out.println();
        }  
    }  
}  
