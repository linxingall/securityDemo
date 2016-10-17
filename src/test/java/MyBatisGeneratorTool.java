import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
* @ClassName: MyBatisGeneratorTool 
* @Description: TODO(dao成代码生成) 
* @author unknown
* @date 2016年6月29日 下午3:10:02 
*
 */
public class MyBatisGeneratorTool {
	public static void main(String[] args) {
		try {
			List<String> warnings = new ArrayList<String>();
			boolean overwrite = true;
			String genCfg = "/generatorConfig.xml"; // src的一级目录下
			File configFile = new File(MyBatisGeneratorTool.class.getResource(genCfg).getFile());
			ConfigurationParser cp = new ConfigurationParser(warnings);
			Configuration config = null;
			try {
				config = cp.parseConfiguration(configFile);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (XMLParserException e) {
				e.printStackTrace();
			}
			DefaultShellCallback callback = new DefaultShellCallback(overwrite);
			MyBatisGenerator myBatisGenerator = null;
			myBatisGenerator = new MyBatisGenerator(config, callback, warnings);

			myBatisGenerator.generate(null);
			
			System.out.println("success!!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}