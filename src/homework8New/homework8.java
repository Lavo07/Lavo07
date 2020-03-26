package das;
public class homework8 {
    public static void main(String[] args) {
        Person A = new Person();
        Person B = new Person();
        Person C = new Person();

        Person.printdata();

        A.SendMoney('B',7460);
        B.SendMoney2('C',1980);
        C.SendMoney2('A' , 6400);

        Person.Max();
    }
}
