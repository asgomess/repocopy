public class Calculator {
    
    //attributes
    //instance variables
    private String colour;
    private String brand;
   
    public Calculator(String colour, String brand) {
        this.colour = colour;
        this.brand = brand;
    }
/*   public Calculator() {
       brand = "casio";
       color = "red";
   }*/
    
    
    //declaring the method
    public int add(int num1, int num2) {
       int result = num1 + num2;
        
        return result;
    }
    
    public float add(float num1, float num2) {
        System.out.println("ihhiihihihihih");
        return num1 + num2;
    }
    
    public String getBrand() {
        return this.brand;
    }
    
    public String getColour() {
        return this.colour;
    }
    
    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public void setBrand(String brand) {
        if(brand.equals("Knock off")) {
            System.out.println("No knock-offs allowed!!!");
            return;
        }
        this.brand = brand;
    }
}
