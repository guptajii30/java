package AOPPack;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class TransactionAOP {
	@Before(" execution(void AOPPack.Transaction.processTransaction(..))")
	public void afterTransaction() {
		System.out.println("Transation completed");
	}
}
