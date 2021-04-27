package Day2;

public class CourseManagerr {

    public void Registration(Coursee course) {
        System.out.println("You attended  " + course.courseName + " course.");
    }

    public void Completion(Coursee course) {
        if (course.completionRate == 100){
            System.out.println("You have completed " + course.courseName + " course!");
        }

        else {
            System.out.println("You haven't completed. For this " + course.courseName + " course, you need to keep studying!");
        }
    }
}
