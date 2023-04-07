package transportation;

public abstract class air_vehicles extends transport {
    private information info;
    public air_vehicles(String n1, float km, int sits1, float speed, information info1){
        super(n1, km, sits1, speed);
        info = info1;
    }
    public information getInformation(){
        return info;
    }
    public void setInformation(information info1){
        info = info1;
    }

    @Override
    public boolean equals(Object obj) {
         if (!super.equals(obj))
             return false;
        if (!(obj instanceof air_vehicles))
            return false;
        air_vehicles temp = (air_vehicles) obj;
         return info == temp.info;
    }

    public String toString(){
        return super.toString()+ "this is an "+info+" vehicle";
    }

}
