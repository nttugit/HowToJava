package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        NewStaff staff1 = new NewStaff(1, "John", 100d);
        NewStaff staff2 = new NewStaff(1, "Kudo", 200d);
        NewStaff staff3 = new NewStaff(1, "Shinichi", 300d);

        List<NewStaff> staffList = Arrays.asList(staff1, staff2, staff3);

        // Tạo mới Stream bằng method of
        Stream<NewStaff> s1 = Stream.of(staff1, staff2, staff3);

        // Tạo từ Collection
        Stream<NewStaff> s2 = staffList.stream();

        List<Integer> numList = Arrays.asList(2, 13, 7, 8, 4, 5);

        System.out.println("Staff list (stream): ");
        s2.forEach(item -> System.out.print(item + ", "));
        System.out.println("\nAnother way: ");
        staffList.stream().forEach(item -> System.out.print(item + ", "));
        System.out.println("\nNum list after using a series of stream methods: ");
        double myNum = numList.stream()
                .filter(e -> e % 2 == 0)
                .peek(System.out::println) // lay phan tu dung dau va print no ra
                .map(e -> Math.sqrt(e)) // sqrt(2) + sqrt(4) + sqrt(8)
                .mapToDouble(e -> e)
                .average().getAsDouble();
        System.out.println(myNum);


        // Cú pháp lambda expresionn (item -> {})
        // Tăng lương 15%
        staffList.stream().forEach(staff -> staff.setSalary(staff.getSalary() * 1.15));

        System.out.println("\nStaff list after up salary: ");
        for(NewStaff staff:staffList){
            System.out.println(staff);
        }

        // Chuyển tên sang IN HOA
        staffList.stream().forEach(staff -> {
            staff.setSalary(staff.getSalary() * 1.15);
            staff.setName(staff.getName().toUpperCase());
        });

        System.out.println("\nStaff list after up salary and uppercase their names: ");
        for(NewStaff staff:staffList){
            System.out.println(staff);
        }

        // Kết
    }


}
