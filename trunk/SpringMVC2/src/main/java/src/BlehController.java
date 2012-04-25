package src;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
 
public class BlehController extends AbstractController {

    protected ModelAndView handleRequestInternal(
        HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ModelAndView modelAndView = new ModelAndView("bleh", "message", "blllleeehhhh");
 
        return modelAndView;
    }
 
}