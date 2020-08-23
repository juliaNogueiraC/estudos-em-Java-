public class Cliente{

     private String nome;
     private String telefone;
     private String email;
     private String codigo;

     public String getNome(){
     	return nome;

     }

    public void setNome(String nome){
    	this.nome = nome;

    }

    public String getTelefone(){
    	return telefone;
    }
    public void setTelefone(String telefone){
    	this.telefone = telefone;

    }

    public String getEmail(){
    	return email;

    }

    public void setEmail(String email){

    	this.email = email;
    }

     public String getCodigo(){
    	return codigo;

    }

    public void setCodigo(String codigo){

    	this.codigo = codigo;
    }
}











public class Conta{
   
    void Cadastro( String nome, codigo, email, telefone){
    	scanner scan = new scanner(System.in);

		
            Cliente [] clientes = new Cliente[];

            for (int i = 0;i , clientes.legth ; i++ ) {

            	System.out.println("informacoes do cliente:" + (i+1));
            	Cliente c = new Cliente();
                

                System.out.println("nome:");
            	 String nome = scan.nextLine();
            	 c.SetNome(nome);

            	  System.out.println("codigo:");
            	 String codigo = scan.nextLine();
            	 c.setCodigo(codigo);

            	  System.out.println("email");
            	 String email = scan.nextLine();
            	 c.setEmail(email);

            	 System.out.println("telefone");
            	 String telefone = scan.nextLine();
            	 c.setTelefone(telefone);



            	clientes[i] = c;
       
        

     }
 }


    void Lista(){

     
     for ( int i=0 ;i< clientes.size(); i++)
     {
     	
    
   	 System.out.println(clientes.get(i));

    	
    	
}
}

    void AberturaConta(){

    	Saldo [] saldos = new Saldo;

     scanner scan = new scanner(System.in);

    	 System.out.println("nome:");
            	 String nome = scan.nextLine();
         System.out.println("codigo:");
            	 String codigo = scan.nextLine();


    	for (int i=0; i< clientes.length; i++){

   		
    	
    	if (i = nome) and (i = codigo ){
    		
    			for (int i=0; i< saldos.legth ;i++ ) {
    				System.out.println("informe o seu saldo inicial:");
    			     Saldo s = new Saldo();

            	 String saldo = scan.nextLine();
            	 s.setSaldo(saldo);

            	 saldo[i] = s;

    				
    			}
    			
    			
    		}


    }

  
    
    void Saque(){
    	scanner scan = new scanner(System.in);

    	 System.out.println(" informe o nome:");
            	 String nome = scan.nextLine();
          System.out.println(" informe o codigo:");
            	 String codigo = scan.nextLine();
         for (int i=0; i< clientes.length; i++){

   		
    	
    	if (i = nome) and (i = codigo ){
    		for (int i=0; i< saldos.legth ;i++ ) {

    		
    	

       try{
       	System.out.println(" informe o valor para saque:");
            	float valor = scan.nextLine();

        saldo -=  valor;
        return saldo;

       }catch(Exception erro) {
       	system.out.println("ocorreu um erro!"+erro);

       }finally{
       	system.out.println(" saque realizado com sucesso !");
       }

        

}
    }
}
     
       
    void Deposito(){
    	scanner scan = new scanner(System.in);

    	 System.out.println(" informe o nome:");
            	 String nome = scan.nextLine();
          System.out.println(" informe o codigo:");
            	 String codigo = scan.nextLine();
         for (int i=0; i< clientes.length; i++){

   		
    	
    	if (i = nome) and (i = codigo ){
    		for (int i=0; i< saldos.legth ;i++ ) {

    		
    	

       try{
       	System.out.println(" informe o valor depositado:");
            	float valor = scan.nextLine();


    	try{
    		 saldo+= valor;
    		 return saldo;

    	}catch(Exception erro){
          system.out.println(" ocorreu um erro!"+erro);

    	}finally{
    		system.out.println("deposito realizado com sucesso !");
    	}
    }



    void Relatorio(String nome){

         scanner scan = new scanner(System.in);

    	 System.out.println("nome:");
            	 String nome = scan.nextLine();


    	for (int i=0; i< clientes.length; i++){

   		
    	
    	if (i = nome){
    		
    	


        System.out.println("====================================");
        System.out.println("nome do titular:"+nome);
        System.out.println("codigo:"+codigo);
        System.out.println("telefome:"+telefone);
        System.out.println("email:"+email);


        System.out.println("====================================");

        }

        else () {
        	System.out.println("nome invalido");

        	
        }
        
}

}

     }
    	



    




import java.util.Scanner;
public class Main{
  // main e menu 
    int opcao;
	system.out.println(" menu principal - digite uma opcao: ");
	system.out.println("1- cadastrar cliente ");
	system.out.println("2- listar clientes ");
	system.out.println("3- abri nova conta");
	system.out.println("4- efetuar deposito");
	system.out.println("5- efetuar saque ");
	system.out.println("6- relatório" );
	system.out.println("7- sair ");
     
    Scanner ent = new Scanner(System.in);
	 opcao = ent.nextInt();
	 
	 switch( opcao )
{
    case 1:
             

          Conta cadastrar = new Conta();
            cadastrar.Cadastro();




            break;
    
    case 2:

            Conta listar = new Conta();
           listar.lista();
           
            break;
    
    case 3:
           
           Conta abrirConta = new Conta();
            abrirConta.AberturaConta();
           




            break;
    case 4:
            Conta depositar = new Conta();
            depositar.Deposito();


            break;

    case 5:
          Conta sacar = new Conta();
          sacar.Saque();



           break;
    case 6:
           
          Conta gerarRelatorio = new Conta();
          gerarRelatorio.Relatorio();



            break;

    default:
           system.out.println("obrigada por usar esse sistema ,ate mais !");


       break;
}

}


