package pack1;
public class subset {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int r = 3;
        int n = arr.length;
        generate(arr, r);
        int combination = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println("Number of combinations: " + combination);
    }

    public static int factorial(int n) {
        return (n == 0 || n == 1) ? 1 : n * factorial(n - 1);
    }

    public static void generate(int[] arr, int r) {
        int[] data = new int[r];
        generateCombinations(arr, data, 0, arr.length - 1, 0, r);
    }
    private static void generateCombinations(int[] arr, int[] data, int start, int end, int index, int r) {
        if (index == r) {
            for (int j = 0; j < r; j++) {
                System.out.print(data[j] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
            data[index] = arr[i];
            generateCombinations(arr, data, i + 1, end, index + 1, r);
        }
    }
}
