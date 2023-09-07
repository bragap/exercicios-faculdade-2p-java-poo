package questaodois;
public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private String sexo;

    public Pessoa(){
        setNome("Pedro");
        setCpf("10599938411");
        setIdade(21);
        setSexo("Masculino");
    }
    public Pessoa(String nome, String cpf, int idade, String sexo){
        setNome(nome);
        setCpf(cpf);
        setIdade(idade);
        setSexo(sexo);
    }
    public void setNome(String nome){
        if(nome.length() > 3) this.nome = nome;
    }
    public void setCpf(String cpf){
        if(cpf.length() > 0 && cpf.length() < 12) this.cpf = cpf;
    }
    public void setIdade(int idade){
        if(idade > 0 && idade < 110) this.idade = idade;
    }
    public void setSexo(String sexo){
        if(sexo.length() > 0) this.sexo = sexo;
    }  
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public int getIdade(){
        return idade;
    }
    public String getSexo(){
        return sexo;
    }
    public String verifica_maioridade(){
        if(idade >= 18){
            return "Maior de idade";
        } else {
            return "Menor de idade";
        }
    }
}
