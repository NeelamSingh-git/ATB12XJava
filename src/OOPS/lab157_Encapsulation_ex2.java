package OOPS;

public class lab157_Encapsulation_ex2 {
    public static void main(String[] args) {
        ICICI amit = new ICICI ("amit", 100L);
        System.out.println(amit.getBal());
        boolean isChasier = true;
        amit.setBal(1000L, isChasier);
        System.out.println(amit.getBal());
        System.out.println(ICICI.bank_name);


    }
   static class ICICI{
        private String name;
        private long bal;
        public static String bank_name = "ICICI";

        public ICICI(String name, long bal) {       // parameterized constructors are created
            this.name = name;
            this.bal = bal;
        }

        //access them only geter seter

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getBal() {
            return bal;
        }

        public void setBal(long bal , boolean isChasier) {             // if you set the balance then you have to chasier
           if(isChasier){
            this.bal = bal;
        }else{
               System.out.println("Not allowed to change the balance");
           }
        }
    }
}
