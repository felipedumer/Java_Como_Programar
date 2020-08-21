package Lista8;

import java.util.Calendar;

public final class Data {
	  // atributos (ou propriedades)
	  private int dia;
	  private int mes;
	  private int ano;
	  
	  // m�todos
	  // m�todo construtor
	  public Data(int dia, int mes, int ano) {
	    this.dia = dia;
	    this.mes = mes;
	    this.ano = ano;
	  }
	  
	  // m�todo construtor
	  public Data() {
	    Calendar hoje = Calendar.getInstance();
	 
	    dia = hoje.get(Calendar.DAY_OF_MONTH);
	    mes = hoje.get(Calendar.MONTH)+1;
	    ano = hoje.get(Calendar.YEAR);
	  }

	  public int getDia() {
	    return dia;
	  }

	  public void setDia(int dia) {
	    this.dia = dia;
	  }

	  public int getMes() {
	    return mes;
	  }

	  public void setMes(int mes) {
	    this.mes = mes;
	  }

	  public int getAno() {
	    return ano;
	  }

	  public void setAno(int ano) {
	    this.ano = ano;
	  }
	   
	  public int calculaIdade() {
	    Data hj = new Data();
	    
	    int id;
	    
	    id = hj.getAno() - ano;
	    if ((hj.getMes() < mes) || ((hj.getMes() == mes) && (hj.getDia() < dia)))
	       id = id - 1; // ainda n�o fez anivers�rio no ano
	    
	    return(id);
	  }
	  
	  public String nomeMes(boolean abreviado) {
	    String meses[] = {"", "janeiro", "fevereiro", "mar�o", "abril", "maio", "junho",
	        "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
	    if (abreviado)
	       return(meses[mes].substring(0, 3));
	    else return(meses[mes]);
	  }
	  
	  public String mostrarData(int tipo) {
	    switch (tipo) {
	      case 0: return(dia + "/" + mes + "/" + ano);
	      case 1: return(dia + "/" + nomeMes(true) + "/" + ano);
	      default: return(dia + "/" + nomeMes(false) + "/" + ano);
	    }
	  }

	}