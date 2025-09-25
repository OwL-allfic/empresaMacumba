package empresai;
public class Cliente extends Pessoa{
     private String cpf;
    private String email;
    private String endereco;
    private String telefone;

    public Cliente(String nome, String sexo, int idade, String dataNascimento,
                   String cpf, String email, String endereco, String telefone) {
        super(nome, sexo, idade, dataNascimento);
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
}
