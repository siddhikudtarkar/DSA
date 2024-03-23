package DSA;
public class MergeSort {
    public static void conquer(int[] arr, int l, int r, int mid) {
        int merged[] = new int[r - l + 1];
        int idx1 = l;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= r) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= r) {
            merged[x++] = arr[idx2++];
        }
        for (int i = 0, j = l; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }

        int mid = l + (r - l) / 2;
        divide(arr, l, mid);
        divide(arr, mid + 1, r);
        conquer(arr, l, r, mid);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 9, 8, 7 };

        System.out.println("Before Sorting");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();

        divide(arr, 0, arr.length - 1);

        System.out.println("After Sorting");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
