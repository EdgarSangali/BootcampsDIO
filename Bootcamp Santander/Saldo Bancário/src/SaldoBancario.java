import java.util.Locale;
import java.util.Scanner;

public class SaldoBancario {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double Saldo = 0.0;            
        int opcao = sc.nextInt();

       while (opcao != 0) {        
             
            switch (opcao) {                
                             
                case 1:                                           
                double ValorDepositado = sc.nextDouble();
                Saldo += ValorDepositado;
                System.out.printf("Saldo Atual: %.1f", Saldo);
                opcao = sc.nextInt();
                break;                

                case 2:                
                double ValorSacado = sc.nextDouble();

                if (ValorSacado <= Saldo)                {
                    Saldo-=ValorSacado;                    
                }
                else{
                    System.out.println("Saldo Insuficiente");
                }                    
                opcao = sc.nextInt();
                break;                

                case 3:
                
                System.out.printf("Saldo Atual: %.1f", Saldo);
                opcao = sc.nextInt();
                break;               
            
                default:
                break;
            }
                
              if(opcao==0)
              {
                System.out.println("Programa Encerrado");
              }
              
              sc.close();
            }
        }
                
    }