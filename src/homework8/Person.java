public class Person {

    static void printdata() {
        String name = "Jon";
        int balance = 100;
        String company = "Java";
        System.out.println("Person name is : " + name);
        System.out.println("Person balance is : " + balance);
        System.out.println("Person company is : " + company);
    }
    static void CompanyA() {
        int Ap1 = 1200;
        System.out.println("A.person 1 :" + Ap1);
        int Ap2 = 1100;
        System.out.println("A.person 2 :" + Ap2);
        int Ap3 = 1350;
        System.out.println("A.person 3 :" + Ap3);
    }
    static void CompanyB() {
        int Bp1 = 1170;
        System.out.println("B.person 1 :" + Bp1);
        int Bp2 = 1420;
        System.out.println("B.person 2 :" + Bp2);
        int Bp3 = 1740;
        System.out.println("B.person 3 :" + Bp3);
    }

    static void SendMoney() {
        int[] Amount = new int[]{50, 370, 161, 740, 974};
        String[] OtherPerson = new String[]{"A", "B"};
        for (int i = 0; i <= Amount.length; i++) {
            System.out.println(OtherPerson[0]+" "+Amount[i]+" $ to "+OtherPerson[1]);
        }
    }
    static void SendMoney2() {
        int[] Amount = new int[]{50, 370, 161, 740, 974};
        String[] OtherPerson = new String[]{"A", "B", "C" , "D"};
        for (int i = 0; i <= Amount.length; i++) {
            for (int k = 0; k <= OtherPerson.length; k++)
            System.out.println(OtherPerson[k]+" "+Amount[i]+" $ to "+OtherPerson[k+1]);
        }
    }
        static void Max(){
        int[] C1 = new int[]{470 , 512 , 721 , 644};
        int[] C2 = new int[]{646 , 841 , 757 , 352};
        int max1 = C1[0];
         for (int i = 0; i < C1.length; i++) {
            if(C1[i]>max1){
                max1 = C1[i]; }
             }
            System.out.println("C1 max: "+max1);
         int max2 = C2[0];
         for (int i = 0; i < C2.length; i++) {
             if(C2[i]>max2){
                 max2 = C2[i]; }
            }
            System.out.println("C2 max: "+max2);
         if (max1>max2){
             System.out.println("Biggest - "+max1); }
             else {
                 System.out.println("Biggest - "+max2);
                 }
             }
         }




