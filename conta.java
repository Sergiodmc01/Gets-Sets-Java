package trabalho04_GetsSets;

public class conta {
	private int numero;
	private double saldo;
	private int tipo;
	public boolean ver = false;
	public conta(int numero, double saldo, int tipo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.tipo = tipo;
			}
	public conta(int numero, int tipo) {
		this.numero = numero;
		this.tipo = tipo;
	}
	public conta() {
				}
			
			public int getNumero() {
				return numero;
			}
			public void setNumero(int numero) {
				this.numero = numero;
			}
			public double getSaldo() {
				return saldo;
			}
			public void setSaldo(double saldo) {
				
				if (saldo > 0) {
					this.saldo = saldo;	
					System.out.println("Alteracao realizada com sucesso");
				} else if (this.tipo == 3) {
					this.saldo = saldo;	
					System.out.println("Alteracao realizada com sucesso");
				} else {
					System.out.println("Alteracao nao realizada");
				}
				
			}
			public int getTipo() {
				return tipo;
			}
			public void setTipo(int tipo) {
				this.tipo = tipo;
			}
			public String toString() {
				return "conta [numero=" + numero + ", saldo=" + saldo + ", tipo=" + tipo + "]";
			}
			
			
	
	
	
}
