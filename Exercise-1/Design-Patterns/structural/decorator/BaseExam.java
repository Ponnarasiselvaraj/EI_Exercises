package structural.decorator;

public class BaseExam implements OnlineExam {
    @Override
    public String details() {
        return "Base Exam";
    }
    @Override
    public double score(double baseScore) {
        return baseScore;
    }
}
