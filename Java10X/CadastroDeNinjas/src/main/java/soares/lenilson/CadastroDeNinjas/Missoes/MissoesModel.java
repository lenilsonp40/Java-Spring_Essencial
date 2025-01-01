package soares.lenilson.CadastroDeNinjas.Missoes;

import jakarta.persistence.*;
import soares.lenilson.CadastroDeNinjas.Ninjas.NinjaModel;

@Entity
@Table (name = "tb_missoes")
public class MissoesModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    private NinjaModel ninja;
}
