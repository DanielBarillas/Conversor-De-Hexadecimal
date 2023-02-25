import java.util.Scanner;

public class HexadecimalConversion {
        Scanner scanner = new Scanner(System.in);
        vista Vista = new vista();
        
    public void startPrincipal(){
        Vista.titulo();
        vista Vista = new vista();
        int selection = 0;
        int options1 = 1;
        while(selection != options1){
            options1 = Vista.Menu();
            selection = Vista.selection(options1);
            switch(selection){
                case 1:
                 // Obtener entrada en formato hexadecimal de 3 dígitos
                System.out.println("------------------------------------------");
                System.out.print("Ingrese un número hexadecimal de 3 dígitos: ");
                String hex = scanner.nextLine();
                System.out.println("------------------------------------------");

                // Convert hexadecimal to decimal
                int dec = Integer.parseInt(hex, 16);
                System.out.println("--------------------------");
                System.out.println("Equivalencia decimal: " + dec);
                System.out.println("--------------------------");
                    break;
                case 2:
                System.out.println("--------------------------------------");
                System.out.print("Ingrese un número decimal de 3 dígitos: ");
                int dec1 = scanner.nextInt();
                System.out.println("--------------------------------------");
                
                // Convert decimal to 3-digit decimal format
                String dec3 = String.format("%03d", (int)dec1);
                System.out.println("equivalente decimal de 3 dígitos: " + dec3);

                // Convert decimal to hexadecimal format
                String hex2 = Integer.toHexString(dec1).toUpperCase();
                System.out.println("Equivalencia hexadecimal: " + hex2);
                    break;
                case 3:
                Vista.Cerrando();
                    break;
                default:
                Vista.default1();
                    break;
                
            }
        }   
    }
}