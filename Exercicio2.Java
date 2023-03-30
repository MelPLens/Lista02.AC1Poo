// Exercicio 2
package Lista02;


public class Apolice {
    
    // atributos
    private int numero;
    private String nome;
    private int idade;
    private char sexo;
    private double valorAutomovel;
    
    
     public Apolice() {
        return Apolice;
    }
    
    public apolice( numero:int,nome:String,idade:int,Sexo:char,valorAutomovel:double){
    
}
    //metodo
    
    public double calcularValor(){
        
         if ( sexo=="M" & idade<=25)
             return valorAutomovel*10/100;
         
         if ( sexo=="M" & idade>=25)
               return valorAutomovel*5/100;
         
         if ( sexo=="F")
               return valorAutomovel*2/100;
        
    }
}

                 // IMPRIMIR
                 public String imprimir(){
                 return "Numero : " + numero +
                 "\nNome :" + nome+
                 "\nIdade :" + idade+
                 "\nSexo :" + sexo+
                 "\nValor Automovel :" + valorAutomovel+
                 "\nValor Apolice :" + apolice;
           
   public String Criarapolice(apolice a){
     
        String retorno = "";
        retorno += "Crie uma apolice";
        retorno += a.Criarapolice();
        return retorno;
    }
    public String Dadosapolice(){
        
        return "Ver dados apolice : "+ apolice;
    }
   
     public String Sair(){
     
        return "Apolice criado : " + apolice;
    }

 
}
         
}
