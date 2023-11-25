public class RBS {
    public static void main(String[] args) {

    }

        public int search(int[] a, int target) {
            int start = 0, end = a.length - 1;
            return binarySearch(a, target, start, end);
        }

        static int binarySearch(int[] a, int target, int start, int end) {
            if (start > end) {
                return -1;
            }

            int mid = start + (end - start) / 2;

            if (target == a[mid]) {
                return mid;
            } else if (a[start] <= a[mid]) {
                if (target >= a[start] && target < a[mid]) {
                    return binarySearch(a, target, start, mid - 1);
                } else {
                    return binarySearch(a, target, mid + 1, end);
                }
            } else {
                if (target > a[mid] && target <= a[end]) {
                    return binarySearch(a, target, mid + 1, end);
                } else {
                    return binarySearch(a, target, start, mid - 1);
                }
            }
        }
    }


