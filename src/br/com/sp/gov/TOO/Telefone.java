
package br.com.sp.gov.TOO;

public class Telefone {
  private long Id;
  private String Tipo;
  private   int Numero;
  
  
  
  
  public long getId(){
  return Id;
  
  } 
  
  public void setId(long Id){
      this.Id=Id;
  }
  
  public String getTipo(){
  return Tipo;
}
  public void setTipo(String Tipo){
      this.Tipo=Tipo;
      }
  
  public int getNumero(){
      return Numero;
      
  }
  public void setNumero(int Numero){
      this.Numero=Numero;
      
  }
}


