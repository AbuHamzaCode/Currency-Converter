import junit.framework.TestCase;
import model.Currency;
import window.MainWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainWindowTest extends TestCase {

    Map<String, Double> exchangeValues;
    List<Currency> currencies;
    Currency currency;

    @Override
    protected void setUp() throws Exception {
        currencies = new ArrayList<>();
        exchangeValues = new HashMap<>();
        currency = new Currency();

        currencies.add(new Currency("Polish Zloty", "PLN"));
        currencies.add(new Currency("Indian Rupee", "INR"));
        currencies.add(new Currency("Turkish Lira", "TRY"));
        currencies.add(new Currency("Emirati Dirham", "AED"));
        currencies.add(new Currency("Saudi Arabian Riyal", "SAR"));
        currencies.add(new Currency("South African Rand", "ZAR"));
        currencies.add(new Currency("Kazakhstani Tenge", "KZT"));
        currencies.add(new Currency("Russian Ruble", "RUB"));
        currencies.add(new Currency("Japanese Yen", "JPY"));
        currencies.add(new Currency("Chinese Yuan Renminbi", "CNY"));
        currencies.add(new Currency("Swiss Franc", "CHF"));
        currencies.add(new Currency("British Pound", "GBP"));
        currencies.add(new Currency("Euro", "EUR"));
        currencies.add(new Currency("US Dollar", "USD"));

        for (int i = 0; i < currencies.size(); i++){
            switch (currencies.get(i).getName()){
                case "Polish Zloty":
                    exchangeValues.put("PLN", 1.00);
                    exchangeValues.put("INR", 17.910858);
                    exchangeValues.put("TRY", 3.482307);
                    exchangeValues.put("AED", 0.862362);
                    exchangeValues.put("SAR", 0.88056);
                    exchangeValues.put("ZAR", 3.41754);
                    exchangeValues.put("KZT", 115.495163);
                    exchangeValues.put("RUB", 23.95115);
                    exchangeValues.put("JPY", 28.625926);
                    exchangeValues.put("CNY", 1.494903);
                    exchangeValues.put("CHF", 0.218221);
                    exchangeValues.put("GBP", 0.17802);
                    exchangeValues.put("EUR", 0.214488);
                    exchangeValues.put("USD", 0.234816);
                    break;
                case "Indian Rupee":
                    exchangeValues.put("INR", 1.00);
                    exchangeValues.put("PLN", 0.55832);
                    exchangeValues.put("TRY", 0.194424);
                    exchangeValues.put("AED", 0.048147);
                    exchangeValues.put("SAR", 0.049163);
                    exchangeValues.put("ZAR", 0.19080);
                    exchangeValues.put("KZT", 6.448332);
                    exchangeValues.put("RUB", 1.337242);
                    exchangeValues.put("JPY", 1.598244);
                    exchangeValues.put("CNY", 0.083464);
                    exchangeValues.put("CHF", 0.012183);
                    exchangeValues.put("GBP", 0.009939);
                    exchangeValues.put("EUR", 0.011979);
                    exchangeValues.put("USD", 0.01311);
                    break;
                case "Turkish Lira":
                    exchangeValues.put("TRY", 1.00);
                    exchangeValues.put("PLN", 0.287166);
                    exchangeValues.put("INR", 5.143389);
                    exchangeValues.put("AED", 0.247641);
                    exchangeValues.put("SAR", 0.252867);
                    exchangeValues.put("ZAR", 0.9814);
                    exchangeValues.put("KZT", 33.16628);
                    exchangeValues.put("RUB", 6.877955);
                    exchangeValues.put("JPY", 8.220392);
                    exchangeValues.put("CNY", 0.429286);
                    exchangeValues.put("CHF", 0.062664);
                    exchangeValues.put("GBP", 0.051121);
                    exchangeValues.put("EUR", 0.061594);
                    exchangeValues.put("USD", 0.067431);
                    break;
                case "Emirati Dirham":
                    exchangeValues.put("AED", 1.00);
                    exchangeValues.put("PLN", 1.159606);
                    exchangeValues.put("INR", 20.769548);
                    exchangeValues.put("TRY", 4.038106);
                    exchangeValues.put("SAR", 1.021103);
                    exchangeValues.put("ZAR", 3.962997);
                    exchangeValues.put("KZT", 133.928941);
                    exchangeValues.put("RUB", 27.773909);
                    exchangeValues.put("JPY", 33.19481);
                    exchangeValues.put("CNY", 1.733497);
                    exchangeValues.put("CHF", 0.253045);
                    exchangeValues.put("GBP", 0.206433);
                    exchangeValues.put("EUR", 0.248722);
                    exchangeValues.put("USD", 0.272294);
                    break;
                case "Saudi Arabian Riyal":
                    exchangeValues.put("SAR", 1.00);
                    exchangeValues.put("PLN", 1.135641);
                    exchangeValues.put("INR", 20.34031);
                    exchangeValues.put("TRY", 3.954651);
                    exchangeValues.put("AED", 0.979333);
                    exchangeValues.put("ZAR", 3.881095);
                    exchangeValues.put("KZT", 131.161077);
                    exchangeValues.put("RUB", 27.199915);
                    exchangeValues.put("JPY", 32.507524);
                    exchangeValues.put("CNY", 1.697671);
                    exchangeValues.put("CHF", 0.247815);
                    exchangeValues.put("GBP", 0.202167);
                    exchangeValues.put("EUR", 0.24364);
                    exchangeValues.put("USD", 0.266667);
                    break;
                case "South African Rand":
                    exchangeValues.put("ZAR", 1.00);
                    exchangeValues.put("PLN", 0.292608);
                    exchangeValues.put("INR", 5.240869);
                    exchangeValues.put("TRY", 1.018952);
                    exchangeValues.put("AED", 0.252334);
                    exchangeValues.put("SAR", 0.257659);
                    exchangeValues.put("KZT", 33.794862);
                    exchangeValues.put("RUB", 7.008309);
                    exchangeValues.put("JPY", 8.375864);
                    exchangeValues.put("CNY", 0.437421);
                    exchangeValues.put("CHF", 0.063852);
                    exchangeValues.put("GBP", 0.05209);
                    exchangeValues.put("EUR", 0.062776);
                    exchangeValues.put("USD", 0.068709);
                    break;
                case "Kazakhstani Tenge":
                    exchangeValues.put("KZT", 1.00);
                    exchangeValues.put("PLN", 0.008658);
                    exchangeValues.put("INR", 0.155079);
                    exchangeValues.put("TRY", 0.030151);
                    exchangeValues.put("AED", 0.007467);
                    exchangeValues.put("SAR", 0.007624);
                    exchangeValues.put("ZAR", 0.02959);
                    exchangeValues.put("RUB", 0.207378);
                    exchangeValues.put("JPY", 0.247844);
                    exchangeValues.put("CNY", 0.012943);
                    exchangeValues.put("CHF", 0.001889);
                    exchangeValues.put("GBP", 0.001541);
                    exchangeValues.put("EUR", 0.001858);
                    exchangeValues.put("USD", 0.002033);
                    break;
                case "Russian Ruble":
                    exchangeValues.put("RUB", 1.00);
                    exchangeValues.put("PLN", 0.041752);
                    exchangeValues.put("INR", 0.747808);
                    exchangeValues.put("TRY", 0.145392);
                    exchangeValues.put("AED", 0.036005);
                    exchangeValues.put("SAR", 0.036765);
                    exchangeValues.put("ZAR", 0.142688);
                    exchangeValues.put("KZT", 4.822113);
                    exchangeValues.put("JPY", 1.195133);
                    exchangeValues.put("CNY", 0.062415);
                    exchangeValues.put("CHF", 0.009111);
                    exchangeValues.put("GBP", 0.007433);
                    exchangeValues.put("EUR", 0.008957);
                    exchangeValues.put("USD", 0.009804);
                    break;
                case "Japanese Yen":
                    exchangeValues.put("JPY", 1.00);
                    exchangeValues.put("PLN", 0.034935);
                    exchangeValues.put("INR", 0.625711);
                    exchangeValues.put("TRY", 0.121653);
                    exchangeValues.put("AED", 0.030126);
                    exchangeValues.put("SAR", 0.030762);
                    exchangeValues.put("ZAR", 0.119391);
                    exchangeValues.put("KZT", 4.034791);
                    exchangeValues.put("RUB", 0.836727);
                    exchangeValues.put("CNY", 0.052224);
                    exchangeValues.put("CHF", 0.007623);
                    exchangeValues.put("GBP", 0.006219);
                    exchangeValues.put("EUR", 0.007495);
                    exchangeValues.put("USD", 0.008203);
                    break;
                case "Chinese Yuan Renminbi":
                    exchangeValues.put("CNY", 1.00);
                    exchangeValues.put("PLN", 0.668941);
                    exchangeValues.put("INR", 11.981303);
                    exchangeValues.put("TRY", 2.329457);
                    exchangeValues.put("AED", 0.576869);
                    exchangeValues.put("SAR", 0.589042);
                    exchangeValues.put("ZAR", 2.286129);
                    exchangeValues.put("KZT", 77.259418);
                    exchangeValues.put("RUB", 16.0219);
                    exchangeValues.put("JPY", 19.148306);
                    exchangeValues.put("CHF", 0.145974);
                    exchangeValues.put("GBP", 0.119085);
                    exchangeValues.put("EUR", 0.143514);
                    exchangeValues.put("USD", 0.157078);
                    break;
                case "Swiss Franc":
                    exchangeValues.put("CHF", 1.00);
                    exchangeValues.put("PLN", 4.582609);
                    exchangeValues.put("INR", 82.078468);
                    exchangeValues.put("TRY", 15.958052);
                    exchangeValues.put("AED", 3.951866);
                    exchangeValues.put("SAR", 4.035261);
                    exchangeValues.put("ZAR", 15.661233);
                    exchangeValues.put("KZT", 529.269218);
                    exchangeValues.put("RUB", 109.758766);
                    exchangeValues.put("JPY", 131.176355);
                    exchangeValues.put("CNY", 6.850546);
                    exchangeValues.put("GBP", 0.815796);
                    exchangeValues.put("EUR", 0.983149);
                    exchangeValues.put("USD", 1.07607);
                    break;
                case "British Pound":
                    exchangeValues.put("GBP", 1.00);
                    exchangeValues.put("PLN", 5.617349);
                    exchangeValues.put("INR", 100.61155);
                    exchangeValues.put("TRY", 19.561334);
                    exchangeValues.put("AED", 4.844186);
                    exchangeValues.put("SAR", 4.946412);
                    exchangeValues.put("ZAR", 19.197495);
                    exchangeValues.put("KZT", 648.776686);
                    exchangeValues.put("RUB", 134.541979);
                    exchangeValues.put("JPY", 160.795599);
                    exchangeValues.put("CNY", 8.39738);
                    exchangeValues.put("CHF", 1.225797);
                    exchangeValues.put("EUR", 1.205141);
                    exchangeValues.put("USD", 1.319043);
                    break;
                case "Euro":
                    exchangeValues.put("EUR", 1.00);
                    exchangeValues.put("PLN", 4.661154);
                    exchangeValues.put("INR", 83.485261);
                    exchangeValues.put("TRY", 16.231567);
                    exchangeValues.put("AED", 4.019599);
                    exchangeValues.put("SAR", 4.104424);
                    exchangeValues.put("ZAR", 15.929661);
                    exchangeValues.put("KZT", 538.340688);
                    exchangeValues.put("RUB", 111.639988);
                    exchangeValues.put("JPY", 133.424667);
                    exchangeValues.put("CNY", 6.967962);
                    exchangeValues.put("CHF", 1.01714);
                    exchangeValues.put("GBP", 0.829778);
                    exchangeValues.put("USD", 1.094513);
                    break;
                case "US Dollar":
                    exchangeValues.put("USD", 1.00);
                    exchangeValues.put("PLN", 4.258655);
                    exchangeValues.put("INR", 76.276164);
                    exchangeValues.put("TRY", 14.829943);
                    exchangeValues.put("AED", 3.6725);
                    exchangeValues.put("SAR", 3.75);
                    exchangeValues.put("ZAR", 14.554107);
                    exchangeValues.put("KZT", 491.854038);
                    exchangeValues.put("RUB", 101.999682);
                    exchangeValues.put("JPY", 121.903216);
                    exchangeValues.put("CNY", 6.366266);
                    exchangeValues.put("CHF", 0.929308);
                    exchangeValues.put("GBP", 0.758125);
                    exchangeValues.put("EUR", 0.913648);
                    break;
            }
        }

        for (int i = 0; i < currencies.size(); i++) {
            for (Map.Entry<String, Double> entry : exchangeValues.entrySet()) {
                currencies.get(i).setExchangeValues(entry.getKey(), entry.getValue());
            }
        }
    }

    public void testConvert(){
        String currency1 = currencies.get(5).getName();
        String currency2 = currencies.get(10).getName();
        double amount = 100.0;
        String shortNameCurrency2 = null;
        Double exchangeValue;

        Double actual = MainWindow.convert(currency1, currency2, currencies, amount);
        Double excepted = 0.0;

        for (Currency currency : currencies){
            if (currency.getName().equals(currency2)){
                shortNameCurrency2 = currency.getShortName();
                break;
            }
        }
        if (shortNameCurrency2 != null){
            for (Currency currency : currencies){
                if (currency.getName().equals(currency1)){
                    exchangeValue = currency.getExchangeValues().get(shortNameCurrency2);
                    excepted = Currency.convert(amount, exchangeValue);
                    break;
                }
            }
        }

        assertEquals(excepted, actual);

    }
}
