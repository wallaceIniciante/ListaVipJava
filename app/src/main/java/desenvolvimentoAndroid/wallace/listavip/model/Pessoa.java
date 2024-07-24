package desenvolvimentoAndroid.wallace.listavip.model;

public class Pessoa {

    private String primeiroNome;
    private String sobrenome;
    private String nomeCursoDesejado;
    private String telefoneContato;

    public String getPrimeiroNome(){
        return this.primeiroNome;
    }
    public void setPrimeiroNome(String primeiroNome){
        this.primeiroNome = primeiroNome;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public String getNomeCursoDesejado(){
        return this.nomeCursoDesejado;
    }
    public void setNomeCursoDesejado(String nomeCursoDesejado){
        this.nomeCursoDesejado = nomeCursoDesejado;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }
    public void setTelefoneContato(String telefoneContato){
        this.telefoneContato = telefoneContato;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "primeiroNome='" + primeiroNome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", nomeCursoDesejado='" + nomeCursoDesejado + '\'' +
                ", telefoneContato='" + telefoneContato + '\'' +
                '}';
    }
}
