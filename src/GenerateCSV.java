import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class GenerateCSV {
    public static void main(String[] args) {
        //String customFilePath = "/Users/bigfish/Documents/个人文件/output.csv"; // 自定义文件路径
        String csvData = "02702880,000051911061940,202405,20240315,20240201,right-c4@mail.co.jp,佐藤 桜,株式会社ライトカンパニー４"; // CSV数据
        int numberOfRows = 9999999; // 行数

        try {
            Path filePath = Path.of(customFilePath);
            BufferedWriter writer = Files.newBufferedWriter(filePath, StandardOpenOption.CREATE, StandardOpenOption.WRITE);

            for (int i = 0; i < numberOfRows; i++) {
                writer.write(csvData);
                writer.newLine();
            }

            writer.close();
            System.out.println("CSV文件已生成：" + customFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
