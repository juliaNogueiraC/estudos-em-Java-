package mensal.locadora;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
@Entity
@Data
public class Locacao{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
     Date data;
     int qtdDiarias;
     BigDecimal valorDiaria;

// muitas locaoes para 1 cliente 
// muitasw locadcoes para um veiculo
@ManyToOne
private Cliente cliente ;

@ManyToOne
    private Veiculo veiculo ;
}