package Day12;

import java.util.HashMap;

public class DesignParkingSystem {
    int big;
    int medium;
    int small;
    HashMap<Integer,Integer>hashMap=new HashMap<>();
    public DesignParkingSystem(int big, int medium, int small) {
        /* this.big=big;
        this.medium=medium;
        this.small=small; */
        hashMap.put(1, big);
        hashMap.put(2, medium);
        hashMap.put(3, small);
    }
    public boolean addCar(int carType) {
    if(hashMap.get(carType)>0)
    {
        hashMap.put(carType, hashMap.get(carType)-1);
        return true;
    }
    
    return false;
    }



    public boolean addCarv1(int carType) {
        if(carType==3)
        {
            if(small>0)
            {
                small--;
                return true;
            }
            else
            return false;
        }

        if(carType==2)
        {if(medium>0)
            {
                medium--;
                return true;
            }
            else
            return false;}

        if(carType==1)
        {if(big>0)
            {
                big--;
                return true;
            }
            else
            return false;}
            return false;
        }
}
