package das;
public class Company {
    static void CompanyA() {
        String[] Per = new String[]{"A1" , "A2" , "A3"};
        int[] Balance = new int[]{1500 , 2000 , 2500};
        System.out.println("Company A");
        System.out.println(Per[0] + " " + Balance[0] + "$");
        System.out.println(Per[1] + " " + Balance[1] + "$");
        System.out.println(Per[2] + " " + Balance[2] + "$");
    }
    static void CompanyB() {
        String[] Per = new String[]{"B1" , "B2" , "B3"};
        int[] Pox = new int[]{8741 , 5454 , 9847};
        System.out.println("Company B");
        System.out.println(Per[0] + " " + Pox[0] + "$");
        System.out.println(Per[1] + " " + Pox[1] + "$");
        System.out.println(Per[2] + " " + Pox[2] + "$");
    }
}

