package com.example.webscrapingfl.scrapper;

import com.example.webscrapingfl.scrapper.entity.CurrencyName;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class ScrapperMain {
    public static void main(String[] args) throws IOException {

        String url = "https://www.bankofalbania.org/Tregjet/Kursi_zyrtar_i_kembimit/";

        Document doc = Jsoup.connect(url).get();

        Element title = doc.getElementsByClass("font-weight-normal").first();

        System.out.println(title.text());

        Element tbody = doc.getElementsByTag("tbody").first();

        Element time = doc.getElementsByTag("em").first();

        List<Element> alldata = tbody.getElementsByTag("tr");

        Element date = doc.getElementsByTag("b").first();

        System.out.println(date.text());

        List<CurrencyName> objects = new ArrayList<>();
        System.out.println(time.text());

        for(Element data: alldata){
            List<Element> attributes = data.getElementsByTag("td");
            CurrencyName currencyName = new CurrencyName(attributes.get(0).text()
                    ,attributes.get(1).text(),attributes.get(2).text(),attributes.get(3).text());

            objects.add(currencyName);
        }
        for(CurrencyName data: objects){
            System.out.println(data.getName());
            System.out.println(data.getValute());
            System.out.println(data.getValue());
            System.out.println(data.getRate());
        }



    }
}
