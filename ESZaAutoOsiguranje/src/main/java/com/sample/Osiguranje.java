package com.sample;

public class Osiguranje {
	
	private int snagaMotora;
	private boolean novAutomobil;
	private int proslogodisnjiPremijskiStepen;
	private int brojNezgoda;
	
	private double osnovnaCena;
	private int premijskiStepen;
	private double konacnaCena;
	
	public int getSnagaMotora() {
		return snagaMotora;
	}
	
	public void setSnagaMotora(int snagaMotora) {
		this.snagaMotora = snagaMotora;
	}
	
	public boolean isNovAutomobil() {
		return novAutomobil;
	}
	
	public void setNovAutomobil(boolean novAutomobil) {
		this.novAutomobil = novAutomobil;
	}
	
	public int getProslogodisnjiPremijskiStepen() {
		return proslogodisnjiPremijskiStepen;
	}
	
	public void setProslogodisnjiPremijskiStepen(int proslogodisnjiPremijskiStepen) {
		this.proslogodisnjiPremijskiStepen = proslogodisnjiPremijskiStepen;
	}
	
	public int getBrojNezgoda() {
		return brojNezgoda;
	}
	
	public void setBrojNezgoda(int brojNezgoda) {
		this.brojNezgoda = brojNezgoda;
	}
	
	public double getOsnovnaCena() {
		return osnovnaCena;
	}
	
	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}
	
	public int getPremijskiStepen() {
		return premijskiStepen;
	}
	
	public void setPremijskiStepen(int premijskiStepen) {
		this.premijskiStepen = premijskiStepen;
	}
	
	public double getKonacnaCena() {
		return konacnaCena;
	}
	
	public void setKonacnaCena(double konacnaCena) {
		this.konacnaCena = konacnaCena;
	}

	@Override
	public String toString() {
		return "Osiguranje [snagaMotora=" + snagaMotora + ", novAutomobil=" + novAutomobil
				+ ", proslogodisnjiPremijskiStepen=" + proslogodisnjiPremijskiStepen + ", brojNezgoda=" + brojNezgoda
				+ ", osnovnaCena=" + osnovnaCena + ", premijskiStepen=" + premijskiStepen + ", konacnaCena="
				+ konacnaCena + "]";
	}
	
	
}
