package myPack;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(value="/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/hello")
	public ModelAndView hello(HttpServletRequest request,HttpServletResponse response)
	{
		String username = request.getParameter("name");
		String password = request.getParameter("password");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		mv.addObject("username", username);
		return mv;
		
	}

}
