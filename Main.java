public class Main {
    public static void main(String[] args) {
        ExamChecking A = new ExamChecking(6);
        ExamChecking B = new ExamChecking(4);
        A.setName("Jordan");
        B.setName("Lim");
        A.setPriority(Thread.MAX_PRIORITY);
        B.setPriority(Thread.MIN_PRIORITY);
        A.start();
        B.start();
    }
}
