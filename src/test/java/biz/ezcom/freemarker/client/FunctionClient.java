package biz.ezcom.freemarker.client;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.xml.sax.SAXException;

import biz.ezcom.freemarker.pojo.User;
import biz.ezcom.freemarker.pojo.Username;
import freemarker.ext.dom.NodeModel;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class FunctionClient {
	private static Configuration config = new Configuration();

	@BeforeClass
	public static void beforeClass() {
		config.setClassForTemplateLoading(FunctionClient.class, "/function");
	}

//	@Test
	public void stringFunction() {
		try {
			Template template = config.getTemplate("StringFunction.ftl");
			Map<String, Object> rootMap = new HashMap<String, Object>();
			template.process(rootMap, new PrintWriter(System.out));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		}
	}

//	@Test
	public void numberFunction() {
		try {
			// config.setNumberFormat("number");//currency,percent
			Template template = config.getTemplate("NumberFunction.ftl");
			Map<String, Object> rootMap = new HashMap<String, Object>();
			template.process(rootMap, new PrintWriter(System.out));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		}
	}

//	@Test
	public void dateFunction() {
		try {
			// config.setDateFormat("yyyy-M-d");
			// config.setTimeFormat("H:mm:ss");
			// config.setDateTimeFormat("yyyy-M-d H:mm:ss");
			Template template = config.getTemplate("DateFunction.ftl");
			Map<String, Object> rootMap = new HashMap<String, Object>();
			Date birthday = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
					.parse("2001-02-03 04:05:06");
			rootMap.put("birthday", birthday);
			template.process(rootMap, new PrintWriter(System.out));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

//	@Test
	public void booleanFunction() {
		try {
			// config.setBooleanFormat("true,false");
			Template template = config.getTemplate("BooleanFunction.ftl");
			Map<String, Object> rootMap = new HashMap<String, Object>();
			template.process(rootMap, new PrintWriter(System.out));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		}
	}

//	@Test
	public void listFunction() {
		try {
			Template template = config.getTemplate("ListFunction.ftl");
			Map<String, Object> rootMap = new HashMap<String, Object>();
			List<String> usernames = new ArrayList<String>();
			usernames.add("Felix");
			usernames.add("Justin");
			usernames.add("Alice");
			rootMap.put("usernames", usernames);

			List<User> users = new ArrayList<User>();
			users.add(new User(1, new Username("Felix", "Zhang"), "hello"));
			users.add(new User(2, new Username("Justin", "Zhu"), "new"));
			users.add(new User(3, new Username("Alice", "Yuan"), "world"));
			rootMap.put("users", users);
			template.process(rootMap, new PrintWriter(System.out));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		}
	}

//	@Test
	public void mapFunction() {
		try {
			Template template = config.getTemplate("MapFunction.ftl");
			Map<String, Object> rootMap = new HashMap<String, Object>();
			Map<String, String> map = new HashMap<String, String>();
			map.put("1", "Felix");
			map.put("2", "Justin");
			map.put("3", "Alice");
			rootMap.put("map", map);
			template.process(rootMap, new PrintWriter(System.out));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void xmlFunction() {
		try {
			Template template = config.getTemplate("XmlFunction.ftl");
			Map<String, Object> rootMap = new HashMap<String, Object>();
			NodeModel nodeModel = NodeModel.parse(new File("src/test/resources/function/users.xml"));
			rootMap.put("doc", nodeModel);
			template.process(rootMap, new PrintWriter(System.out));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
	}

//	@Test
	public void otherFunction() {
		try {
			Template template = config.getTemplate("OtherFunction.ftl");
			Map<String, Object> rootMap = new HashMap<String, Object>();

			template.process(rootMap, new PrintWriter(System.out));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		}
	}
}
