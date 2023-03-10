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
        System.out.println("Escoja la opci??n que desea realizar: ");
        String[] options = {"C??lcul?? de hexadecimal a decimal", "C??lculo de decimal a hexadecimal", "Salir del programa"};
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
                // opci??n de entrada, del usuario
                System.out.println("\nIngrese una de las opciones\n");
                selection = scan.nextInt();
                if(selection < 1 || selection> options){
                    System.err.println("\n??Debe de ingresar una de las opciones disponibles!\n");
                }else{
                    next_step = true;
                }
            }catch(NumberFormatException e){
                System.err.println("\n??Debe ingresar un valor num??rico del 1 al 3!\n");
            }catch(InputMismatchException e){
                System.err.println("\n??No ingrese palabras o s??mbolos, por favor, ingrese un valor n??merico del 1 al 3!\n");
                scan.nextLine();
            }
        }while(!next_step);
        return selection;
    }

    public void Cerrando(){
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Cerrando programa, gracias por utilizar nuestro programa de c??lculadora...");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println();
    }

    public void default1(){
        System.out.println("Esta opci??n no es v??lida, ingrese un n??mero de v??lido");
    }
}
