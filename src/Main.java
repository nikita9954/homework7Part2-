public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();
        directory.myFunction();
        directory.say();
        worker.myFunction();
        worker.say();
        accountant.myFunction();
        accountant.say();
    }
}
