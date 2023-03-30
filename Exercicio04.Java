// Exercício 4
// metodo static no final!!

pacote  Lista02 ;


public  class  Vendedor {
    
    // atributos
    private int codigo;
    private String nome;
    private double percentualComissao;
}
    
    
     public Vendedor() {
       return  Vendedor ;
    }
    
    public  Vendedor ( codigo :int, nome : String , percentualComissao :double){
    
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
   
     public  String  Sair (){
        return  "Verificacação feita do vendedor : " + Vendedor ;
    }
}         
}
