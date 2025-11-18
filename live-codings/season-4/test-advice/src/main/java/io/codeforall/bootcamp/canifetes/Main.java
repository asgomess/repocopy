package io.codeforall.bootcamp.canifetes;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        GenericXmlApplicationContext context = new GenericXmlApplicationContext("/spring-config.xml");

        Canifete canifete = context.getBean("proxy", Canifete.class);
        canifete.attendLecture();




    }
}