
package Lista02;

public  class  Vendedor {
    
    // atributos
    private int codigo;
    private String nome;
    private double percentualComissao;

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the percentualComissao
     */
    public double getPercentualComissao() {
        return percentualComissao;
    }

    /**
     * @param percentualComissao the percentualComissao to set
     */
    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
}
  

public  Vendedor ( codigo :int, nome : String , percentualComissao :double){
return Vendedor;

}
//metodo

public  double  calcularPagamentoComissao ( valorVenda double){

return valorVenda*percentualComissao/100;

}
public  double  calcularPagamentoComissao ( valorVenda double, desconto double){

return calcularPagamentocomissao(valorVenda)-desconto;

//METODO STATIC
public static void main calcularPagamentoComissao double ( valorVenda double, percentualComissao double);

}
}

// IMPRIMIR
public  String  imprimir (valorVenda double, desconto double){
return  "Codigo: " + codigo +
"\nNome:" + nome +
"\nValor venda :" + valorVenda +
"\n% comissao :" + percentualComissao +
"\nDesconto :" + desconto +
"\nValor a pagar :" + Calcularcomissao; // chamando do menu

public  String  CadastrarVendedor ( Vendedor v ){

String  retorno = "" ;
retorno += "Cadastre um vendedor" ;
retorno += v . CadastrarVendedor ();
return  retorno ;
}
public  String  Calcularcomissao(){

return  "Valor da venda: " + valorVenda+
"\nValor do desconto:" + desconto;
}

public  String  Sair ();{
return  "Verificacação feita do vendedor : " + Vendedor ;
}
}
}

