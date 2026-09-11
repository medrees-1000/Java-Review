package edu.cuny.citytech.cst.gpa;

public class GPA {
	
	// 93-100% A 4.0

	public record Score(float range1, float range2, String letterGrade, float gpa) {}

    public static Score calculateGrade(float score) {
        if (score >= 93) {
            return new Score(93, 100, "A", 4.0f);
        } else if (score >= 90) {
            return new Score(90, 92.9f, "A-", 3.7f);
        } else if (score >= 87) {
            return new Score(87, 89.9f, "B+", 3.3f);
        } else if (score >= 83) {
            return new Score(83, 86.9f, "B", 3.0f);
        } else if (score >= 80) {
            return new Score(80, 82.9f, "B-", 2.7f);
        } else if (score >= 77) {
            return new Score(77, 79.9f, "C+", 2.3f);
        } else if (score >= 75) {
            return new Score(75, 76.9f, "C", 2.0f);
        } else if (score >= 60) {
            return new Score(60, 74.9f, "D", 1.0f);
        } else {
            return new Score(0, 59.9f, "F", 0.0f);
        }
    }
    
}
