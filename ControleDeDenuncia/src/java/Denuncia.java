
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RA21504112
 */
@Entity
public class Denuncia {
    @Id
    private int id_denuncia;
    private String endereco;
    private String desc_denuncia;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data_denuncia;

    public int getId_denuncia() {
        return id_denuncia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setId_denuncia(int id_denuncia) {
        this.id_denuncia = id_denuncia;
    }

    public String getDesc_denuncia() {
        return desc_denuncia;
    }

    public void setDesc_denuncia(String desc_denuncia) {
        this.desc_denuncia = desc_denuncia;
    }

    public Date getData_denuncia() {
        return data_denuncia;
    }

    public void setData_denuncia(Date data_denuncia) {
        this.data_denuncia = data_denuncia;
    }
    
}
