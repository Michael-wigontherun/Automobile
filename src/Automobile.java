public class Automobile {
    private int iDNum;
    private String make;
    private String model;
    private String color;
    private int year;
    private double mPG;
    
    public Automobile(int iDNum, String make, String model,  String color, int year, double mPG) {
        setIDNum(iDNum);
        setMake(make);
        setModel(model);
        setColor(color);
        setYear(year);
        setMPG(mPG);
    }
    
    public void setIDNum(int id){
        iDNum = id;
        if(iDNum < 0 || iDNum > 9999){
            iDNum = 0;
        }
    }
    public void setMake(String m){
        make = m;
    }
    public void setModel(String m){
        model = m;
    }
    public void setColor(String c){
        color = c;
    }
    public void setYear(int y){
        year = y;
        if(year < 2000 || year > 2017){
            year = 0;
        }
    }
    public void setMPG(double mpg){
        mPG = mpg;
        if(mPG < 10 || mPG > 60){
            mPG = 0;
        }
    }
    public int getIDNum(){
        return iDNum;
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getYear(){
        return year;
    }
    public double getMPG(){
        return mPG;
    }

    @Override
    public String toString() {
        return iDNum + " " + make + " " + model + " " + color + " " + year + " " + mPG;
    }


    
    
    
    
}
