import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TesteProduto {
	
	Produto produto = new Produto(70, 1.75);
	
	/*Teste setPeso*/
	@Test
	public void testeGetPeso() {

		assertEquals(70, produto.getPeso());
	}
	
	/*Teste getAltura*/
	
	@Test
	public void testeGetAltura() {
		
		assertEquals(1.75, produto.getAltura());
	}
	
	//==============================================//
	
	@Test
	public void testeSetPeso() {
		produto.setPeso(70);
		assertEquals(70, produto.getPeso());
	}
	
	@Test
	public void testeSetAltura() {
		produto.setAltura(1.80);
		assertEquals(1.80, produto.getAltura());
		
	}
}
