Import java.util.GregorianCalendar;
  
public class Main{
   static void mostraDados(Contatoobj){
      System.out.println(obj.getDados());
      
        if(objinstanceofContato)
          System.out.println(((Contato)obj).getIdade());
          System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");
    } 
    
    
     public static void main(String[] args) {
          Agenda a;
          a=new Agenda();
  
           Contato exemplo;
           exemplo=new Contato("peter",newGregorianCalendar(1999,05,28));
           exemplo.setTelefone(new Telefone("9998887766","Telefone celular"));
           a.inserir(exemplo);
  
           
          Contatoobj=a.buscar("peter");
  
    }
    }