public class Playground {
    
    public static void main(String[] args) {
        
        Calculator calculator = new Calculator("casio", "purple");
        
        
        System.out.println("Calculator is a " + calculator.getBrand() + ", of color " + calculator.getColour() + ".");
        
        Calculator calculator1 = new Calculator("casio", "yellow");
        
        System.out.println("Calculator One is " + calculator1.getBrand() + ", of color " + calculator1.getColour());
        
/*        int result = calculator.add(4, 7);
        int result1 = calculator1.add(10, 9);
        
        System.out.println(result);
        System.out.println(result1);
        
        int result2 = calculator.add(result, calculator.add(3, 5));
        
        System.out.println(result2);
        
        calculator.add(5.6f, 4.9f);*/
        
        calculator1.setColour("hot pink");
        System.out.println("colour is now: " + calculator1.getColour());
        
        calculator1.setBrand("Knock off");
        
    }
    
}
