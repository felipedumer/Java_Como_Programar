package Lista8;

public class Pessoa 
{
	  private String nome;
	  private char sexo;
	  private Data dtNasc; // relacionamento de associação

	  public Pessoa(String nome, char sexo, Data dtNasc) {
	    this.nome = nome;
	    this.sexo = sexo;
	    this.dtNasc = dtNasc;
	  }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public char getSexo() {
	        return sexo;
	    }

	    public void setSexo(char sexo) {
	        this.sexo = sexo;
	    }

	    public Data getDtNasc() {
	        return dtNasc;
	    }

	    public void setDtNasc(Data dtNasc) {
	        this.dtNasc = dtNasc;
	    }

	    @Override
	    public String toString() {
	      String result;
	      
	      result = String.format("Nome......: %s\n", getNome()) +
	               String.format("Sexo......: %c\n", getSexo()) +
	               String.format("Nascimento: %s (%d anos)\n", 
	                  getDtNasc().mostrarData(0), getDtNasc().calculaIdade());
	              
	      return result;
	    }	
}
