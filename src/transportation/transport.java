package transportation;

public abstract class transport {
    private String name;
    private float KM;
    private int max_sits;
    private float max_speed;
    public transport(String n1, float km, int sits1, float speed)
    {
        name = n1;
        KM = km;
        max_sits = sits1;
        max_speed = speed;
    }
    public String toString()
    {
        return "Model: "+name+", traveled: " + KM + ", Max speed of"+ max_speed +" Mph, can carry max of "+ max_sits;
    }


    public boolean equals(transport obj)
    {
        if(this == obj)
            return true;
        if (name == obj.name && KM == obj.KM && max_sits == obj.max_sits && max_speed == obj.max_speed)
            return true;
        return false;

    }
    public abstract void update(float km);
    public String getName() {
        return name;
    }
    public int getMax_sits() {
        return max_sits;
    }
    public float getKM(){
        return KM;
    }
    public float getMax_speed(){
        return max_speed;
    }
    public void setKM(float km){
        KM = km;
    }
}
