package ru.netology.stats;

public class StatsService {

    public long fullAmount(long[] sales) {
        long fullAmount = 0;
        for (long sale : sales) {
            fullAmount += sale;
        }
        return fullAmount;
    }

    public long averageAmount(long[] sales) {
        return fullAmount(sales) / sales.length;
    }

    public int monthMaxSum(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int monthMinSum(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[month]) {
                month = i;
            }
        }
        return month + 1;

    }

    public int monthBellowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageAmount(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int monthAboveAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageAmount(sales)) {
                counter++;
            }
        }
        return counter;
    }

}
