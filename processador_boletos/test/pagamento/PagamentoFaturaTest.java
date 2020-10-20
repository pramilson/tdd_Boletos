package pagamento;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import boleto.Boleto;
import fatura.Fatura;

public class PagamentoFaturaTest {
	
	private List<Boleto>boletos;
	private Boleto boleto1 = new Boleto ("111", "05/10/2020", 500.00);
	private Boleto boleto2 = new Boleto ("222", "05/10/2020", 400.00);
	private Boleto boleto3 = new Boleto ("333", "05/10/2020", 600.00);
	private Fatura fatura1 = new Fatura ("05/102020", 1500.00, "Pedro", false);
	
	private PagamentoFatura pagamento1 = new PagamentoFatura("05/10/2020", boletos, fatura1);
	
	@BeforeEach
	public void inicializa() {
	boletos = new ArrayList<Boleto>();
	
	
	}
	@Test
	public void pagamentoFatura() {
		pagamento1.pagamentoFaturaPorBoleto();
		assertEquals(true,fatura1.paga);
	}

}
