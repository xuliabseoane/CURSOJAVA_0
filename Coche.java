package poo;

public class Coche{
	
	private int ruedas;
	
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso;
	
	
	public Coche(){
		
		ruedas=4;
		
		largo=2000;
		
		ancho=300;
		
		motor=1600;
		
		peso=500;
	
		}
	
	public String DimeLargo(){
		
		return "El largo del coche " + largo;
		
		} 
	
	}
