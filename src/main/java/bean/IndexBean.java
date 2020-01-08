package bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean
public class IndexBean extends GenericBean {

	@PostConstruct
	public void init() {
		
	}
	
	public void redirectConfig() {
		redirecionarPagina("configuration/home-config.xhtml");
	}
}
