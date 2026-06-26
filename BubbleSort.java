public class BubbleSort {

    public static void main(String [] args) {

        int arr[] = {2,5,4,8,6,9,1};
        int size = arr.length;

        System.out.println("before sorting");

        for(int i=0;i<size;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");//2 5 4 8 6 9 1
        int temp;
        for(int i=0;i<size;i++) {
            for(int j=0;j<size-i-1;j++) {

                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("after sorting");

        for(int i=0;i<size;i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
