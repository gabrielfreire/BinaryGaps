import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by Zelda on 21/03/2017.
 */
public class BinaryGaps {
    public static void main(String[] args) {
        System.out.println("Gap is: " + solution(1041));
    }
    public static int solution(int N){
        String n = Integer.toBinaryString(N);
        int count = 0;
        int result = 0;
        SortedSet<Integer> listOfGaps = new TreeSet<Integer>();
        boolean isGap = false;
        String[] nArr = n.split("");
        for(String i : nArr){
            if(i.equals("1") && count <= 0){
                isGap = true;
                continue;
            }
            if(isGap){
                if(i.equals("0")){
                    count++;
                }else if(i.equals("1")){
                    listOfGaps.add(count);
                    count = 0;
                }else{
                    return 0;
                }
            }
        }
        if(listOfGaps.size() > 0){
            result = listOfGaps.last();
        }
        return result;
    }
}
