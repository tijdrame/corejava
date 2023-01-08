public class ElectricityBill {
    private int meterNo;
    private String name;
    private String address;

    public ElectricityBill() {
    }

    
    public int getMeterNo() {
        return this.meterNo;
    }

    public void setMeterNo(int meterNo) {
        this.meterNo = meterNo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ElectricityBill)) {
            return false;
        }
        ElectricityBill electricityBill = (ElectricityBill) o;
        return meterNo == electricityBill.meterNo;
    }

    @Override
    public int hashCode() {
        return meterNo;
    }

    @Override
    public String toString() {
        return "{" +
            " meterNo='" + getMeterNo() + "'" +
            ", name='" + getName() + "'" +
            ", address='" + getAddress() + "'" +
            "}";
    }

}
