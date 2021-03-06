package mensal.locadora;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import lombok.Data;
@Entity
@Data
public class Cliente{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
     String nome;
     String cpf;
     String email;


     @OneToMany(mappedBy = "cliente" ) 
     private List<Locacao>  locacoes;
} 