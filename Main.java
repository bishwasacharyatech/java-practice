class EncapsulationA_test {
    private int data;
    private String info;
    private double value;   
    private boolean status;
    private char symbol;

    // Getters and Setters
    public int getData() { return data; }
    public void setData(int data) { this.data = data; }

    public String getInfo() { return info; }
    public void setInfo(String info) { this.info = info; }

    public double getValue() { return value; }
    public void setValue(double value) { this.value = value; }

    public boolean isStatus() { return status; } // Note: 'is' is used for booleans
    public void setStatus(boolean status) { this.status = status; }

    public char getSymbol() { return symbol; }
    public void setSymbol(char symbol) { this.symbol = symbol; }
}

public class Main { // Added class name 'Main'
    public static void main(String[] args) {
        // Corrected the object name to match the class name exactly
        EncapsulationA_test obj = new EncapsulationA_test();

        // Setting values
        obj.setData(42);
        obj.setInfo("Encapsulation Example");
        obj.setValue(99.99);
        obj.setStatus(true);
        obj.setSymbol('E');

        // Printing values
        System.out.println("Data: " + obj.getData());
        System.out.println("Info: " + obj.getInfo());
        System.out.println("Value: " + obj.getValue());
        System.out.println("Status: " + obj.isStatus());
        System.out.println("Symbol: " + obj.getSymbol());
    }
}