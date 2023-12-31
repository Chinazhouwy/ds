package sort;

public class SelectSort {


    public void sort(int[] a){
        for(int i = 0;i< a.length;i++){
            int min = i;
            for(int j = i+1;j< a.length;j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] org = new int[]{6,5,4,3,2,1};
        new SelectSort().sort(org);
        arrayToString(org);
    }

    private static void arrayToString(int[] org) {
        for (int i = 0; i < org.length; i++) {
            System.out.print(org[i]+" ");
        }
    }

}
