package com.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class FileReaderExample {
    public static void main(final String args[]) throws IOException, ParseException {

        try {
            final List<String> listTrade = Files.readAllLines(Paths
                    .get("C:\\AGS_PROJECTS\\ORBIT_PROJECT\\ORBIT_WORKSPACE\\Java_practice\\src\\resources\\trad.txt"));

            final List<Trade> listOfTrade = new ArrayList<Trade>();

            for (final String stock : listTrade) {
                final Trade td = new Trade();
                final String[] str = stock.split(" ");
                td.setTradeName(str[0]);
                td.setQuantity(Integer.parseInt(str[2]));
                // date formateer
                final SimpleDateFormat ft = new SimpleDateFormat("MM-YYYY");
                final SimpleDateFormat sft = new SimpleDateFormat("DD-MM-YYYY");
                final java.util.Date date = sft.parse(str[1]);
                final String month = ft.format(date);
                td.setDateOfPurchase(month);
                listOfTrade.add(td);
            }
            // lamda
            listOfTrade.sort((final Trade o1, final Trade o2) -> o1.getQuantity() - o2.getQuantity());
            listOfTrade.forEach((trade) -> System.out.println(trade.getDateOfPurchase() + " " + trade.getQuantity()));
            // listOfTrade.forEach(System.out::println);

        } catch (final Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("final");
        }

    }

}
