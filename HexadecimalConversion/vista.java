import java.util.InputMismatchException;
import java.util.Scanner;

public class vista {

    Scanner scan = new Scanner(System.in);
    
    public void titulo(){
        System.out.println(" ::::::::   ::::::::  ::::    ::: :::     ::: :::::::::: :::::::::   ::::::::   ::::::::  :::::::::           :::          :::    ::: :::::::::: :::    :::     :::     :::::::::  :::::::::: :::::::: ::::::::::: ::::    ::::      :::     :::        ");
        System.out.println(":+:    :+: :+:    :+: :+:+:   :+: :+:     :+: :+:        :+:    :+: :+:    :+: :+:    :+: :+:    :+:        :+: :+:        :+:    :+: :+:        :+:    :+:   :+: :+:   :+:    :+: :+:       :+:    :+:    :+:     +:+:+: :+:+:+   :+: :+:   :+:        ");
        System.out.println("+:+        +:+    +:+ :+:+:+  +:+ +:+     +:+ +:+        +:+    +:+ +:+        +:+    +:+ +:+    +:+       +:+   +:+       +:+    +:+ +:+         +:+  +:+   +:+   +:+  +:+    +:+ +:+       +:+           +:+     +:+ +:+:+ +:+  +:+   +:+  +:+        ");
        System.out.println("+#+        +#+    +:+ +#+ +:+ +#+ +#+     +:+ +#++:++#   +#++:++#:  +#++:++#++ +#+    +:+ +#++:++#:       +#++:++#++:      +#++:++#++ +#++:++#     +#++:+   +#++:++#++: +#+    +:+ +#++:++#  +#+           +#+     +#+  +:+  +#+ +#++:++#++: +#+        ");
        System.out.println("+#+        +#+    +#+ +#+  +#+#+#  +#+   +#+  +#+        +#+    +#+        +#+ +#+    +#+ +#+    +#+      +#+     +#+      +#+    +#+ +#+         +#+  +#+  +#+     +#+ +#+    +#+ +#+       +#+           +#+     +#+       +#+ +#+     +#+ +#+        ");
        System.out.println("#+#    #+# #+#    #+# #+#   #+#+#   #+#+#+#   #+#        #+#    #+# #+#    #+# #+#    #+# #+#    #+#      #+#     #+#      #+#    #+# #+#        #+#    #+# #+#     #+# #+#    #+# #+#       #+#    #+#    #+#     #+#       #+# #+#     #+# #+#        ");
        System.out.println(" ########   ########  ###    ####     ###     ########## ###    ###  ########   ########  ###    ###      ###     ###      ###    ### ########## ###    ### ###     ### #########  ########## ######## ########### ###       ### ###     ### ########## ");
    } 

    public int Menu(){
        System.out.println("\n-------------------------------------");
        System.out.println("Escoja la opción que desea realizar: ");
        String[] options = {"Cálculó de hexadecimal a decimal", "Cálculo de decimal a hexadecimal", "Salir del programa"};
        System.out.println("-------------------------------------");
        for(int i = 0; i < options.length; i++){
            System.out.println((i+1)+ ". " + options[i]);
        }
        return options.length;
    }

    public int selection(int options) {
        boolean next_step = false;
        int selection = 0;
        do{
            try{
                // Opciones disponibles, cantidad
                // opción de entrada, del usuario
                System.out.println("\nIngrese una de las opciones\n");
                selection = scan.nextInt();
                if(selection < 1 || selection> options){
                    System.err.println("\n¡Debe de ingresar una de las opciones disponibles!\n");
                }else{
                    next_step = true;
                }
            }catch(NumberFormatException e){
                System.err.println("\n¡Debe ingresar un valor numérico del 1 al 3!\n");
            }catch(InputMismatchException e){
                System.err.println("\n¡No ingrese palabras o símbolos, por favor, ingrese un valor númerico del 1 al 3!\n");
                scan.nextLine();
            }
        }while(!next_step);
        return selection;
    }

    public void Cerrando(){
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Cerrando programa, gracias por utilizar nuestro programa de cálculadora...");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println();
    }

    public void default1(){
        System.out.println("Esta opción no es válida, ingrese un número de válido");
    }
}
