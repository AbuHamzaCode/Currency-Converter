package model;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.*;

/**
 *  Class for parse currency website
 */
public class Parser {
    private static Map<String, Map<String, Double>> currencyMap = new LinkedHashMap<>();

    public static Map<String, Map<String, Double>> getCurrencyMap() {
        return currencyMap;
    }

    /**
     *   Use parseCurrency() method.
     *   fill map with:
     *   1. Currency full name
     *   2. Currency short name
     *   3. Currency value
     * @param url website path for parseCurrency() method
     */
    public static void init(String url) {
        Elements elements = parseCurrency(url);
        String key;
        String subKey;
        double value;
        for (Element element : elements) {
            key = element.selectFirst("td").text();
            for (String currency : Currency.CURRENCY_NAMES){
                if(key.contains(currency)){
                    subKey = element.select("a").attr("href");
                    subKey = subKey.substring(subKey.lastIndexOf("=") + 1);
                    value = Double.parseDouble(element.selectFirst("td[class=rtRates]").text());
                    currencyMap.put(key, new HashMap<>());
                    currencyMap.get(key).put(subKey, value);
                }
            }
        }
    }

    /**
     *   connect website and take necessary elements
     * @param url   website url
     * @return  all currency rates
     */
    private static Elements parseCurrency(String url) {
        Elements elements = null;
        try {
            elements = Jsoup.connect(url).get()
                    .select("div[class=wrapper]")
                    .select("div[class=grid clearfix]")
                    .select("div[id=content]")
                    .select("div[class=grid]")
                    .first()
                    .select("div[class=col2 pull-right module bottomMargin]")
                    .select("div[class=moduleContent]")
                    .select("table[class=tablesorter ratesTable]")
                    .select("tbody")
                    .select("tr");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return elements;
    }
}
