package inheritance_9_2_3;

public class Main
{
	public static void main(String[] args) {
		
		Dollar dollar = new Dollar(71.17);
		System.out.println(dollar.exchangeToRub(100.50));
		Euro euro = new Euro(76.06);
		System.out.println(euro.exchangeToRub(150.00));
		
	}
}
