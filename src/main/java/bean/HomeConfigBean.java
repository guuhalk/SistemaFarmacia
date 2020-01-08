package bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean
public class HomeConfigBean extends GenericBean {

	
	@PostConstruct
	public void init() {
		
	}
	
	public void redirectUserConfig() {
		redirecionarPagina("user-config.xhtml");
	}
}
