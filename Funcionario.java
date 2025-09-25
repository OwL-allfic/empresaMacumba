package empresai;
public class Funcionario extends Pessoa{
    private double salarioFixo;
    private String estadoCivil;
    private int experiencia;
    private String cargo;
    private String setor;
    private int cargaHoraria;

    private final double valorHoraExtra = 20.0;

    public Funcionario(String nome, String sexo, int idade, String dataNascimento,
                       double salarioFixo, String estadoCivil, int experiencia,
                       String cargo, String setor, int cargaHoraria) {
        super(nome, sexo, idade, dataNascimento);
        this.salarioFixo = salarioFixo;
        this.estadoCivil = estadoCivil;
        this.experiencia = experiencia;
        this.cargo = cargo;
        this.setor = setor;
        this.cargaHoraria = cargaHoraria;
    }

   
    public double getSalarioFixo() { return salarioFixo; }
    public void setSalarioFixo(double salarioFixo) { this.salarioFixo = salarioFixo; }

    public String getEstadoCivil() { return estadoCivil; }
    public void setEstadoCivil(String estadoCivil) { this.estadoCivil = estadoCivil; }

    public int getExperiencia() { return experiencia; }
    public void setExperiencia(int experiencia) { this.experiencia = experiencia; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public String getSetor() { return setor; }
    public void setSetor(String setor) { this.setor = setor; }

    public int getCargaHoraria() { return cargaHoraria; }
    public void setCargaHoraria(int cargaHoraria) { this.cargaHoraria = cargaHoraria; }

    
    public double consultarSalario(int quantidadeVendas, int quantidadeHorasExtra) {
        double comissao = quantidadeVendas * (0.02 * salarioFixo);
        double horasExtras = consultarValorHoraExtra(quantidadeHorasExtra);
        return salarioFixo + comissao + horasExtras;
    }

    private double consultarValorHoraExtra(int quantidadeHorasExtra) {
        return quantidadeHorasExtra * valorHoraExtra;
    }
}
