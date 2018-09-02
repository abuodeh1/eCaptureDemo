package etech.backing;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.etech.ecapture.entities.Action;
import com.etech.ecapture.services.ActionServiceImpl;

@ManagedBean
@RequestScoped
public class ActionController {
	
	@ManagedProperty("#{actionServiceImpl}")
	private ActionServiceImpl actionServiceImpl;

	private Action selected;

	public Action getSelected() {
		return selected;
	}

	public void setSelected(Action selected) {
		this.selected = selected;
	}
	
	public List<Action> getItemsAvailableSelectMany() {
        return actionServiceImpl.findAll();
    }

    public List<Action> getItemsAvailableSelectOne() {
        return actionServiceImpl.findAll();
    }
	
	
}
