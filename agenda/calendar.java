Import java.util.Calendar;
Import java.util.GregorianCalendar;
  
public class Contato extends Contato
{
  protected Calendar nasc;
  publicContato(String nome, Calendar nasc)
    {   super(nome);
         this.nasc = nasc;
    }
    
    
     public String getDados(){
        returnsuper.getDados()+" voce nasceu em "+
        nasc.get(Calendar.DATE)+"/"+
        nasc.get(Calendar.MONTH) + "/"+
        nasc.get(Calendar.YEAR) + "\nIdade: ";
    }