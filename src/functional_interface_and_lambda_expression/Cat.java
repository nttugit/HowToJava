package functional_interface_and_lambda_expression;

public class Cat implements IAnimalSpeak,IAnimalSing {
    @Override
    public void speak() {
        System.out.println("Meo meo");
    }
    public void sing(){
        System.out.println("meo meo meo meo meo meo meo meo meo meo meo");
    }
}
