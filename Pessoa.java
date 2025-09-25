package empresai;
public class Pessoa {
    
    protected String nome;
    protected String sexo;
    protected int idade;
    protected String dataNascimento;

   
    public Pessoa(String nome, String sexo, int idade, String dataNascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
    }

    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(String dataNascimento) { this.dataNascimento = dataNascimento; }
}
