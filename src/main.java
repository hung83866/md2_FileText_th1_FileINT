import java.io.*;

public class main {
    public static void main(String[] args) throws IOException {

        //TÍNH TỔNG TRONG FILE SỐ NGUYÊN CHO TRƯỚC

        File file = new File("File int");   //tạo file
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        InputStream inputStream = new FileInputStream(file);    //tạo dòng file
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);    //tạo đối tượng đọc file vs dòng trên
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);    //tạo bộ đệm file
        int sum = 0;
        String[] arr = new String[5];
        int i =0;
        String line = "";
       while ((line= bufferedReader.readLine())!=null){
//           System.out.println(line);
           arr[i++]=line;
           sum+=Integer.parseInt(line);
       }

       // IN DƯ LIỆU RA FILE KHÁC



        System.out.println("total = "+sum);
       File file1 = new File("nonono");   //tạo file nhận dữ liệu
       OutputStream outputStream = new FileOutputStream(file1);   // tạo dòng output
       OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);  //tạo đối tượng viết
        for (String a: arr) {
            outputStreamWriter.write(a);
            outputStreamWriter.write("\n");
            outputStreamWriter.flush();
        }
    }
}
