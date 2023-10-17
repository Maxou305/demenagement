public class Main {
    public static void main(String[] args) {
        int cartons = 34;
        int contenanceCamion = 9;
        for (int i = 0; i < cartons; i++) {
            if (cartons > 9) {
                System.out.println("Un voyage de " + contenanceCamion + " cartons");
                cartons -= contenanceCamion;
                System.out.println("reste " + cartons + " cartons");
            } else {
                System.out.println("Un voyage de " + cartons + " cartons");
                System.out.println("Déménagement fini !");
                return;
            }
        }
    }
}