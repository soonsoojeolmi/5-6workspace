package com.multi.d_api.anno;

import java.lang.reflect.Method;


/*어노테이션(Annotation)은 코드에 추가적인 정보를 제공하는 메타데이터로,
컴파일러나 프레임워크가 이를 분석하여 특정 동작을 수행할 수 있도록 한다.

주요 어노테이션
컴파일러 관련: @Override, @Deprecated, @SuppressWarnings
런타임 처리용: @Retention(RetentionPolicy.RUNTIME), @Target(ElementType.METHOD)
프레임워크 사용: Spring의 @Service, @Autowired, @Transactional

어노테이션 자체만으로는 동작하지 않으며, 리플렉션을 통해 처리해야 한다.*/
public class PrintAnnotationExample_s {
	public static void main(String[] args) throws Exception {
		// 1. Service 클래스의 모든 메서드를 배열로 가져옴
		Method[] methods = Service.class.getDeclaredMethods();

		for (Method method : methods) {
			if (method.getName().equals("printStar") && method.isAnnotationPresent(PrintAnnotation_s.class)) {
				PrintAnnotation_s anno = method.getAnnotation(PrintAnnotation_s.class);
				System.out.println("어노테이션 값: " + anno.value());
			}
		}

		// 1. Service 클래스의 객체 생성
		Service service = new Service();

		// 2. printStar 메서드를 리플렉션으로 가져옴
		Method method = service.getClass().getMethod("printStar");

		// 3. 메서드 실행
		method.invoke(service);
	}

}