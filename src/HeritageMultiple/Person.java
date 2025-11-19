package HeritageMultiple;

public class Person implements Coding,Dancing {

    @Override
    public void coding() {
        System.out.println("person is coding");
    }

    @Override
    public void dancing() {
        System.out.println("person is dancing");
    }
}
