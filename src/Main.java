public class Main {
    public static void main(String[] args) {
        int start = 2;
        int finish = 20;
        int lenArr = (finish - start) / 2 + 1;
        int[] arr = new int[lenArr];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = start;
            start += 2;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
