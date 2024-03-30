package abstracao;
import java.util.Scanner;
 
public class carro {
    private String marca ;
    private String modelo;
    private boolean status;
    public double velocidade = 0;
    public double tanque=80;
    public double valorGasolina;
    public double tanqueCheio;
   
    Scanner ler = new Scanner(System.in);
   
    //construtor
    public carro (String marca, String modelo) {
     this.marca = marca;                                    
     this.modelo = modelo;
     }
   
 
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
   
    public void setMarca(String marca) {
        this.marca = marca;
    }
   
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
   
    public void girarChave() {
        if (this.status == true) {
            System.out.println("Carro Desligou!");
            this.status = false;
        }
        else {
            System.out.println("Carro Ligou");
            this.status = true;
        }
    }
 
    public double getVelocidade() {
        return velocidade;
    }
 
    public void acelerar(double acl) {
        if (this.velocidade <= 180) {
            this.velocidade += acl;
            if(this.velocidade >= 180) {
                this.velocidade = 180;
                System.out.println("Velocidade Máxima!");
            }
            else {
                System.out.println("Velocidade Atual: " + this.velocidade);
            }
        }
    }
 
    public void frear(double freio) {
        if (this.velocidade > 0) {
            this.velocidade -= freio;
            if(this.velocidade <= 0) {
                this.velocidade = 0;
                System.out.println("Carro Parado!");
            }
            else {
                System.out.println("Velocidade Atual: " + this.velocidade);}}}
 
        public void calcular(double valorGasolina, double consu) {
            tanqueCheio= consu * valorGasolina;
            System.out.println("Para completar o tanque custará: R$" + tanqueCheio);
   
           
        }
    }
