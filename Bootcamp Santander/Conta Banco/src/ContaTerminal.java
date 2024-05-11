
        public class ContaTerminal {
            public static void main(String[] args) throws Exception {
        
                double saldo = 25;
                double valorSolicitado = 18;
        
                if (saldo >= valorSolicitado)
                {
                    saldo -= valorSolicitado;
                    System.out.println("R$ " + saldo);
                }
        
                else 
                {
                    System.out.println("Saldo Insuficiente");
                }
                
                
            }
        }