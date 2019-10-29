public class Main {

    public static void main(String[] args) {
        String name = "Andrei";
        int age = 28;
        int temperatyre = 40;
        if (age > 20 && age < 40) {
            System.out.println("Можно идти гулять");
        } else if (temperatyre < +35 && temperatyre < -20) {
            System.out.println("Можно идти гулять");
        }else if (age<20 && temperatyre > 0 && temperatyre < 28){
            System.out.println("Можно идти гулять");
        }else if(age > 45 && temperatyre > -10 && temperatyre < 25) {
            System.out.println("Можно идти гулять");
        }



    }
}
