package tutorials.basic;

public class Arrays {
    public static void main(String[] args) {
        int x;
        int[] myArray;
        myArray = new int[4];
        myArray[0] = 5;
        myArray[1] = 3;
        myArray[2] = 0;
        myArray[3] = 1;

        //for (int i = 0; i < myArray.length; i++) {
          //  System.out.println(myArray[i]);
        //}

        for(int number : myArray) {
            System.out.println(number);
        }

        int[] anotherArray = new int[50000];
        for (int i = 0; i < anotherArray.length; i++) {
            anotherArray[i] = i;
        }
        System.out.println(anotherArray[49999]);

        int[] newArray = new int[] {5, 3, 0, 1};
        for (int number : newArray) {
            System.out.println(number);
            }
}}
