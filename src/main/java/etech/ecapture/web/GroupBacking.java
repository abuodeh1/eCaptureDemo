package etech.ecapture.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.etech.ecapture.services.GroupServiceImpl;

@ManagedBean
@RequestScoped
public class GroupBacking {

	@ManagedProperty(value = "#{groupServiceImpl}")
	public GroupServiceImpl groupServiceImpl;
}
