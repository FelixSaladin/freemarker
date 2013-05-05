package biz.ezcom.freemarker.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.BeforeClass;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class OrderClient {
    private static Configuration config = new Configuration();

    @BeforeClass
    public static void beforeClass() {
        config.setClassForTemplateLoading(OrderClient.class, "/order");
    }
//    @Test
    public void ifElseOrder() {
        try {
            Template template = config.getTemplate("IfElseOrder.ftl");
            Map<String, Object> rootMap = new HashMap<String, Object>();
            rootMap.put("red", false);
            rootMap.put("yellow", false);
            rootMap.put("green", false);
            template.process(rootMap, new PrintWriter(System.out));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }
//    @Test
    public void switchOrder() {
        try {
            Template template = config.getTemplate("SwitchOrder.ftl");
            Map<String, Object> rootMap = new HashMap<String, Object>();
            rootMap.put("value", "red");
            template.process(rootMap, new PrintWriter(System.out));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }
//    @Test
    public void listOrder() {
        try {
            Template template = config.getTemplate("ListOrder.ftl");
            Map<String, Object> rootMap = new HashMap<String, Object>();
            List<String> usernames = new ArrayList<String>();
            usernames.add("Felix");
            usernames.add("Justin");
            usernames.add("Alice");
			rootMap.put("usernames", usernames );
            template.process(rootMap, new PrintWriter(System.out));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }
//    @Test
    public void includeOrder() {
        try {
//        	config.setLocalizedLookup(true);
            Template template = config.getTemplate("IncludeOrder.ftl");
            Map<String, Object> rootMap = new HashMap<String, Object>();
            rootMap.put("username", "Felix");
            rootMap.put("password", "hello");
            template.process(rootMap, new PrintWriter(System.out));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }
}
