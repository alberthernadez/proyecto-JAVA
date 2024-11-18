public class ControlFlujo {
    public static void main (String[] args){
       int edad = (int) (Math.random() * 20 ) +1 ;

        System.out.println(edad);

        if (edad <= 17) {
            System.out.println("sos menor e edad");
        }
    }
}
   