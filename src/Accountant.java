public class Accountant extends Human implements JobTitle {
    @Override
    public void jobTitle() {
        System.out.println("Я бухгалтер ");
    }

    @Override
    public void say() {
        System.out.println("Я человек");

    }
}
