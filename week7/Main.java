public class Main {

    public static void main(String[] args) {
        // Instantiate WashingMachine
        Appliance wm = new WashingMachine("LG");
        
        // Instantiate Refrigerator
        Appliance ref = new Refrigerator("Panasonic");

        // Display Washing Machine behavior
        wm.displayBrand();
        wm.turnOn();
        wm.operate();
        wm.turnOff();

        System.out.println(); // Line break between outputs

        // Display Refrigerator behavior
        ref.displayBrand();
        ref.turnOn();
        ref.operate();
        ref.turnOff();
    }
}