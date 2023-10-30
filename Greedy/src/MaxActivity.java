import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MaxActivity {
    public static void main(String[] args) {
        int[] start={ 1,3,0,5,8,5};
        int[] end={ 2,4,6,7,9,9};//here alreary it is sorted by end time
        //what if not sorted
        //then
        //sorting
        int activities[][]=new int [start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][3]=end[i];
        }

        //lambda function
        Arrays.sort(activities, Comparator.comparingDouble(o->o[2]));
 //code when end is already sorted
//        int maxAct=1;
//        ArrayList<Integer> ans=new ArrayList<>();
//        // first activity
//        ans.add(0);
//        int lastEnd =end[0];
//        for (int i = 1; i < end.length; i++) {
//          if(start[i]>=lastEnd){
//              maxAct++;
//              ans.add(i);
//              lastEnd=end[i];
//          }
//        }
        int maxAct=1;
        ArrayList<Integer> ans=new ArrayList<>();
        // first activity
        ans.add(activities [0][0]);
        int lastEnd =activities [0][2];
        for (int i = 1; i < end.length; i++) {
          if(activities [i][1]>=lastEnd){
              maxAct++;
              ans.add(activities [i][0]);
              lastEnd=activities [i][2];
          }
        }
        System.out.println("max activities" + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i));
        }
        System.out.println();
    }
}
