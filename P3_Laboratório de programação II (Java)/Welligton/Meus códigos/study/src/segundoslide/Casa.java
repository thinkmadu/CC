package segundoslide;

public class Casa {
    private String endereco;
    private String num;
    private String cor;

    public Casa(){} // construtor vazio
    public Casa(String endereco, String num, String cor){
        this.endereco = endereco;
        this.num = num;
        this.cor = cor;
    } // -- construtor Casa(String, String, String)

    public Casa(String endereco, String cor){
        this.endereco = endereco;
        this.cor = cor;
    } // -- construtor Casa(String, String)

    public void setEndereco(String endereco){
        this.endereco = endereco;
    } // -- método setEndereco(String)

    public String getEndereco(){
        return endereco;
    } // -- método getEndereço
    public void setNum(String num){
        this.num = num;
    } // -- método setNum(String)

    public String getNum(){
        return num;
    } // -- método getNum();
    public void setCor(String cor){
        this.cor = cor;
    } // -- método setCor(String)

    public String getCor(){
        return cor;
    } // -- método getCor()

    public void exibir(){
        System.out.printf("Endereço: %s, %s\nCor: %s\n", endereco, num, cor);
    } // -- método exibir

} // -- classe principal
