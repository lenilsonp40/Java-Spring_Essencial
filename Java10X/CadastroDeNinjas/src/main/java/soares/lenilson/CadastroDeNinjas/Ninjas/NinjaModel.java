package soares.lenilson.CadastroDeNinjas.Ninjas;
import jakarta.persistence.*;
import soares.lenilson.CadastroDeNinjas.Missoes.MissoesModel;

import java.util.List;

//Entity transforma uma classe em uma entidade do BD
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private int idade;
    private List <MissoesModel> missoes;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
}
