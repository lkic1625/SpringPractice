package org.lkic1625.springdemobykotlin

import org.springframework.context.support.ClassPathXmlApplicationContext

class HelloSpringApp {
    fun main(){
        val context = ClassPathXmlApplicationContext("org\\lkic1625\\springdemobykotlin\\applicationContext.xml")
        val theCoach = context.getBean("myCoach", Coach::class.java);
        print(theCoach.getDailiyWork())
        context.close()
    }
}