package model;

import java.util.*;


public class Currency {
    private String name;
    private String shortName;
    private Map<String, Double> exchangeValues = new HashMap<>();
    public static final List<String> CURRENCY_NAMES = Arrays.asList(
            "US Dollar", "Euro", "British Pound", "Swiss Franc",
            "Chinese Yuan Renminbi", "Japanese Yen", "Russian Ruble",
            "Kazakhstani Tenge", "South African Rand", "Saudi Arabian Riyal",
            "Emirati Dirham", "Turkish Lira", "Indian Rupee", "Polish Zloty");


    public Currency(String nameValue, String shortNameValue) {
        this.name = nameValue;
        this.shortName = shortNameValue;
    }

    public Currency() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return this.shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Map<String, Double> getExchangeValues() {
        return this.exchangeValues;
    }

    public void setExchangeValues(String key, Double value) {
        this.exchangeValues.put(key, value);
    }

    /**
     *  Set values for a currency
     */
    public void initValues() {
        String currency = this.name;

        switch (currency) {
            case "US Dollar":
                this.exchangeValues.put("USD", 1.00);
                for (Map.Entry<String, Map<String, Double>> entry : Parser.getCurrencyMap().entrySet()) {
                    this.exchangeValues.putAll(entry.getValue());
                }
                break;
            case "Euro":
                this.exchangeValues.put("EUR", 1.00);
                parseAndFillMap("https://www.x-rates.com/table/?from=EUR&amount=1", this.exchangeValues);
                break;
            case "British Pound":
                this.exchangeValues.put("GBP", 1.00);
                parseAndFillMap("https://www.x-rates.com/table/?from=GBP&amount=1", this.exchangeValues);
                break;
            case "Swiss Franc":
                this.exchangeValues.put("CHF", 1.00);
                parseAndFillMap("https://www.x-rates.com/table/?from=CHF&amount=1", this.exchangeValues);
                break;
            case "Chinese Yuan Renminbi":
                this.exchangeValues.put("CNY", 1.00);
                parseAndFillMap("https://www.x-rates.com/table/?from=CNY&amount=1", this.exchangeValues);
                break;
            case "Japanese Yen":
                this.exchangeValues.put("JPY", 1.00);
                parseAndFillMap("https://www.x-rates.com/table/?from=JPY&amount=1", this.exchangeValues);
                break;
            case "Russian Ruble":
                this.exchangeValues.put("RUB", 1.00);
                parseAndFillMap("https://www.x-rates.com/table/?from=RUB&amount=1", this.exchangeValues);
                break;
            case "Kazakhstani Tenge":
                this.exchangeValues.put("KZT", 1.00);
                parseAndFillMap("https://www.x-rates.com/table/?from=KZT&amount=1", this.exchangeValues);
                break;
            case "South African Rand":
                this.exchangeValues.put("ZAR", 1.00);
                parseAndFillMap("https://www.x-rates.com/table/?from=ZAR&amount=1", this.exchangeValues);
                break;
            case "Saudi Arabian Riyal":
                this.exchangeValues.put("SAR", 1.00);
                parseAndFillMap("https://www.x-rates.com/table/?from=SAR&amount=1", this.exchangeValues);
                break;
            case "Emirati Dirham":
                this.exchangeValues.put("AED", 1.00);
                parseAndFillMap("https://www.x-rates.com/table/?from=AED&amount=1", this.exchangeValues);
                break;
            case "Turkish Lira":
                this.exchangeValues.put("TRY", 1.00);
                parseAndFillMap("https://www.x-rates.com/table/?from=TRY&amount=1", this.exchangeValues);
                break;
            case "Indian Rupee":
                this.exchangeValues.put("INR", 1.00);
                parseAndFillMap("https://www.x-rates.com/table/?from=INR&amount=1", this.exchangeValues);
                break;
            case "Polish Zloty":
                this.exchangeValues.put("PLN", 1.00);
                parseAndFillMap("https://www.x-rates.com/table/?from=PLN&amount=1", this.exchangeValues);
                break;
        }
    }

    /**
     *  For helps init() method.
     *  Parses its own value for each currency
     * @param url   website url
     * @param map   map to fill out
     */
    private void parseAndFillMap(String url, Map<String, Double> map){
        Parser.init(url);
        for (Map.Entry<String, Map<String, Double>> entry : Parser.getCurrencyMap().entrySet()) {
            map.putAll(entry.getValue());
        }
    }

    /**
     *   Initialize currencies
     * @return list of currency
     */
    public List<Currency> initCurrencies() {
        List<Currency> currencies = new ArrayList<>();

        Parser.init("https://www.x-rates.com/table/?from=USD&amount=1");
        // there we add USD currency because when we parse site with Parser.init() method
        // return all currency without USD
        currencies.add(new Currency("US Dollar", "USD"));

        for (Map.Entry<String, Map<String, Double>> entry : Parser.getCurrencyMap().entrySet()) {
            for (Map.Entry<String, Double> subEntry : entry.getValue().entrySet()) {
                currencies.add(new Currency(entry.getKey(), subEntry.getKey()));
            }
        }

        for (int i = 0; i < currencies.size(); i++) {
            currencies.get(i).initValues();
        }

        return currencies;
    }

    /**
     *       Convert a currency to another
     * @param amount        how much to convert
     * @param exchangeValue  currency value
     * @return   convert result
     */
    public static Double convert(Double amount, Double exchangeValue) {
        double price;
        price = amount * exchangeValue;
        price = Math.round(price * 100d) / 100d;

        return price;
    }
}
