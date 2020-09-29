package mensal.locadora;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;


import lombok.Data;
@Entity
@Data
public class Veiculo{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
     String modelo;
     Srring marca;
     BigDecimal valorDiaria;

  // um veiculo para muitas locaçoes 
  @OneToMany(mappedBy = "Veiculo" ) 
     private List<Locacao>  locacoes;
  // muitos veiculos para 1 categria
  @ManyToOne
  private Categoria categoria ;
}
     
