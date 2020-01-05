package bean;

import java.io.IOException;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import dao.GenericDao;
import model.User;

public class GenericBean extends GenericDao<GenericBean> {

	
	
	public User buscaUsuarioSessao() {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		Map<String, Object> session = facesContext.getExternalContext().getSessionMap();
		User login = (User) session.get("user");
		return login;
	}
	

	public void redirecionarPagina(String caminho) {
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect(caminho);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void menssagemSucesso(String mensagem) {
		FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO, null,mensagem));
		
	}
	public void menssagemAviso(String mensagem) {
		FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_WARN, null,mensagem));
		
	}
	public void menssagemErro(String mensagem) {
		FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR, null,mensagem));
		
	}

}