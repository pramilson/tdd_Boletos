package pagamento;

import java.util.List;

import boleto.Boleto;
import fatura.Fatura;

public class PagamentoFatura {
	
	private String data;
	private List<Boleto>boletos;
	private Fatura fat;
	
	public PagamentoFatura(String data, List<Boleto> boletos, Fatura fat) {
		super();
		this.data = data;
		this.boletos = boletos;
		this.fat = fat;
	}
	
	public void pagamentoFaturaPorBoleto() {
		fat.setPaga(true);
	}
	

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public List<Boleto> getBoletos() {
		return boletos;
	}

	public void setBoletos(List<Boleto> boletos) {
		this.boletos = boletos;
	}

	public Fatura getFat() {
		return fat;
	}

	public void setFat(Fatura fat) {
		this.fat = fat;
	}
	
	

}
