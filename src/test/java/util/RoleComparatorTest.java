package util;

import model.Persons;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoleComparatorTest {

    RoleComparator compare = new RoleComparator();

    @Test
    void compareEqualRoles() {

        Persons teacher1 = new Persons("Getting rich", "Teacher", 2);
        Persons teacher2 = new Persons("Getting rich", "Teacher", 2);

        assertEquals(0,compare.compare(teacher1, teacher2));

    }

    @Test
    void testIfTeacherComesBeforeOthers() {

        Persons seniorStudent = new Persons("Getting rich", "Senior Student", 2);
        Persons teacher = new Persons("Getting rich", "Teacher", 2);
        Persons juniorStudent = new Persons("Getting rich", "Junior Student", 2);

        assertEquals(-1, compare.compare(teacher,seniorStudent));
        assertEquals(-1, compare.compare(teacher,juniorStudent));

    }

    @Test
    void testIfSeniorStudentComesBeforeJunior() {
        Persons seniorStudent = new Persons("Getting rich", "Senior Student", 2);
        Persons juniorStudent = new Persons("Getting rich", "Junior Student", 2);

        assertEquals(-1,compare.compare(seniorStudent,juniorStudent));
    }

    @Test
    void testJuniorStudentComesLast(){
        Persons seniorStudent = new Persons("Getting rich", "Senior Student", 2);
        Persons juniorStudent = new Persons("Getting rich", "Junior Student", 2);
        Persons teacher = new Persons("Getting rich", "Teacher", 2);

        assertEquals(1,compare.compare(juniorStudent,teacher));
        assertEquals(1,compare.compare(juniorStudent,seniorStudent));
    }

}