package transportation;

public abstract class  lend_vehicle extends  transport{
    private int wheels;
    private Path path;

    public lend_vehicle(String n1, float km, int sits1, float speed, Path path1, int wheels1){
        super(n1, km, sits1, speed);
        wheels = wheels1;
        path = path1;
    }
    public int getWheels(){
        return wheels;
    }
    public Path getPath(){
        return path;
    }

    @Override
    public boolean equals(Object obj) {
         if(!super.equals(obj))
             return false;
        if (!(obj instanceof lend_vehicle))
            return false;
        lend_vehicle temp = (lend_vehicle) obj;
         return temp.path == path && temp.wheels== wheels;
    }

    public String toString(){
        return super.toString()+"number of wheels: "+wheels+", can drive on: "+path;
    }
}
