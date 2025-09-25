package empresai;
public class Produto {
    private int quantidade;
    private String modelo;
    private double peso;
    private String tamanho;
    private double preco;
    private int quantidadeVendida;
    private String validade;
    private String sku;
    private String cor;

    public Produto(int quantidade, String modelo, double peso, String tamanho,
                   double preco, int quantidadeVendida, String validade, String sku, String cor) {
        this.quantidade = quantidade;
        this.modelo = modelo;
        this.peso = peso;
        this.tamanho = tamanho;
        this.preco = preco;
        this.quantidadeVendida = quantidadeVendida;
        this.validade = validade;
        this.sku = sku;
        this.cor = cor;
    }

    
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public String getTamanho() { return tamanho; }
    public void setTamanho(String tamanho) { this.tamanho = tamanho; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public int getQuantidadeVendida() { return quantidadeVendida; }
    public void setQuantidadeVendida(int quantidadeVendida) { this.quantidadeVendida = quantidadeVendida; }

    public String getValidade() { return validade; }
    public void setValidade(String validade) { this.validade = validade; }

    public String getSku() { return sku; }
    public void setSku(String sku) { this.sku = sku; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }
}
