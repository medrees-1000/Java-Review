package edu.cuny.citytech.cst.gpa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class T1_GPA {

	@Test
    @DisplayName("D is 60 - 74.9%")
    public void t1() {
        GPA.Score score = GPA.calculateGrade(60);
        String expected = "D";
        String actual = score.letterGrade();
        assertEquals(expected, actual);
    }
    
    @Test
    @DisplayName("B is 83 - 86.9%")
    public void t2() {
        GPA.Score score = GPA.calculateGrade(84);
        String expected = "B";
        String actual = score.letterGrade();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("A is 93 - 100%")
    public void t3() {
        GPA.Score score = GPA.calculateGrade(95);
        String expected = "A";
        String actual = score.letterGrade();
        assertEquals(expected, actual);
    }

    @Test 
    @DisplayName("C is 75 - 76.9%")
    public void t4() {
        GPA.Score score = GPA.calculateGrade(75);
        float expected = 2.0f;
        float actual = score.gpa();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("A- is 90 - 92.9%")
    public void t5() {
        GPA.Score score = GPA.calculateGrade(91);
        String expected = "A-";
        String actual = score.letterGrade();
        assertEquals(expected, actual);
        
        float expectedGpa = 3.7f;
        float actualGpa = score.gpa();
        assertEquals(expectedGpa, actualGpa);
    }

    @Test
    @DisplayName("B+ is 87 - 89.9%")
    public void t6() {
        GPA.Score score = GPA.calculateGrade(88);
        String expected = "B+";
        String actual = score.letterGrade();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("B- is 80 - 82.9%")
    public void t7() {
        GPA.Score score = GPA.calculateGrade(81);
        String expected = "B-";
        String actual = score.letterGrade();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("C+ is 77 - 79.9%")
    public void t8() {
        GPA.Score score = GPA.calculateGrade(78);
        String expected = "C+";
        String actual = score.letterGrade();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Below 60 is F")
    public void t9() {
        GPA.Score score = GPA.calculateGrade(55);
        String expected = "F";
        String actual = score.letterGrade();
        assertEquals(expected, actual);
    }
}
