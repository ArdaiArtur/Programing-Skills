package Day3;

import java.util.HashMap;

public class FindNearestPointThatHasTheSameXAndYCoordinate {
    public int nearestValidPoint(int x, int y, int[][] points) {
      int small=1000;
    
 HashMap<Point,Integer> hm=new HashMap<>();

        Point a=new Point(x, y);
        for (int[] is : points) {
            Point b=new Point(is[0], is[1]);
            if(small>manhatten(a, b))
            {
                small=manhatten(a, b);
            }
            hm.put(b, manhatten(a, b));
        }
        for (var ss:hm.entrySet()) {
            if(ss.getValue()!=small)
            hm.remove(ss.getKey());
        }
        return hm.size();
    }

    public int manhatten(Point a,Point b)
    {
        var x=Math.abs(a.X-b.X);
        var y=Math.abs(a.Y-b.Y);

        return x+y;


    }
}


