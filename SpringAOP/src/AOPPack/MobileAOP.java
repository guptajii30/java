package AOPPack;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MobileAOP {
	@AfterReturning(pointcut = "execution(String AOPPack.Mobile.getBrand(..) )",returning = "q")
	void afterRet(String brand) {
		System.out.println("After Returing"+brand);
	}
}
