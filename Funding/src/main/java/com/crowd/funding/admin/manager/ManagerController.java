package com.crowd.funding.admin.manager;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("admin/*")
public class ManagerController {
	
	@Inject
	ManagerService magagerService;
	
	@RequestMapping("managerList.do")
	public ModelAndView list(ModelAndView mav) {
		List<ManagerDTO> items=magagerService.listManager();
		mav.setViewName("admin/manager_list");
		mav.addObject("list", items);
		return mav;
	}
	
	@RequestMapping("managerRegister.do")
	public String insert(@ModelAttribute ManagerDTO dto) {
		magagerService.insertManager(dto);
		return "manager_view";
		
	}
	
	

}
