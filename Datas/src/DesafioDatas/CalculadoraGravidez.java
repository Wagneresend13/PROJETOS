package DesafioDatas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalculadoraGravidez {

	
	private Date dataUltimoPeriodoMenstrual;
	

	
	CalculadoraGravidez(Date dataUltimoPeriodoMenstrual){
		this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
	}
	
	private Calendar converterDataParaCalendar(Date data) {
		
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(data);
	
		return calendar;
	}
	
	public Date calcularDatasEstimadaConcepcao() {
		
		
		Calendar dataEstimadaConcepcao = this.converterDataParaCalendar(this.dataUltimoPeriodoMenstrual);
		dataEstimadaConcepcao.add(Calendar.WEEK_OF_YEAR, 2);
	
		return dataEstimadaConcepcao.getTime();
	}
	
	public Date calcularDataEstimadaParto() {
		
		Calendar dataEstimadaParto = this.converterDataParaCalendar(this.dataUltimoPeriodoMenstrual);
		dataEstimadaParto.add(Calendar.WEEK_OF_YEAR, 40);
		
		
		return dataEstimadaParto.getTime();
	}
	
	

	public Date getDataUltimoPeriodoMenstrual() {
		return dataUltimoPeriodoMenstrual;
	}

	public void setDataUltimoPeriodoMenstrual(Date dataUltimoPeriodoMenstrual) {
		this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
	}
}
