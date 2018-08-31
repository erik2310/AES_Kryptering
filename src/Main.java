import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        try {
            Scanner scanner = new Scanner(System.in);

            String besked = scanner.nextLine();

            String code = AESEncrypter.encrypt(besked);
            System.out.println(code);

            String decoded = AESEncrypter.decrypt(code);
            System.out.println(decoded);
        } catch (java.lang.Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
