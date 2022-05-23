package test.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;
import tests.factory.FinancingFactory;

public class FinancingTests {

	//deve criar o objeto com os dados corretos quando os dados forem validos
	//must create the object with the correct data when the data is valid
	
	@Test
	public void construtorMustCreateObjectWithCorrectDataWhenDataIsValid () {
		
		Double totalAmount = 100000.0;
		Double income = 2000.0;
		Integer months = 80;
		
		Double expectedValue = totalAmount;
		
		Financing f1 = FinancingFactory.createFinancing(totalAmount, income, months);
		
		Assertions.assertEquals(expectedValue, f1.getTotalAmount());
		
	}
	
	//deve lançar IllegalArgumentException quando os dados não forem validos
	//should post IllegalArgumentException when the data is not valid

	@Test
	public void construtorShouldPostIllegalArgumentExceptionWhenDataIsNotValid () {
		
		Double totalAmount = 100000.0;
		Double income = 2000.0;
		Integer months = 20;
		
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			FinancingFactory.createFinancing(totalAmount, income, months);
		});
	}
	
	//deve atualizar o valor quando os dados forem validos
	//should update the value when the data is valid

	@Test
	public void setTotalAmountShouldUpdateValueWhenDataIsValid() {

		Double totalAmount = 100000.0;
		Double income = 2000.0;
		Integer months = 80;
		
		Double expectedValue = totalAmount;
		
		Financing f1 = FinancingFactory.createFinancing(totalAmount, income, months);
		f1.setTotalAmount(totalAmount);
		
		Assertions.assertEquals(expectedValue, f1.getTotalAmount());
	}
	
	//deve lançar IllegalArgumentException quando os dados não forem validos
	//should post IllegalArgumentException when the data is not valid

	@Test
	public void setTotalAmountShouldPostThrowExceptionWhenDataIsNotValid() {

		Double totalAmount = 100000.0;
		Double income = 2000.0;
		Integer months = 80;
		
		Financing f1 = FinancingFactory.createFinancing(totalAmount, income, months);
		
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			f1.setTotalAmount(120000.0);
		});
	}

	//deve atualizar o valor quando os dados forem validos
	//should update the value when the data is valid

	@Test
	public void setIncomeShouldUpdateValueWhenDataIsValid() {

		Double totalAmount = 100000.0;
		Double income = 2000.0;
		Integer months = 80;
		
		Double expectedValue = income;
		
		Financing f1 = FinancingFactory.createFinancing(totalAmount, income, months);
		f1.setIncome(income);
		
		Assertions.assertEquals(expectedValue, f1.getIncome());
	}
	
	//deve lançar IllegalArgumentException quando os dados não forem validos
	//should post IllegalArgumentException when the data is not valid
	@Test
	public void setIncomeShouldPostThrowExceptionWhenDataIsNotValid() {

		Double totalAmount = 100000.0;
		Double income = 2000.0;
		Integer months = 80;
		
		Financing f1 = FinancingFactory.createFinancing(totalAmount, income, months);
		
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			f1.setIncome(1000.0);
		});
	}
	
	//deve atualizar o valor quando os dados forem validos
	//should update the value when the data is valid

	@Test
	public void setMonthsShouldUpdateValueWhenDataIsValid() {

		Double totalAmount = 100000.0;
		Double income = 2000.0;
		Integer months = 80;
		
		Integer expectedValue = months;
		
		Financing f1 = FinancingFactory.createFinancing(totalAmount, income, months);
		f1.setMonths(months);
		
		Assertions.assertEquals(expectedValue, f1.getMonths());
	}
	
	//deve lançar IllegalArgumentException quando os dados não forem validos
	//should post IllegalArgumentException when the data is not valid

	@Test
	public void setMonthsShouldPostThrowExceptionWhenDataIsNotValid() {

		Double totalAmount = 100000.0;
		Double income = 2000.0;
		Integer months = 80;
		
		Financing f1 = FinancingFactory.createFinancing(totalAmount, income, months);
		
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			f1.setMonths(20);
		});
	}
	
	//deve calcular corretamente o valor da entrada
	//must correctly calculate the value of the input

	@Test
	public void entryMustCorrectlyCalculateValueOfInput() {
		
		Double totalAmount = 100000.0;
		Double income = 2000.0;
		Integer months = 80;
		
		Double expectedValue = 20000.0;
		
		Financing f1 = FinancingFactory.createFinancing(totalAmount, income, months);
		
		Assertions.assertEquals(expectedValue, f1.entry());
	}

	//deve calcular corretamente o valor da prestação
	//must correctly calculate the value of the benefit

	@Test
	public void quotaMustCorrectlyCalculateValueOfBenefit() {
		
		Double totalAmount = 100000.0;
		Double income = 2000.0;
		Integer months = 80;
		
		Double expectedValue = 1000.0;
		
		Financing f1 = FinancingFactory.createFinancing(totalAmount, income, months);
		
		Assertions.assertEquals(expectedValue, f1.quota());
	}
}
