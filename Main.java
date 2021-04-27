package Day2;

public class Main {

	
	//We simulated the course tab on the site (kodlama.io).

  public static void main(String[] args) {

	  Coursee course1 = new Coursee(
              "Yaz�l�m Geli�tirici Yeti�tirme Kamp�(JAVA + REACT)", "Engin Demirog", "�cretsiz", 8);
      
	  Coursee course2 = new Coursee(
              "Programlamaya Giri� i�in Temel Kurs", "Engin Demirog", "�cretsiz", 100);
      
      Coursee course3 = new Coursee(
              "Yaz�l�m Geli�tirici Yeti�tirme Kamp�(C# + ANGULAR)", "Engin Demirog", "Free", 0);
      
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
