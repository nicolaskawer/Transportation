package transportation;

public abstract class air_vehicles extends transport {
    private String information;// think it has to be enum
    public air_vehicles(String n1, float km, int sits1, float speed, String info){
        super(n1, km, sits1, speed);
        information = info;
    }
    public String getInformation(){
        return information;
    }
    public void setInformation(String info){
        information = info;
    }

    @Override
    public boolean equals(transport obj) {
         if (!super.equals(obj))
             return false;
         return information == obj.information;
    }

    public String toString(){
        return super.toString()+ "this is an "+information+" vehicle";
    }

}
