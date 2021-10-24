
class Solution {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int largest[] = new int[2];
        int smallest[] = new int[2];
        boolean taken[] = new boolean[arr.length];

        // finding largest
        for (int j = 0; j < 2; j++) {
            int max = 0, id = 0;
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i] && !taken[i]) {
                    max = arr[i];
                    id = i;
                }
            }
            taken[id] = true;
            largest[j] = max;
        }

        // initillizing taken to false
        for (int i = 0; i < taken.length; i++)
            taken[i] = false;

        // finding smallest
        for (int j = 0; j < 2; j++) {
            int min = Integer.MAX_VALUE, id = 0;
            for (int i = 0; i < arr.length; i++) {
                if (min > arr[i] && !taken[i]) {
                    min = arr[i];
                    id = i;
                }
            }
            taken[id] = true;
            smallest[j] = min;
        }

        System.out.println("Largest: " + largest[0] + ", " + largest[1]);
        System.out.println("Smallest: " + smallest[0] + ", " + smallest[1]);
    }
}
