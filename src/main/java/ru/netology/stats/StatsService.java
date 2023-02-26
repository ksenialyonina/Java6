package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSales = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSales = totalSales + sales[i];
        }
        return totalSales;
    }

    public long averageSum(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int maxMonth(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minMonth(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthsMinSales(long[] sales) {
        int result = 0;
        for (long sale : sales) {
            if (sale < averageSum(sales)) {
                result++;
            }
        }
        return result;
    }

    public int monthsMaxSales(long[] sales) {
        int result = 0;
        for (long sale : sales) {
            if (sale > averageSum(sales)) {
                result++;
            }
        }
        return result;
    }

}
