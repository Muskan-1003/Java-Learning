public class RBS {
    public static void main(String[] args) {

    }
    public static int search(int[] a, int target){
        int start=0,end=a.length-1,mid=0;
        while(start<=end){
            mid=start+(start+end)/2;
            if(target==a[mid]){
                return mid;
            } else if (a[start]<=a[mid]) {
                if(target>=a[start] && target<mid){
                    end=mid-1;

                }else{
                    start=mid+1;
                }
                
            }
            else{
                if(target>a[mid]&& target<=a[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
