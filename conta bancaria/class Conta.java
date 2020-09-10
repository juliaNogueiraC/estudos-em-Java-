class Conta{
    String nomeTitular;
    int numero;
    String agencia;
    double saldo;
    String dataAbertura;
    
    
    void Saca(double valor){
      try {
          saldo = saldo - valor;
          return saldo;
          
       } 
       catch(exception erro){
        system.out.print("ocorreu um erro:"+erro);
        }
        
        finally{
        system.out.println("saque realizado com sucesso");
        }
      
      
    }
    void Deposita(double valor){
      try{
         saldo += valor;
     
         return saldo;
    
    
     } 
       catch(exception erro){
        system.out.print("ocorreu um erro:"+erro);
        }
        
        finally{
        system.out.println("deposito realizado com sucesso");
        }
        }
      
    }
    void calculaRendimento(){
      return saldo * 0.1;
    }
    void recuperaDadosParaImpressao(){
        System.out.println("====================================");
        System.out.println("|nome do titular:"+nomeTitular+"   |"));
        System.out.println("|numero:"+numero+"                 |");
        System.out.println("|agencia:"+agencia+"               |");
        System.out.println("|saldo:"+saldo+"                   |");
        System.out.println("|data de aabertura"+dataAbertura+" |");
        System.out.println("====================================");
        System.out.println("|saque:"+Saca()+"                  |");
        System.out.println("|deposito:"+Deposita()+"           |");
        System.out.println("|redimento:"+calculaRendiemento()+"|");
        System.out.println("====