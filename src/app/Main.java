package app;

public class Main {

    public static void main(String[] args) {

        DataProvider provider = new DataProvider();
        DataHandler dataHandler = new DataHandler();

        // Processing an array of data on product names
        String namesOutput = dataHandler.handleData(provider.getProductNames());
        getOutput("Products: " + namesOutput);

        // Compilation of an array of data about sales amounts
        String salesOutput = dataHandler.handleData(provider.getSalesAmounts());
        getOutput("Sales, EUR: " + salesOutput);
    }

    // Viewing the results of the robotic program
    private static void getOutput(String output) {
        System.out.println(output);
    }
}