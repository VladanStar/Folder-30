

package enumtipovi;


public class EnumTipovi {

   
    public static void main(String[] args) {
        String gorivo = "g";
       Automobil a1 = new Automobil(VrstaGoriva.fromSkracenica(gorivo), "Jaguar GTO");
       
     System.out.println(a1.getModel() + " " + a1.getVrstaGoriva());
    }
    
}
