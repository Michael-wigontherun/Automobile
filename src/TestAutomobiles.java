public class TestAutomobiles {

    public static void main(String[] args) {
        Automobile Automobile1 = new Automobile(1451, "Chevy", "Camaro", "red", 2010, 24.5);
        Automobile Automobile2 = new Automobile(145101, "Ford", "Focus", "White", 2019, 75);
        
        System.out.println("good decleration      " + Automobile1.toString());
        System.out.println("bad decleration      " + Automobile2.toString());
        
        Automobile1.setIDNum(-3);
        System.out.println("bad ID      " + Automobile1.toString());
        
        Automobile1.setIDNum(2222);
        System.out.println("good ID      " + Automobile1.toString());
        
        Automobile1.setMake("Toyota");
        Automobile1.setModel("Corolla");
        System.out.println("good ID      " + Automobile1.toString());
        
        Automobile2.setIDNum(8686);
        Automobile2.setColor("blue");
        Automobile2.setYear(2016);
        System.out.println("change ID, color, and year      " + Automobile2.toString());
        
        System.out.println("bad mpg      " + Automobile2.toString());
        
        Automobile2.setMPG(30);
        System.out.println("good mpg      " + Automobile2.toString());
    }
}
