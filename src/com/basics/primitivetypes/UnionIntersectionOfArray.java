package com.basics.primitivetypes;

import java.util.Arrays;

/*
Find A union B Sample input: int[] a={1,2,3,4}; int[] b={3,4,5,6}; Sample output: int[] c={1,2,3,4,5,6}
 */
public class UnionIntersectionOfArray {

    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int b[]={3,4,5,6};
        UnionIntersectionOfArray unionOfArray =new UnionIntersectionOfArray();
        System.out.println(unionOfArray.union(a,b));
        System.out.println(unionOfArray.intersecion(a,b));
    }


    public String union(int a[],int b[]){
        int ab;
        int l1=a.length;
        int l2=b.length;
        Integer[] newArray=new Integer[l1+l2]; //New Array to store union values
        int k=0;
        //Adding array1 value into new array
        for (int i=0;i<l1;i++){
            newArray[i]=a[i];
            k++;
        }
        //Adding array 2 value in new array if the value not present in array 1
        for(int i=0;i<l2;i++){
            boolean duplicate=false;
            for(int j=0;j<l1;j++){
                if (b[i]==a[j]){
                    duplicate =true;
                    break;
                }
            }
            if(duplicate==false){
                newArray[k]=b[i];
                k++;
            }
        }
        return Arrays.toString(newArray);

    }

    public String intersecion(int a[],int b[]){

        int l1=a.length;
        int l2=b.length;
        int l3=0;
        l3= (l1>l2) ? l1:l2;
        Integer[] c =new Integer[l3];
        int k=0;
        for (int i = 0; i < a.length; i++) {
           boolean repeated=false;
           for (int j = 0; j< b.length; j++) {
               if(a[i]==b[j]) {
                   repeated=true;
                   break;
               }

            }

           if(repeated) c[k++]=a[i];

        }

        return Arrays.toString(c);
    }
}



