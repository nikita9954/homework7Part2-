public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();
        directory.say();
        directory.jobTitle();
        worker.say();
        worker.jobTitle();
        accountant.say();
        accountant.jobTitle();
    }
}
