package boleto;

public class Boleto {
	
	private String cod;
	private String data;
	private double valor;
	
	public Boleto(String cod, String data, double valor) {
		super();
		this.cod = cod;
		this.data = data;
		this.valor = valor;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
}
