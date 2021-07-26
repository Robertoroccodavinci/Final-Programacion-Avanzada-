package clases;

import java.util.ArrayList;

public class RanuraDeposito {
	
	private int sobres;
	private double total;
	private ArrayList<Double> monto=new ArrayList<Double>();
	private ArrayList<Integer> NCuenta=new ArrayList<Integer>();
	
	public RanuraDeposito() {
		sobres=0;
		total=0;
	}
	
	public void depositar(double monto, int NCuenta) {
		this.NCuenta.add(NCuenta);
		this.monto.add(monto);
		sobres++;
		total+=monto;
	}

	

	
	
	
	
}
