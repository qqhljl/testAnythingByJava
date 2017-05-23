package makedir;

import java.io.File;

public class MakeDir {
	public static void main(String [] args){  
        String filePath = "d:/test1/test2/test3/创建目录";  
        File fp = new File(filePath);  
        // 创建目录  
        if (!fp.exists()) {  
            fp.mkdirs();// 目录不存在的情况下，创建目录。  
        }  
        System.out.println("执行结束"+filePath);  
    } 
}
