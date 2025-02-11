package com.mentoring.sc.homework2.cycleHomework;
/*
Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
300$ в месяц Ваня тратит на еду и развлечения.
10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 */

public class Task3 {

    private static final double START_SALARY = 600.0;
    private static final double INCREASE_SALARY = 400.0;
    private static final double PERCENT = 0.02;
    private static final double INVEST_PERCENT = 0.10;
    private static final double EXPENDITURE = 300.0;
    private static final int PERIOD = 38;


    public static void main(String[] args) {
        System.out.println(Math.round(calculator()));
    }

    private static double calculator() {
        double salary = START_SALARY;
        double result = 0;
        double forInvest = 0;
        for (int month = 1; month <= PERIOD; month++) {
            if (month % 6 == 0)
                salary += INCREASE_SALARY;
            result += profit(salary, forInvest);
            forInvest = getInevstPercent(INVEST_PERCENT * salary);
            if (month == PERIOD)
                result += forInvest;
        }
        return result;
    }

    private static double getInevstPercent(double sum) {
        return sum * (PERCENT + 1);
    }

    private static double profit(double salary, double forInvest) {
        return salary - INVEST_PERCENT * salary - EXPENDITURE + forInvest;
    }
}
