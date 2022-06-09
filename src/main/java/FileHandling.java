import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import  java.io.File;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String folderName = sc.nextLine();
        String path = System.getProperty("user.home") + "\\Desktop\\" + folderName;
        File nwFile = new File(path);
        nwFile.mkdir();

        File html = new File(path+"\\"+"index.html");
        File css = new File(path+"\\"+"index.css");
        File script = new File(path+"\\"+"index.js");

        html.createNewFile();
        css.createNewFile();
        script.createNewFile();

        FileWriter fw= new FileWriter(html);
        String data = "<!DOCTYPE html>\\n<html lang=\\\"en\\\">\\n<head>\\n    <meta charset=\\\"UTF-8\\\">\\n    <meta name=\\\"viewport\\\" content=\\\"width=device-width, initial-scale=1.0\\\">\\n    <meta http-equiv=\\\"X-UA-Compatible\\\" content=\\\"ie=edge\\\">\\n    <link rel=\\\"stylesheet\\\" href=\\\"style.css\\\">\\n    <title>Document</title>\\n</head>\\n<body>\\n    \\n    <script src=\\\"script.js\\\"></script>\\n</body>\\n</html>";
        fw.write(data);
        fw.close();

        fw = new FileWriter(css);
        data="*{\\n    margin: 0;\\n    padding: 0;\\n    box-sizing: border-box;\\n}\\nhtml,body{\\n    width: 100%;\\n    height: 100%;\\n}";
        fw.write(data);
        fw.close();
    }
}
