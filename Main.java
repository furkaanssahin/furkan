package Day2;

public class Main {

	
	//We simulated the course tab on the site (kodlama.io).

  public static void main(String[] args) {

	  Coursee course1 = new Coursee(
              "Yazýlým Geliþtirici Yetiþtirme Kampý(JAVA + REACT)", "Engin Demirog", "Ücretsiz", 8);
      
	  Coursee course2 = new Coursee(
              "Programlamaya Giriþ için Temel Kurs", "Engin Demirog", "Ücretsiz", 100);
      
      Coursee course3 = new Coursee(
              "Yazýlým Geliþtirici Yetiþtirme Kampý(C# + ANGULAR)", "Engin Demirog", "Free", 0);
      
      Coursee[] courses = {course1, course2, course3};

      CourseManagerr courseManager = new CourseManagerr();
      
      System.out.println("\n" + "Kodlama.io / Kurslar"+"\n");

      for (Coursee course : courses) {
          System.out.println("Course Name: " + course.courseName);
          System.out.println("Teacher: " + course.courseTeacher);
          System.out.println("Course Price: " + course.coursePrice);
          System.out.println("Completion Rate: " + "%" + course.completionRate);
          System.out.println("\n" + "------" + "\n");

      }


      for (Coursee courseInfo : courses) {
    	  
          courseManager.Registration(courseInfo);
          courseManager.Completion(courseInfo);
          System.out.println("\n" + "------" + "\n");
      }

  }

}
