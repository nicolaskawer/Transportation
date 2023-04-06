package transportation;

public abstract class  lend_vehicle extends  transport{
    private int wheels;
    private String path; //maybe will do it as an enum

    public lend_vehicle(String n1, float km, int sits1, float speed, String path1, int wheels1){
        super(n1, km, sits1, speed);
        wheels = wheels1;
        path = path1;
    }
    public int getWheels(){
        return wheels;
    }
    public String getPath(){
        return path;
    }

    @Override
    public boolean equals(transport obj) {
         if(!super.equals(obj))
             return false;
         return obj.path == path && obj.wheels== wheels;
    }

    public String toString(){
        return super.toString()+"number of wheels: "+wheels+", can drive on: "+path;
    }
}
