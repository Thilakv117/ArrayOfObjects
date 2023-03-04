class Students
{
    int rollNum;
    String Name;
    int marks;
}
class Main
{
    public static void main(String args[])
    {
        Students s1 = new Students();
        Students s2 = new Students();
        Students s3 = new Students();

        Students arr[] = new Students[3];
        s1.rollNum = 1000;
        s1.Name = " Sakthi ";
        s1.marks = 88;
        s2.rollNum = 1001;
        s2.Name = " Thilak ";
        s2.marks = 99;
        s3.rollNum = 1002;
        s3.Name = " Velu";
        s3.marks = 77;
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
       for(int i = 0 ; i< arr.length;i++)
       {
           System.out.println("Students Roll Num is: " + arr[i].rollNum + " ");

           System.out.println("Students Names are: " + arr[i].Name + " ");

           System.out.println("Students Marks are: " + arr[i].marks+ " ");
       }
    }

}