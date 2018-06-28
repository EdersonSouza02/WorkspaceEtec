
package br.com.sp.gov.TOO;


public class Projeto {
    private long Id;
    private String Titulo;
    private String Inicio;
    private String Termino;
    private String Financiadora;
    private double Valor;
    private String Objetivo;
    private String Descricao;
    
    
    public long getId(){
  return Id;
  
  } 
  
  public void setId(long Id){
      this.Id=Id;
  }
   
  public String getTitulo(){
       return Titulo;
       
       
   }
   public void setTitulo(String Titulo){
       this.Titulo=Titulo;
       
       
   }
   
   public String getInicio(){
       return Inicio;
       
       
   }
   
   public void setInicio(String Inicio){
       this.Inicio=Inicio;
       
   }
   
     public String getTermino(){
       return Termino;
       
       
   }
   
   public void setTermino(String Termino){
       this.Termino=Termino;
       
   }
    public String getFinanciadora(){
       return Financiadora;
       
       
   }
   
   public void setFinanciadora(String Financiadora){
       this.Financiadora=Financiadora;
       
   }
    public double getValor(){
       return Valor;
       
       
   }
   
   public void setValor(Double Valor){
       this.Valor=Valor;
       
   }
     public String getObjetivo(){
       return Objetivo;
       
       
   }
   
   public void setObejtivo(String Objetivo){
       this.Objetivo=Objetivo;
       
   }
     
   public String getDescricao(){
       return Descricao;
       
       
   }
   
   public void setDescricao(String Descricao){
       this.Descricao=Descricao;
       
   }
   
   
   
   
  
}

