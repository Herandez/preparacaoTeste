/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author UserPL022Pc04
 */
    public abstract class Medico {
        protected int anoDoutoramento;
        protected String instEnsino;
        protected String idLicenca;

    public Medico(int anoDoutoramento, String instEnsino, String idLicenca) {
        this.anoDoutoramento = anoDoutoramento;
        this.instEnsino = instEnsino;
        this.idLicenca = idLicenca;
    }

    public int getAnoDoutoramento() {
        return anoDoutoramento;
    }

    public void setAnoDoutoramento(int anoDoutoramento) {
        this.anoDoutoramento = anoDoutoramento;
    }

    public String getInstEnsino() {
        return instEnsino;
    }

    public void setInstEnsino(String instEnsino) {
        this.instEnsino = instEnsino;
    }

    public String getIdLicenca() {
        return idLicenca;
    }

    public void setIdLicenca(String idLicenca) {
        this.idLicenca = idLicenca;
    }
    
    public void precreverTratamento(){
        
    }
}
