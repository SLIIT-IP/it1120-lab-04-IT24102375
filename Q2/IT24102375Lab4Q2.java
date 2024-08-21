import java.util.Scanner;
public class IT24102375Lab4Q2{
public static void main(String[] args){
Scanner r=new Scanner(System.in);
System.out.println("enter the exam marks out of 100");
double exam_mark=r.nextDouble();
System.out.println("enter the labs marks out of 100");
double lab_mark=r.nextDouble();
if((exam_mark>=0 && exam_mark<=100)&&(lab_mark>=0 &&  lab_mark<=100)){
System.out.println("enter the percentage for exam mark");
double pexam_mark=r.nextDouble();
System.out.println("enter the percentage for lab mark");
double plab_mark=r.nextDouble();
if((plab_mark+pexam_mark)==100){
double tlab_mark=lab_mark*plab_mark/100;
double texam_mark=exam_mark*pexam_mark/100;
double fmarks= texam_mark+ tlab_mark;
System.out.println("total marks are "+fmarks);
}
else
 System.out.println("invaild percentages");
}

else
System.out.println("enter marks are invalid");





}
}
