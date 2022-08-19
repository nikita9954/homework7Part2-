public class Worker extends Human implements JobTitle{
    @Override
    public void say() {
        System.out.println(" Я человек");
    }

    @Override
    public void jobTitle() {
        System.out.println("Я рабочий");
    }
}
