/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import service.HelloService;

/**
 *
 * @author ean
 */
public class HelloController extends SimpleFormController {
    private HelloService helloService;
    public HelloController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        setCommandClass(Name.class);
        setCommandName("name");
        setSuccessView("helloView");
        setFormView("nameView");
    }
 
    
    protected ModelAndView onSubmit( 
    Object command, 
    BindException errors) throws Exception { 

    Name name = (Name) command;
    ModelAndView mv = new ModelAndView(getSuccessView());
    mv.addObject("helloMessage", HelloService.sayHello(name.getValue()));
    return mv;
        }
    
    
    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
}
    
}
