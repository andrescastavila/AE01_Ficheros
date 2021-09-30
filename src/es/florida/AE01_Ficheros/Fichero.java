package es.florida.AE01_Ficheros;

import java.util.Date;

public class Fichero {

	private String nombre;
	private boolean tipo;
	private String ubi;
	private long fecha;
	private boolean oculto;
	private long tamanyo;
	private String elementos;
	private long espacioLibre;
	private long espacioDisponible;
	private long espacioTotal;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public boolean getTipo() {
		return tipo;
	}
	public void setTipo(boolean tipo) {
		this.tipo=tipo;
	}
	public String getUbi() {
		return ubi;
	}
	public void setUbi(String ubi) {
		this.ubi=ubi;
	}
	public long getFecha() {
		return fecha;
	}
	public void setFecha(long fecha) {
		this.fecha=fecha;
	}
	public boolean getOculto() {
		return oculto;
	}
	public void setOculto(boolean oculto) {
		this.oculto=oculto;
	}
	public long getTamanyo() {
		return tamanyo;
	}
	public void setTamanyo(long tamanyo) {
		this.tamanyo=tamanyo;
	}
	public String getElementos() {
		return elementos;
	}
	public void setElementos(String elementos) {
		this.elementos=elementos;
	}
	public long getEspacioLibre() {
		return espacioLibre;
	}
	public void setEspacioLibre(long espacioLibre) {
		this.espacioLibre=espacioLibre;
	}
	public long getEspacioDisponible() {
		return espacioDisponible;
	}
	public void setEspacioDisponible(long espacioDisponible) {
		this.espacioDisponible=espacioDisponible;
	}
	public long getEspacioTotal() {
		return espacioTotal;
	}
	public void setEspacioTotal(long espacioTotal) {
		this.espacioTotal=espacioTotal;
	}
	
	
}
