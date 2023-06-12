package functional_interface_and_lambda_expression;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//
//        // Cach 1 (Consumer)
//        System.out.println("Su dung Consumer truc tiep");
//        numbers.forEach((n) -> {
//            { System.out.println(n);}
//        });
//
//        // Cach 2
//        System.out.println("Dat ten bien cho Consumer");
//        Consumer printNumberConsumer = (n) -> { System.out.println(n);};
//        numbers.forEach(printNumberConsumer);
//
//        System.out.println("Rut gon expression voi println");
//        Consumer printNumberConsumer2  = System.out::println;
//        numbers.forEach(printNumberConsumer2);
//
//        // Cach 3
//        System.out.println("accept method");
//        printNumberConsumer2.accept(numbers);

//        FUNCTIONAL INTERFACE
        // Triển khai thông qua Class
        Cat myCat = new Cat();
        myCat.speak();
        myCat.sing();
        // Ket hop voi lambda expression (khong can tao class Dog)
        IAnimalSpeak myDog = () -> {
            System.out.println("gau gau");
        };
        IAnimalSpeak myDog2 = () -> System.out.println("gau gau 2");

        myDog.speak();
        myDog2.speak();

        IStringFunction exclaim = (s) -> s + " !!!";
        IStringFunction as = (s) -> s + " ???";

        String exclaimStr = exclaim.run("Hello World");
        String asStr = as.run("Who are you");
        System.out.println(exclaimStr);
        System.out.println(asStr);

        // calculate BMI (weight / (height^2))
        IBMICalculator calculateBMI = (weight, height) -> {
            return (weight / (height * height));
        };
        double myBMI = calculateBMI.calculate(75, 1.72);
        System.out.println("My BMI: " + myBMI);


    }
}
