package tw.com.nec.justin_chen;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.com.nec.justin_chen.service.ShapeService;

public class AopMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml")) {
			ShapeService shapeService = ctx.getBean("shapeService",ShapeService.class);
			System.out.println(shapeService.getCircle().getName());
			shapeService.getCircle().setName("test");
		}

		
	}

}
