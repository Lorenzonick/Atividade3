package fatecpg;
import java.util.Scanner;
 
import abstracao.Carro;
public class principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        carro meuCarro = new carro("fiat", "confort");
        double acl = 0;
        double freio = 0;
        double consu;
   
    System.out.println("Digite a marca do seu carro: ");
    String marca = scan.nextLine();
    meuCarro.setMarca(marca);
 
     System.out.println("Digite o modelo do seu carro: ");
     String modelo = scan.nextLine();
      meuCarro.setMarca(modelo);
   
    meuCarro.girarChave();
   
    System.out.println("Digite o quanto quer acelerar: ");
    acl = scan.nextDouble();
    meuCarro.acelerar(acl);
   
 
    System.out.println("Digite o quanto quer frear: ");
    freio = scan.nextDouble();
    meuCarro.frear(freio);
 
    System.out.println("Digite quantos litros do tanque você consumiu ");
    consu = scan.nextDouble();
    if (consu==0) {
        System.out.println("O tanque está cheio!");
        System.exit(0);
    }
    System.out.println("Digite o valor da gasolina: ");
    double valorGasolina = scan.nextDouble();
    meuCarro.calcular(valorGasolina, consu);
   
    meuCarro.girarChave();
   
    }
 
    }