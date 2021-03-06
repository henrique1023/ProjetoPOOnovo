package view;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class Menus {

	private Menu menuConsulta = new Menu("Consulta");
	private Menu menuPaciente = new Menu("Paciente");
	private Menu menuEmpresa = new Menu("Empresa");
	private Menu menuEquipamento = new Menu("Patrimonio");
	private Menu menuSobre = new Menu("Sobre");
	private MenuItem menuItemConsulta = new MenuItem("Pesquisar/Marcar");
	private MenuItem menuItemPaciente = new MenuItem("Cadastro");
	private MenuItem menuItemEspecializacao = new MenuItem("Especializacao");
	private MenuItem menuItemMedico = new MenuItem("Medico");
	private MenuItem menuItemEquipamento = new MenuItem("Equipamento");
	private MenuItem menuItemMedicacao = new MenuItem("Medicacao");
	private MenuItem menuItemSobre = new MenuItem("Sistema");

	public Menus() {
	}

	public Menu getMenuConsulta() {
		menuConsulta.getItems().add(menuItemConsulta);
		return menuConsulta;
	}

	public void setMenuConsulta(Menu menuConsulta) {
		this.menuConsulta = menuConsulta;
	}

	public Menu getMenuPaciente() {
		menuPaciente.getItems().add(menuItemPaciente);
		return menuPaciente;
	}

	public void setMenuPaciente(Menu menuPaciente) {
		this.menuPaciente = menuPaciente;
	}

	public Menu getMenuEmpresa() {
		menuEmpresa.getItems().addAll(menuItemMedico, menuItemEspecializacao);
		return menuEmpresa;
	}

	public void setMenuEmpresa(Menu menuEmpresa) {
		this.menuEmpresa = menuEmpresa;
	}

	public Menu getMenuSobre() {
		menuSobre.getItems().add(menuItemSobre);
		return menuSobre;
	}

	public void setMenuSobre(Menu menuSobre) {
		this.menuSobre = menuSobre;
	}

	public MenuItem getMenuItemConsulta() {
		return menuItemConsulta;
	}

	public void setMenuItemConsulta(MenuItem menuItemConsulta) {
		this.menuItemConsulta = menuItemConsulta;
	}

	public MenuItem getMenuItemPaciente() {
		return menuItemPaciente;
	}

	public void setMenuItemPaciente(MenuItem menuItemPaciente) {
		this.menuItemPaciente = menuItemPaciente;
	}

	public MenuItem getMenuItemEspecializacao() {
		return menuItemEspecializacao;
	}

	public void setMenuItemEspecializacao(MenuItem menuItemEspecializacao) {
		this.menuItemEspecializacao = menuItemEspecializacao;
	}

	public MenuItem getMenuItemMedico() {
		return menuItemMedico;
	}

	public void setMenuItemMedico(MenuItem menuItemMedico) {
		this.menuItemMedico = menuItemMedico;
	}

	public MenuItem getMenuItemSobre() {
		return menuItemSobre;
	}

	public void setMenuItemSobre(MenuItem menuItemSobre) {
		this.menuItemSobre = menuItemSobre;
	}

	public void onActionConsulta(Stage stage) {

	}

	public void onActionPaciente(Stage stage) {

	}

	public void onActionEspecializacao(Stage stage) {

	}

	public void onActionMedico(Stage stage) {

	}

	public MenuItem getMenuItemEquipamento() {
		return menuItemEquipamento;
	}

	public void setMenuItemEquipamento(MenuItem menuItemEquipamento) {
		this.menuItemEquipamento = menuItemEquipamento;
	}
	
	public void setMenuItemMedicacao(MenuItem menuItemMedicacao) {
		this.menuItemMedicacao = menuItemMedicacao;
	}
	
	public Menu getMenuEquipamento() {
		menuEquipamento.getItems().addAll(menuItemEquipamento, menuItemMedicacao);
		return menuEquipamento;
	}

	public void setMenuEquipamento(Menu menuEquipamento) { 
		this.menuEquipamento = menuEquipamento;
	}
	
	public MenuItem getMenuItemMedicacao() {
		return menuItemMedicacao;
	}

	
	public void onActionSobre(Stage stage) {
		SobreView sobre = new SobreView();
		try {
			sobre.start(stage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void onActionEquip(Stage stage) {
		EquipamentoView equipamento = new EquipamentoView();
		try {
			equipamento.start(stage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void onActionMedic(Stage stage) {
		MedicacaoView medicacao = new MedicacaoView();
		try {
			medicacao.start(stage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
