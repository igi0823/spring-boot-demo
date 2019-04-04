
import com.intel.component.TestBean;
import com.intel.contrller.LogController;
import com.intel.form.TestForm;
import com.intel.service.TestService;
import com.intel.service.ValidateService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import io.sentry.Sentry;

import com.intel.config.TestConfiguration;

//@Configuration
//@ComponentScan(basePackages = "com.intel")
public class TestMain {

    public static void main(String[] args){

            Sentry.init("http://f6258f323dbb465ea17f35bb2ee447cd@sentry.qfang.com/2");
            ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
//            TestBean tb = (TestBean) applicationContext.getBean("testBean");
//            tb.sayHello();

//        TestComponent tp = (TestComponent)applicationContext.getBean("testComponent");
//        tp.sayHello();

//        TestForm testForm = new TestForm("yifeiwww",39);
//        ValidateService vs = (ValidateService)applicationContext.getBean("validateService");
//        TestService ts = (TestService)applicationContext.getBean("testService");
//        ts.method();
//        vs.validateForm(testForm);
            LogController lc = (LogController) applicationContext.getBean("logController");
            lc.testSentry(3);

    }
}
