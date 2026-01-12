public class FrequencyCount {
    public static void main(String[] args) {

        int[] arr = {2, 3, 2, 5, 3, 2, 5};
        boolean[] visited = new boolean[arr.length];

        System.out.println("Element  Frequency");

        for (int i = 0; i < arr.length; i++) {

            if (visited[i])
                continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + "        " + count);
        }
    }
}