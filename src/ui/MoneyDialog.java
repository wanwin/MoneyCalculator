package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import model.Currency;
import model.Money;
import model.Number;

public class MoneyDialog {
    
    private Money money;
    
    public Money execute() throws IOException{
        
        Money money;
        Currency currency;
        Number amount;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca una cantidad de dinero");
        amount = new Number(Double.parseDouble(reader.readLine()));
        CurrencyDialog currencyDialog = new CurrencyDialog();
        currency = currencyDialog.execute();
        money = new Money(amount, currency);
        return money;
    }

    public Money getMoney(){
        return money;
    }
}