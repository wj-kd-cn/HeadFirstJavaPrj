package cn.ks.kd.animal;

public abstract class abAnimal {
    private String type;

    public void setType(String atype){
        type = atype;
    }

    public String getType(){
        return type;
    }

    public abstract void eat();
    public abstract void makeNoise();
    public abstract void walking();

}
