package view;

import java.util.Date;

import controller.PacienteController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.dao.impl.PacienteDaoJDBC;
import model.entities.Paciente;

public class PacienteView extends Application{
	
	private TableView<Paciente> tableViewPaciente = new TableView<>();
	private TableColumn<Paciente, Integer> tableColumnId = new TableColumn<>("ID");
	private TableColumn<Paciente, String>   tableColumnNome = new TableColumn<>("NOME");
	private TableColumn<Paciente, Date> tableColumnData = new TableColumn<>("DATA");
	private TableColumn<Paciente, Paciente> tableColumnEDIT = new TableColumn<>();
	private TableColumn<Paciente, Paciente> tableColumnREMOVE = new TableColumn<>();
	
	private PacienteController control = new PacienteController();


	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage stage) throws Exception {
		ScrollPane painel = new ScrollPane();
		Scene scn = new Scene(painel);
		
		VBox subPan = new VBox();
		subPan.setPrefHeight(400);
		subPan.setPrefWidth(600);
		
		MenuBar menuBar = new MenuBar();
		Menu menuConsulta =  new Menu("Consulta");
		Menu menuPaciente =  new Menu("Paciente");
		Menu menuEmpresa =  new Menu("Empresa");
		Menu menuSobre =  new Menu("Sobre");
		
		MenuItem menuItemConsulta = new MenuItem("Pesquisar/Marcar");
		MenuItem menuItemPaciente = new MenuItem("Cadastro");
		MenuItem menuItemEspecializacao = new MenuItem("Especializa��o");
		MenuItem menuItemMedico = new MenuItem("Medico");
		MenuItem menuItemSobre = new MenuItem("Sistema");
		
		// =================================================================
		// tela com as informa��es j� cadastradas
		
		Label lblTitulo = new Label("Menu Paciente");
		lblTitulo.setStyle("-fx-font-size: 24px;"
				+ " -fx-alignment: center-left; "
				+ "	-fx-pref-height: 30");
		
		ToolBar toolButtons = new ToolBar();
		Button btNovo = new Button("Novo");
		Button btAtualizar = new Button("Atualizar");
		
		toolButtons.getItems().addAll(btNovo, btAtualizar);
		
		btNovo.setOnAction((e) -> {
			control.novo(stage);
		});
		
		btAtualizar.setOnAction((e) -> {
			control.adicionar(tableColumnId, tableColumnNome, tableColumnData, tableViewPaciente);
		});
		
		tableViewPaciente.getColumns().addAll(tableColumnId, tableColumnNome, tableColumnData,
												tableColumnEDIT, tableColumnREMOVE);
		
		//================================================================
		menuConsulta.getItems().add(menuItemConsulta);
		menuPaciente.getItems().add(menuItemPaciente);
		menuEmpresa.getItems().addAll(menuItemMedico, menuItemEspecializacao);
		menuSobre.getItems().add(menuItemSobre);
		
		menuBar.getMenus().addAll(menuConsulta, menuPaciente, menuEmpresa, menuSobre);
		subPan.getChildren().addAll(menuBar, lblTitulo, toolButtons, tableViewPaciente);
		
		painel.setContent(subPan);
		stage.setTitle("SISTEMA CLINICA");
		stage.setScene(scn);
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(PacienteView.class, args);
	}
	
}