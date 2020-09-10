Import java.util.ArrayList;
  
public class Agenda{
   private ArrayList<Contato>contatos;
    Agenda(){
      contatos=new ArrayList();
    }
    
    
    public void inserir(Contato x){
      contatos.add(x);
    }
    
    
    Public remover(String nome){
           for(int i=0;i<contatos.size();i++){
              Contato x=contatos.get(i);
              if(c.getNome().equalsIgnoreCase(nome))
                 contatos.remove(i);
                 System.out.println("contato removido com sucesso.");
        }
    
    }
    
    
    Public buscar(String nome){
      for(int i=0;i<contatos.size();i++){
             Contato x=contatos.get(i);
             if(c.getNome().equalsIgnoreCase(nome))
               return contatos.get(i);
               }
                
        return null; 
    }