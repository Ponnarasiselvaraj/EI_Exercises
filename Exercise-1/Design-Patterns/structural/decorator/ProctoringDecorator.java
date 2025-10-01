package exercise1.structural.decorator;

public class ProctoringDecorator extends ExamDecorator {
    public ProctoringDecorator(OnlineExam exam) {
        super(exam);
    }
    @Override
    public String details() {
        return exam.details() + " + Proctoring";
    }
}