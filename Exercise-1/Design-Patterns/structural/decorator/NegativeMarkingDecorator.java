package exercise1.structural.decorator;

public class NegativeMarkingDecorator extends ExamDecorator {
    private final double penalty;
    public NegativeMarkingDecorator(OnlineExam exam, double penalty) {
        super(exam);
        this.penalty = penalty;
    }
    @Override
    public String details() {
        return exam.details() + " + NegativeMarking(" + penalty + ")";
    }
    @Override
    public double score(double baseScore) {
        return super.score(baseScore) - penalty;
    }
}