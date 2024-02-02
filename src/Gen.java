import java.util.Calendar;

public class Gen {
    public static void main(String[] args) {
        // 获取当前日期
        Calendar calendar = Calendar.getInstance();

        // 将日期移到下个月
        calendar.add(Calendar.MONTH, 1);

        // 将日期设置为下个月的第一天
        calendar.set(Calendar.DAY_OF_MONTH, 1);

        // 将日期减去一天以获取下个月的最后一天
        calendar.add(Calendar.DATE, -1);

        // 获取下个月的最后一天日期
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // 月份是从0开始计数，所以需要加1
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        // 打印下个月的最后一天日期
        System.out.println("下个月的最后一天日期是：" + year + "-" + month + "-" + day);

        String a =  "    ";
        if (a == null || a.trim().equals("")) {
            System.out.println("ggss");

        }
    }
}