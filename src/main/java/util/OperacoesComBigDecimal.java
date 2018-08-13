package util;

import java.io.Serializable;
import java.math.BigDecimal;

public class OperacoesComBigDecimal implements Serializable{
	
	public BigDecimal multiplica(String numeroParaMultiplicar, String valorParaMultiplicar){
		
		BigDecimal nParaMultiplicar = new BigDecimal(numeroParaMultiplicar);
		BigDecimal vParaMultiplicado = new BigDecimal(valorParaMultiplicar);
		BigDecimal resultado = null;
		resultado = vParaMultiplicado.multiply(nParaMultiplicar);
		
		return resultado;
		
	}
	
	
	public BigDecimal dividir(String numeroParaDividir, String valorParaDividir){
		
		Float resultado = null;
		Float vParaDividir = Float.parseFloat(valorParaDividir);
		Float nParaDividir = Float.parseFloat(numeroParaDividir);
		
		
		//só divide se tiver mais de um registro na lista
		if(!numeroParaDividir.equals("0")){
			
			resultado = vParaDividir / nParaDividir;
		
		}else{
			resultado = vParaDividir;
		}
		
		BigDecimal converterParaBigDecimal = new BigDecimal(resultado);
		converterParaBigDecimal = converterParaBigDecimal.setScale(2, BigDecimal.ROUND_DOWN);
		
		return converterParaBigDecimal;
		
	}
	
	public BigDecimal soma(String numeroParaSomar1, String numeroParaSomar2){
		
	
		if(numeroParaSomar1 != null && numeroParaSomar2 != null){
			BigDecimal nParaSomar1 = new BigDecimal(numeroParaSomar1.replace(",", "."));
			BigDecimal nParaSomar2 = new BigDecimal(numeroParaSomar2.replace(",", "."));
			BigDecimal resultado = null;
			resultado = nParaSomar1.add(nParaSomar2);
		
			return resultado;
			
		}else{
			
			return null;
		}
	}
	
	public BigDecimal subtrai(String an, String am){
		
		if(an != null && am != null){
			BigDecimal nParaSomar1 = new BigDecimal(an.replace(",", "."));
			BigDecimal nParaSomar2 = new BigDecimal(am.replace(",", "."));
			BigDecimal resultado = null;
			
			resultado = nParaSomar1.subtract(nParaSomar2);
		
			return resultado;
			
		}else{
			
			return null;
		}
		
	}

}
