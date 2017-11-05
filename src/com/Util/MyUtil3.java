package com.Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

/*
 * java读取docx文件内容
 */
public final class MyUtil3 {
	
	// 工具类中的方法都是静态方式访问的因此将构造器私有不允许创建对象(绝对好习惯)
	//lib文件夹中的jar包都是这里用的
	private MyUtil3() {
        throw new AssertionError();
    }
	
	public static String javaReadDocx() throws IOException {
        File file = new File("D:/Documents/Desktop/test.docx");
        try {
            FileInputStream fis = new FileInputStream(file);
            XWPFDocument xdoc = new XWPFDocument(fis);
            @SuppressWarnings("resource")
			XWPFWordExtractor extractor = new XWPFWordExtractor(xdoc);
            String doc1 = extractor.getText();
            fis.close();
            return doc1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
	public static void main(String[] args) throws IOException {
		 String string = MyUtil3.javaReadDocx();
		 System.out.println(string);
	}
}
