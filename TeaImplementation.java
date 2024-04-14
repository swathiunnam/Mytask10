package oops;
class Tea{


    public String teaName;

    public Tea(String name){
        this.teaName = name;
    }
    public String getName(){
        return teaName;
    }

    public void prepareTea(){
        System.out.println("Preparing the Tea " +teaName);
    }
    public void addMilk(){
        System.out.println("Adding milk to basic tea  " +teaName); 
    }
    public void addSugar(){
    System.out.println("Adding sugar to basic tea the Tea " +teaName);
    }

}

class BlackTea extends Tea{

    public BlackTea(String name) {
        super(name);
    }
    @Override
    public void prepareTea(){
        System.out.println("Preparing the BlackTea " +teaName);
    }
}

class GreenTea extends Tea{

    public GreenTea(String name) {
        super(name);
    }
    @Override
    public void prepareTea(){
        System.out.println("Preparing the GreenTea " +teaName);
    }
   

}


public class TeaImplementation {

    public static void main(String [] arg){
        Tea [] teas = new Tea[3];
        teas[0] = new Tea("Normal Tea");
        teas[1] = new BlackTea("Black Tea");
        teas[2] = new GreenTea("Green Tea");

        System.out.println(teas[0].getName());
        System.out.println(teas[1].getName());
        System.out.println(teas[2].getName());

        teas[0].prepareTea();
        teas[1].prepareTea();
        teas[2].prepareTea();
        
    }
    
}


    

