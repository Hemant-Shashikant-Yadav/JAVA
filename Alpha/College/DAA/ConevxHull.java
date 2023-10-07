package College.DAA;

import java.awt.*;
import java.util.*;
import java.util.List;

public class ConevxHull {
    public static  List<int[]> convexHull1(int[][]p){
        if (p.length<3){
            return Arrays.asList(p);
        }

        Arrays.sort(p,(a, b) -> a[0] == b[0] ? a[1] - b[1] :a[0] - b[0] );

        List<int[]> up = new ArrayList<>();
        List<int[]> low = new ArrayList<>();

        for (int i=0;i<p.length;i++){
            if (up.size()>=2 && isLeftTurn(up.get(up.size()-2),up.get(up.size()-1),p)){
                up.remove(up.size() - 1);
            }
        }

    }
    public boolean isLeftTurn(int[]a,int[]b,int[]c){
        return (a[0]*[])<=0
    }
    public static void main(String[] args) {
        int[][] points
                = { { 0, 0 }, { 1, -4 }, { -1, -5 },
                { -5, -3 }, { -3, -1 }, { -1, -3 },
                { -2, -2 }, { -1, -1 }, { -2, -1 },
                { -1, 1 } };

        List<int[]> hull = convexHull1(points);
    }
}
