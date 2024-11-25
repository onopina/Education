package presentation.multithreading;

public class Train {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread threadProduce = new Thread(printer::produce);
        Thread threadA = new Thread(printer::consumeA);
        Thread threadB = new Thread(printer::consumeB);

        threadProduce.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        threadA.start();
        threadB.start();




//        Thread threadA = new Thread(() -> printer.printA(letter));
//        Thread threadB = new Thread(() -> printer.printB(letter));
//        Thread threadC = new Thread(() -> printer.printC(letter));

//        threadA.start();
//        threadB.start();
//        threadC.start();





    }



}

