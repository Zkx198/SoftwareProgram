package calculator;
//ÕÅ¿­öÎ 2017111478
public class PluralComputingDetail{

    public  double real;
    public double imaginary;

    public  PluralComputingDetail(){

    }
    public PluralComputingDetail(String str){
        int  x ;String y;
        String real = null, unreal = null;
        if(str.contains("i"))
        {
        x = str.indexOf("i");

        int x1 = str.substring(0, x).indexOf("+");
        int y1 = str.substring(0, x).indexOf("-");
        int x2=str.substring(x, str.length()).indexOf("+");
        int y2=str.substring(x, str.length()).indexOf("-");

        if(!str.substring(0, x).contains("+")&&!str.substring(0, x).contains("-")){
            if(str.substring(0,x+1)=="i")
        	{
        		unreal = "1";
        	}
        	else
        		unreal = str.substring(0, x);
            real = str.substring(x+1, str.length());
        }
        if(str.substring(0, x).contains("+")&&!str.substring(0, x).contains("-")){
        	if(str.substring(x1+1,x)=="i")
        	{
        		unreal = "1";
        	}
        	else 
        		unreal = str.substring(x1+1, x);
            real = str.substring(0, x1);
            }
        if(str.substring(0, x).contains("+")&&str.substring(0, x).contains("-")){
        	if(str.substring(x1+1,x)=="i")
        	{
        		unreal = "1";
        	}
        	else
        	    unreal = str.substring(x1+1, x);
            real = str.substring(0, x1);
            }

        if(!str.substring(0, x).contains("+") && str.substring(0, x).contains("-")){
        	if(str.substring(y1+1,x)=="i")
        	{
        		unreal = "1";
        	}
        	else
        		unreal = str.substring(y1,x);

            if(str.substring(x, str.length()).contains("+"))
                real = str.substring(x2+1, str.length());

            else if(str.substring(x, str.length()).contains("-"))
                real = str.substring(y2, str.length());

            else  
                real=str.substring(0,y1);
            }

        this.real = Double.parseDouble(real);
        this.imaginary = Double.parseDouble(unreal);
        }
       }
    public  PluralComputingDetail(double a,double b){

        real=a;
        imaginary=b;
    }
    public double getReal(){
        return real;
    }

    public double getImaginary(){
        return imaginary;
    }
    public void setReal(double mReal){
        real=mReal;
    }
    public void setImaginary(int mImaginary){
        imaginary=mImaginary;
    }

    public static PluralComputingDetail Plus(PluralComputingDetail X,PluralComputingDetail Y){
        PluralComputingDetail Complex=new PluralComputingDetail();
        Complex.real=X.real+Y.real;
        Complex.imaginary=X.imaginary+Y.imaginary;
        return Complex;
     }

    public static PluralComputingDetail Mins(PluralComputingDetail X,PluralComputingDetail Y){
        PluralComputingDetail Complex=new PluralComputingDetail();
        Complex.real=X.real-Y.real;
        Complex.imaginary=X.imaginary-Y.imaginary;
        return Complex;
    }
    public static PluralComputingDetail Multi(PluralComputingDetail X,PluralComputingDetail Y){
        PluralComputingDetail Complex=new PluralComputingDetail();
        Complex.real=X.real*Y.real-X.imaginary*Y.imaginary;
        Complex.imaginary=X.imaginary+Y.imaginary;
        return Complex;
    }
    public static PluralComputingDetail Div(PluralComputingDetail X,PluralComputingDetail Y){
        PluralComputingDetail Complex=new PluralComputingDetail();
        Complex.real=(X.real*Y.real+X.imaginary*Y.imaginary)/(Y.real*Y.real+Y.imaginary*Y.imaginary);
        Complex.imaginary=(-X.real*Y.imaginary+X.imaginary*Y.real)/(Y.real*Y.real+Y.imaginary*Y.imaginary);

        return Complex;
    }
    public String toString(){

        return (real+(imaginary<0 ? "-"+imaginary*(-1) : "+"+imaginary )+"i");
    }
}
