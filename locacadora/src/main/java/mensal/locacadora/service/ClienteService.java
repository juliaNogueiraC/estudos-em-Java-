package mensal.locadora.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import mensal.locadora.model.Cliente;
import mensal.locadora.repositories.ClienteRepository;

@service
public class ClienteService {
  


  @Autowired 
  private ClienteRepository repository;



  public void adiciona(Cliente cliente){

    cliente.setId(null);
     repository.save(cliente);
   


  }




  public void atualiza(Cliente cliente){
    repository.save(cliente);
    
}


public void remove(Long id){
 repository.deleteById(id);
    
}

public Cliente busca(Long id){


// se existir 
    Optional<Cliente> cliente = repository.findById(id);

    // se nao
  return cliente.orElse(null);
    
}

public List<Cliente> lista(){

    return repository.findAll();
    // busca todos !

    
}

}