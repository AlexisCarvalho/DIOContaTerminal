import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
        
        System.out.println("Por favor, digite o número da Conta:");
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.println("Por favor, digite o número da Agência:");
        String agency = scanner.nextLine();
        
        System.out.println("Por favor, digite o Nome do Cliente:");
        String clientName = scanner.nextLine();
        
        System.out.println("Por favor, digite o Saldo inicial:");
        String balanceInput = scanner.next().replace(",", "."); 
        
        double balance = Double.parseDouble(balanceInput); 

        scanner.close();
        
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.getDefault());
        symbols.setDecimalSeparator(',');
        DecimalFormat decimalFormat = new DecimalFormat("#.00", symbols);
        
        String formattedBalance = decimalFormat.format(balance);
        
        String message = "Olá " + clientName + ", obrigado por criar uma conta em nosso banco. " +
                          "Sua agência é " + agency + ", conta " + accountNumber + " e seu saldo " + formattedBalance + " já está disponível para saque.";
        
        System.out.println(message);
    }
}
