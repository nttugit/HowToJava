package vector;

import java.util.List;
import java.util.Vector;
/*
    Không khuyến khích dùng Vector, thay vào đó dùng ArrayList
    - Vì Vector is synchronized (mọi hàm chạy đồng bộ)
        -> an toàn trong môi trường đa luong, nhưng hiệu suất kém
    - vector tự động tăng kích thước - > ảnh hưởng đến hiệu suất, việc này ArrayList tốt hơn
    - ArrayList có API phong phú hơn (addAll(), removeAll(), ...), nhưng mà sao mình thấy Vector vẫn có ta?


 */
public class VectorMain {
    public static void main(String[] args) {
        Person p1 = new Person(1);
        Person p2 = new Person(2);

        List<Person> personList = new Vector<>();
        personList.add(p1);
        personList.add(p2);
        personList.remove(0);
        System.out.println("List: ");
        for(Person p: personList){
            System.out.println(p);
        }
        personList.clear();
        System.out.println("List: ");

        for(Person p: personList){
            System.out.println(p);
        }
    }
}
