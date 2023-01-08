package com.emard.java15.sealed;

public final class FiveSeries extends BmwSeries {
    public int start(){
        record PickupData(int pickupTime){}
        return  new PickupData(10).pickupTime;
    }
}
