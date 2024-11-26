public class ExamChecking extends Thread {
    private static int Sheets = 500;
    private int range;

    public ExamChecking(int limit) {
        this.range = limit;
    }

    @Override
    public void run() {
        while (range > 0) {
            synchronized (ExamChecking.class) {
                if (Sheets <= 0) {
                    System.out.println(Thread.currentThread().getName() + ": Листы закончились ");
                    break;
                }
                Sheets--;
                range--;
                System.out.println(Thread.currentThread().getName() +
                        " проверил лист, сейчас время: " + new java.util.Date() +
                        ", и осталось " + Sheets + " листов");
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
