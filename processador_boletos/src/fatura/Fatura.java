package fatura;

public class Fatura {
	
	private String data;
	private double valorTotal;
	private String cliente;
	public boolean paga;
	public Fatura(String data, double valorTotal, String cliente, boolean paga) {
		super();
		this.data = data;
		this.valorTotal = valorTotal;
		this.cliente = cliente;
		this.paga = paga;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public boolean isPaga() {
		return paga;
	}
	public void setPaga(boolean paga) {
		this.paga = paga;
	}
	
	
	

}
