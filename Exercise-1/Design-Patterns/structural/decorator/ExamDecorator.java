package structural.decorator;

public abstract class ExamDecorator implements OnlineExam {
    protected final OnlineExam exam;
    public ExamDecorator(OnlineExam exam) {
        this.exam = exam;
    }
    @Override
    public String details() {
        return exam.details();
    }
    @Override
    public double score(double baseScore) {
        return exam.score(baseScore);
    }
}
