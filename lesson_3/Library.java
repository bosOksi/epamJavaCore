public class Library {

    private InputData inputData;
    private OutputData outputData;

    public Library(InputData inputData) {
        this.inputData = inputData;
    }

    public void printResult() {
        outputData = new OutputData();
        outputData.printOutput();
    }


    public static void main(String[] args) {

    }
}
