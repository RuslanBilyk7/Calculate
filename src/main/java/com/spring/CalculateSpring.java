package com.spring;

import com.nospring2.OpAdd;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.nospring2.Operation;

public class CalculateSpring {
    private Operation ops;

//        private ResultWriter wtr;
    private void showResult(String result) {
        System.out.println(result);
    }



    public void setOps(Operation ops) {
        this.ops = ops;
    }

//    public void setWriter(ResultWriter writer) {
//        this.wtr = writer;
//    }

    /*Создаем контекст, затем фабрику и при помощи фабрики достаем бин. ApplicationContext в Spring это тип BeanFactory. BeanFactory дает возможность доступа к JavaBeans которые иницилизированы, связанные и управляемые Spring контейнером.
Хотя есть и другие BeanFactory классы в Spring, ApplicationContext класс намного чаще используется, так как он снабжает нас несколькими ценными особенностями – включение поддержки для интернационализации, загрузка ресурсов, интеграция с внешними иерархиями конекстов и много чего еще.*/
    public static void main(String[] args) {
        args = new String[]{"3", "33"};
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        BeanFactory factory = (BeanFactory) context;                        //Зачем эта строка?
//        CalculateSpring calc = (CalculateSpring) factory.getBean("opsbean");
//        CalculateSpring calc2 = (CalculateSpring) factory.getBean("opsbean2");

        CalculateSpring calc = (CalculateSpring) context.getBean("opsbean");
        CalculateSpring calc2 = (CalculateSpring) context.getBean("opsbean2");
        calc.execute(args);
        calc2.execute(args);
//        calc.setOps(new OpAdd());
//        calc.execute(args);

    }

    public void execute(String[] args) {
        long op1 = Long.parseLong(args[0]);
        long op2 = Long.parseLong(args[1]);
        showResult("The result of " + op1 + ops.getOpsName() + op2 + " is " + ops.operate(op1, op2) + "!");
    }
}