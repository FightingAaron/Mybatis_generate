package generator;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * ���򹤳̡�ͨ�����ݿ⣬���� POJO��Mapper�ӿں�Mapperӳ��
 * @author cyh
 *
 */

public class Generator {
    public static void main(String[] arhs) throws Exception{
    	System.out.println("���򹤳̿�ʼ��������");
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        String generatorUrl=Generator.class.getClassLoader().getResource("generator.xml").getFile();
        File configFile = new File(generatorUrl);
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
        System.out.println("���򹤳̽�����������");
    }
}