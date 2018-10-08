package com.fxust;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.*;

import java.io.FileInputStream;

/**
 * Hello world!
 *
 */
public class App{

//    private static Logger logger= LogManager.getLogger(App.class);
    public static void main( String[] args ){
        try {
            System.setProperty("log4fFile","hlj.csv");
            System.setProperty("log4fFileLog","hljLog.log");
            //绝对路径的加载
            ConfigurationSource  source = new ConfigurationSource(new FileInputStream("D:\\github_workspace\\log4j2\\src\\main\\java\\com\\fxust\\config\\log4j2-demo.xml"));
            Configurator.initialize(null, source);

        }catch (Exception e){

        }

//        test1();
        test2();
    }

    public static void test1(){
        Logger logger= LogManager.getLogger(App.class);
        System.out.println( "Hello World!" );

        logger.error("你好！！");
        logger.info("上海！！");
    }

    public static void test2(){
        Logger logger= LogManager.getLogger("MyFile");

        for (int i = 0 ; i < 10 ; i++){
//            logger.error("MyFile 你好！！");
            logger.info("MyFile 上海！！");
        }


        test3();
    }

    public static void test3(){
        Logger logger1= LogManager.getLogger("logFile");

        for (int i = 0 ; i < 10 ; i++){
//            logger.error("logFile 加我搜的厚爱几号的");
            logger1.info("logFile 空间完全偶然间例如【 ！！");
        }
    }
}
