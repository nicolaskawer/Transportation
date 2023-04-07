package transportation;

public abstract class marine_vehicle extends  transport{
    private boolean selling_direction;
    private String flag;
    public marine_vehicle(String n1, float km, int sits1, float speed, boolean directon, String flag1){
        super(n1, km, sits1, speed);
        flag = flag1;
        selling_direction = directon;
    }
    @Override
    public boolean equals(Object obj) {
         if(!super.equals(obj))
             return false;
        if (!(obj instanceof marine_vehicle))
            return false;
        marine_vehicle temp = (marine_vehicle) obj;
         return temp.flag == flag&& temp.selling_direction;
    }
    public String toString(){

        if (selling_direction)
            return super.toString()+". Under "+flag+" flag, with the wind";
        return super.toString()+". Under "+flag+" flag, against the wind";
    }
    public String getFlag(){
        return flag;
    }
    public void setFlag(String flag1){
        flag = flag1;
    }
    public boolean getSelling_direction(){
        return selling_direction;
    }
    public void setSelling_direction(boolean direct){
        selling_direction = direct;
    }

}
