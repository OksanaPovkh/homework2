package homework3.task1;

public class hikingCondition {




   public static void hikingCondition(boolean isWeekend, boolean isRainy, boolean isCanWalk) {
        if(isCanWalk && isWeekend) {
            System.out.println("Пошли гулять:");
        } else {
            if(isWeekend && isRainy) {
                System.out.println("Я занят сегодня ");

            } else if (isWeekend && isCanWalk ) {
                System.out.println("Пошли гулять !");
            }
        }
    }

}
