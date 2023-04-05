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
    public String toString(){
        super.toString();
        return "this is an "+information+" vehicle";
    }

}
