package das;
public class Person {
    char OtherPerson ;
    int Amount ;

    static void printdata() {
        String name = "Jon";
        int balance = 100;
        String company = "Java";
        System.out.println("Person name is : " + name);
        System.out.println("Person balance is : " + balance);
        System.out.println("Person company is : " + company);
       Company.CompanyA();
       Company.CompanyB();
    }
    public static void SendMoney(char OtherPerson, int Amount) {
        System.out.println(Amount + "$ " + 'A' + " to "  + 'B');
    }
    public static void SendMoney2(char OtherPerson, int Amount) {
        System.out.println(Amount + "$ " + 'B' + " to "  + 'C');
        System.out.println(Amount + "$ " + 'C' + " to "  + 'A');
    }
        static void Max(){
        int[] Company1 = new int[]{470 , 512 , 721 , 644};
        int[] Company2 = new int[]{646 , 841 , 757 , 352};
        int max1 = Company1[0];
         for (int i = 0; i < Company1.length; i++) {
            if(Company1[i]>max1){
                max1 = Company1[i]; }
             }
            System.out.println("Company1 max: "+max1);
         int max2 = Company2[0];
         for (int i = 0; i < Company2.length; i++) {
             if(Company2[i]>max2){
                 max2 = Company2[i]; }
            }
            System.out.println("Company2 max: "+max2);
         if (max1>max2){
             System.out.println("Biggest - "+max1); }
             else {
                 System.out.println("Biggest - "+max2);
                 }
             }
         }




