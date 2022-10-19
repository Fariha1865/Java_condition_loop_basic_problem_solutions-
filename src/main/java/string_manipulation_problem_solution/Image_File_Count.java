/*Find out how many images are in the given array:
        Input: ["photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"]
        Output: 3*/


package string_manipulation_problem_solution;

public class Image_File_Count {
    public static void main(String[] args) {
        String[] files = {"photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"};
        int count = 0;
        for(int i=0;i<files.length;i++)
        {
            String s = files[i];
            if(s.contains(".jpg") || s.contains(".png") || s.contains(".jpeg"))
            {
                count++;
            }
        }
        System.out.println("Total count of Images: "+count);
    }
}
