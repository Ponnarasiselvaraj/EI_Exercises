package exercise1.structural.decorator;

public class TimeLimitDecorator extends ExamDecorator {
    private final int minutes;
    public TimeLimitDecorator(OnlineExam exam, int minutes) {
        super(exam);
        this.minutes = minutes;
    }
    @Override
    public String details() {
        return exam.details() + " + TimeLimit(" + minutes + "m)";
    }
}