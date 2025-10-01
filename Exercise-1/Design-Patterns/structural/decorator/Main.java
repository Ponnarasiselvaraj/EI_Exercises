package structural.decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Online-Proctoring System (Decorator Pattern) ===");
        OnlineExam exam = new BaseExam();
        exam = new TimeLimitDecorator(exam, 60);
        exam = new NegativeMarkingDecorator(exam, 2.5);
        exam = new ProctoringDecorator(exam);
        System.out.println(exam.details());
        System.out.println("Final score: " + exam.score(90));
    }
}
