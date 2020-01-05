package bean;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import model.User;


@RequestScoped
@ManagedBean
public class LoginBean extends GenericBean {
	
	
	private String username;
	private String password;
	private User user;
	
	@PostConstruct
	public void init() {
		
	}

	
	public void logar() {

		if (validaUsuario(username, password)) {
		
		
			user = new UserDao().buscarUsuarioParaLogin(username, password);

		if (user != null) {
			FacesContext context = FacesContext.getCurrentInstance();
			HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
			request.getSession().setAttribute("user", user);
			redirecionarPagina("pages/index.xhtml");

		}else {
			
			menssagemErro("Usuario ou Senha Incorretos!");
		}
	}

	}

	
	public void sair() throws IOException {

		FacesContext context = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
		session.invalidate();
		redirecionarPagina("login.xhtml");
	}

	
	public boolean validaUsuario(String login, String senha) {

		if ((login == null || login.isEmpty()) && (senha == null || senha.isEmpty())) {
			menssagemErro("Favor preencher os campos");
			return false;
		}else {
			if (login == null || login.isEmpty()) {
				menssagemErro("Favor preencher o login");
				return false;

			}

			else if (senha == null || senha.isEmpty()) {
				menssagemErro("Favor preencher a senha");
				return false;
			}
			
			else {
				return true;
			}
		}
	}
	
	
	

	// Getters and Setters
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
