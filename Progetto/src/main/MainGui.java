package main;

import group.GroupView;
import hotel.Hotel;
import login.*;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.BadLocationException;
import javax.xml.transform.TransformerException;

import login.Login;

import reservation.ReservationView;
import room.RoomView;



/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class MainGui extends JFrame implements ActionListener, DropTargetListener,CaretListener {

	private static final long serialVersionUID = 1L;
	protected static final String textFieldString = "JTextField";
	protected static final String ftfString = "JFormattedTextField";
	protected static final String buttonString = "JButton";
	private JCheckBox jCheckBox3,jCheckBox4,jCheckBox1,esportaPDF,esportaJPG;
	private JScrollPane jScrollErroriPane, jScrollSQLPane,jScrollSVGPane;
	private JScrollPane jScrollEsecuzionePane1, jScrollEsecuzionePane2, jScrollEsecuzionePane3;
	private JPanel contenitoreErroriPane,contenitoreSQLPane,contenitoreSVGPane,textControlsPane,jPanel2,welcomePanel;
	private JEditorPane ErroriPane, SQLPane,SVGPane;
	private JFileChooser fc;
	private JPanel erroriPanel;
	private JPanel esecuzionePanel1,esecuzionePanel2,esecuzionePanel3;
	private static final String[] allowExt = { "xml" };
	private boolean cangetsvg = true;
	private boolean cangetsql = true;
	private boolean parseok = true;
	private DropTarget dt;
	private JButton reservation, importMysql,roomAndExtra,saveButton,openButton,avvia,groupAndRequest;
	private JLabel titoloLabel2,label2,titoloLabel,jLabel1,erroreLabel;
	private JTabbedPane pannelloTab,pannelloTab1,pannelloTab2,pannelloTab3;
	private JTextArea jTextAreaXML,jTextArea1,jTextArea2,jTextArea3;
	private JScrollPane jScrollPane2;
	private int riga = 0;
	private File file = null;

	/**
	 * Instantiates a new MainGui.
	 */
	public MainGui() {			
		/*if (isFileOk(new File("test.svg")))		{		
			JSVGCanvas svgCanvas = new JSVGCanvas();	
			svgCanvas.setURI(new File("test.svg").toURI().toString());	
			jScrollSVGPane = new JScrollPane(svgCanvas);
			jScrollSVGPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		}*/

		GroupLayout layout = new GroupLayout((JComponent)getContentPane());
		getContentPane().setLayout(layout);
		jPanel2 = new JPanel();
		GroupLayout jPanel2Layout = new GroupLayout((JComponent)jPanel2);
		jPanel2.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		jPanel2.setLayout(jPanel2Layout);
		jPanel2.setBounds(393, 12, 725, 168);
		{
			textControlsPane = new JPanel();
			GroupLayout textControlsPaneLayout = new GroupLayout((JComponent)textControlsPane);
			textControlsPane.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
			textControlsPane.setLayout(textControlsPaneLayout);
			textControlsPane.setBounds(17, 12, 334, 168);
			{
				jLabel1 = new JLabel();
				GroupLayout jLabel1Layout1 = new GroupLayout((JComponent)jLabel1);

				jLabel1.setText("<html><p>Visualizzatore files xml.</p></html>");
				jLabel1.setFont(new java.awt.Font("Tahoma",1,12));
				jLabel1.setForeground(new java.awt.Color(49,106,196));
				jLabel1.setPreferredSize(new java.awt.Dimension(287,72));
				jLabel1.setLayout(jLabel1Layout1);
				jLabel1.setBounds(20, 2, 320, 52);
				jLabel1Layout1.setVerticalGroup(jLabel1Layout1.createSequentialGroup());
				jLabel1Layout1.setHorizontalGroup(jLabel1Layout1.createSequentialGroup());
			}
			{
				saveButton = new JButton();
				GroupLayout saveButtonLayout1 = new GroupLayout((JComponent)saveButton);

				saveButton.setLayout(saveButtonLayout1);
				saveButton.setText("Salva le modifiche");
				saveButton.setActionCommand("save");
				saveButton.setFont(new java.awt.Font("Tahoma",0,11));
				saveButton.setPreferredSize(new java.awt.Dimension(173,22));
				saveButton.addActionListener(this);
				saveButtonLayout1.setVerticalGroup(saveButtonLayout1.createSequentialGroup());
				saveButtonLayout1.setHorizontalGroup(saveButtonLayout1.createSequentialGroup());
			}
			{
				openButton = new JButton();
				GroupLayout openButtonLayout1 = new GroupLayout((JComponent)openButton);

				openButton.setLayout(openButtonLayout1);
				openButton.setText("Importa un file xml");
				openButton.setActionCommand("open");
				openButton.setFont(new java.awt.Font("Tahoma",0,11));
				openButton.setPreferredSize(new java.awt.Dimension(173,24));
				openButton.addActionListener(this);
				openButtonLayout1.setVerticalGroup(openButtonLayout1.createSequentialGroup());
				openButtonLayout1.setHorizontalGroup(openButtonLayout1.createSequentialGroup());
			}
			textControlsPaneLayout.setHorizontalGroup(textControlsPaneLayout.createSequentialGroup()
					.addContainerGap(21, 21)
					.addGroup(textControlsPaneLayout.createParallelGroup()
							.addComponent(jLabel1, GroupLayout.Alignment.LEADING, 0, 287, Short.MAX_VALUE)
							.addGroup(textControlsPaneLayout.createSequentialGroup()
									.addGap(57)
									.addGroup(textControlsPaneLayout.createParallelGroup()
											.addComponent(openButton, GroupLayout.Alignment.LEADING, 0, 173, Short.MAX_VALUE)
											.addComponent(saveButton, GroupLayout.Alignment.LEADING, 0, 173, Short.MAX_VALUE))
											.addGap(57)))
											.addContainerGap(22, 22));
			textControlsPaneLayout.setVerticalGroup(textControlsPaneLayout.createSequentialGroup()
					.addContainerGap(5, 5)
					.addComponent(jLabel1, 0, 72, Short.MAX_VALUE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(openButton, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(saveButton, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(31, 31));
		}
		{		    		
			jTextAreaXML = new JTextArea();
			jTextAreaXML.setFont(new Font("Serif",Font.PLAIN,15));
			jTextAreaXML.addCaretListener(this);
			jTextAreaXML.setWrapStyleWord(true);
			jTextAreaXML.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));   		
			jScrollPane2 = new JScrollPane(jTextAreaXML);
			jScrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
			jScrollPane2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			jScrollPane2.setBorder(BorderFactory.createTitledBorder(null, "STRUTTURA DATI", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma",1,11), new java.awt.Color(49,106,196)));
			jScrollPane2.setBounds(17, 208, 339, 566);  
			// Inizializzazione di DropTarget per la funzione di drag & drop
			dt = new DropTarget(jTextAreaXML, this);
		}	
		{
			pannelloTab = new JTabbedPane();
			pannelloTab.setBounds(393, 186, 716, 588);
			{
				welcomePanel = new JPanel();
				GroupLayout welcomePanelLayout = new GroupLayout((JComponent)welcomePanel);
				pannelloTab.addTab("BENVENUTO", null, welcomePanel, null);
				welcomePanel.setLayout(welcomePanelLayout);
				{
					titoloLabel = new JLabel();
					GroupLayout titoloLabelLayout = new GroupLayout((JComponent)titoloLabel);
					titoloLabel.setText("<html><b>Implementare un software per la gestione delle prenotazioni delle camere di un albergo</b></html>");
					titoloLabel.setFont(new java.awt.Font("Tahoma",1,12));
					titoloLabel.setForeground(new java.awt.Color(49,106,196));
					titoloLabel.setLayout(null);
					titoloLabelLayout.setVerticalGroup(titoloLabelLayout.createSequentialGroup());
					titoloLabelLayout.setHorizontalGroup(titoloLabelLayout.createSequentialGroup());
				}
				{
					titoloLabel2 = new JLabel();		    				
					GroupLayout titoloLabel2Layout = new GroupLayout((JComponent)titoloLabel2);
					titoloLabel2.setText("<html><p>SELEZIONARE LE IMPOSTAZIONI PREFERITE E PREMERE 'AVVIA'.</p><br/><p>SUGGERIMENTO: Per importare pi� velocemente un file � possibile trascinare direttamente il relativo file sull'editor.</p></html>");
					titoloLabel2.setHorizontalAlignment(2);
					titoloLabel2.setFont(new java.awt.Font("Tahoma",0,11));
					titoloLabel2.setLayout(null);
					titoloLabel2Layout.setVerticalGroup(titoloLabel2Layout.createSequentialGroup());
					titoloLabel2Layout.setHorizontalGroup(titoloLabel2Layout.createSequentialGroup());
				}
			
				welcomePanelLayout.setHorizontalGroup(welcomePanelLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(welcomePanelLayout.createParallelGroup()
								.addComponent(titoloLabel, GroupLayout.Alignment.LEADING, 0, 708, Short.MAX_VALUE)
								.addComponent(titoloLabel2, GroupLayout.Alignment.LEADING, 0, 708, Short.MAX_VALUE))
								.addContainerGap());
				welcomePanelLayout.setVerticalGroup(welcomePanelLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(titoloLabel, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(titoloLabel2, 0, 300, Short.MAX_VALUE)
						.addContainerGap(423, 423));
			}
		}
		label2=new JLabel();
		GroupLayout label2Layout = new GroupLayout((JComponent)label2);
		label2.setLayout(label2Layout);
		label2.setForeground(new java.awt.Color(0,0,0));
		label2.setBackground(new java.awt.Color(255,255,255));
		label2.setBorder(BorderFactory.createTitledBorder(null, "Cursore", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma",1,11), new java.awt.Color(49,106,196)));
		layout.setVerticalGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(layout.createParallelGroup()
						.addComponent(textControlsPane, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
						.addComponent(jPanel2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup()
								.addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
										.addComponent(jScrollPane2, 0, 607, Short.MAX_VALUE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(label2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
										.addComponent(pannelloTab, GroupLayout.Alignment.LEADING, 0, 655, Short.MAX_VALUE))
										.addContainerGap());
		layout.setHorizontalGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(layout.createParallelGroup()
						.addComponent(jScrollPane2, GroupLayout.Alignment.LEADING, 0, 390, Short.MAX_VALUE)
						.addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
								.addComponent(label2, 0, 387, Short.MAX_VALUE)
								.addGap(6))
								.addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
										.addComponent(textControlsPane, 0, 384, Short.MAX_VALUE)
										.addGap(6)))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup()
												.addComponent(pannelloTab, GroupLayout.Alignment.LEADING, 0, 737, Short.MAX_VALUE)
												.addComponent(jPanel2, GroupLayout.Alignment.LEADING, 0, 737, Short.MAX_VALUE))
												.addContainerGap());
		label2Layout.setHorizontalGroup(label2Layout.createSequentialGroup());
		label2Layout.setVerticalGroup(label2Layout.createSequentialGroup());
		label2.setText("   0, 0");

		
		jCheckBox3 = new JCheckBox();
		GroupLayout jCheckBox3Layout1 = new GroupLayout((JComponent)jCheckBox3);
		GroupLayout jCheckBox3Layout = new GroupLayout((JComponent)jCheckBox3);
		jCheckBox3.setLayout(jCheckBox3Layout1);
		jCheckBox3Layout1.setHorizontalGroup(jCheckBox3Layout1.createSequentialGroup());
		jCheckBox3Layout1.setVerticalGroup(jCheckBox3Layout1.createSequentialGroup());
		jCheckBox3.setEnabled(false);
		jCheckBox3.setText("CARICAMENTO DATI DALLE STRUTTURE XML IN ISTANZE JAVA");
		jCheckBox3.setSelected(true);
		jCheckBox3.setFont(new java.awt.Font("Tahoma",0,12));
		jCheckBox3.setBounds(310, 20, 340, 119);
		jCheckBox3Layout.setVerticalGroup(jCheckBox3Layout.createParallelGroup());
		jCheckBox3Layout.setHorizontalGroup(jCheckBox3Layout.createParallelGroup());

		esportaPDF = new JCheckBox();
		GroupLayout esportaPDFLayout1 = new GroupLayout((JComponent)esportaPDF);
		GroupLayout esportaPDFLayout = new GroupLayout((JComponent)esportaPDF);
		esportaPDF.setLayout(esportaPDFLayout1);
		esportaPDFLayout1.setHorizontalGroup(esportaPDFLayout1.createSequentialGroup());
		esportaPDFLayout1.setVerticalGroup(esportaPDFLayout1.createSequentialGroup());
		esportaPDF.setEnabled(true);
		esportaPDF.setText("Esporta conto ed extra  in formato PDF");
		esportaPDF.setActionCommand("pdf");
		esportaPDF.setFont(new java.awt.Font("Tahoma",0,11));
		esportaPDF.setBounds(27, 78, 177, 18);
		esportaPDFLayout.setVerticalGroup(esportaPDFLayout.createParallelGroup());
		esportaPDFLayout.setHorizontalGroup(esportaPDFLayout.createParallelGroup());

		esportaJPG = new JCheckBox();
		GroupLayout esportaJPGLayout1 = new GroupLayout((JComponent)esportaJPG);
		GroupLayout esportaJPGLayout = new GroupLayout((JComponent)esportaJPG);
		esportaJPG.setLayout(esportaJPGLayout1);
		esportaJPGLayout1.setHorizontalGroup(esportaJPGLayout1.createSequentialGroup());
		esportaJPGLayout1.setVerticalGroup(esportaJPGLayout1.createSequentialGroup());
		esportaJPG.setEnabled(true);
		esportaJPG.setText("Esporta conto gruppo ed extra in formato JPG");
		esportaJPG.setActionCommand("jpg");
		esportaJPG.setFont(new java.awt.Font("Tahoma",0,11));
		esportaJPG.setBounds(27, 97, 171, 17);
		esportaJPGLayout.setVerticalGroup(esportaJPGLayout.createParallelGroup());
		esportaJPGLayout.setHorizontalGroup(esportaJPGLayout.createParallelGroup());

		roomAndExtra = new JButton();					
		//GroupLayout roomAndExtraGL = new GroupLayout((JComponent)roomAndExtra);
		roomAndExtra.setActionCommand("roomExtra");
		roomAndExtra.addActionListener(this);
		//GroupLayout testMysqlLayout = new GroupLayout((JComponent)roomAndExtra);
		//roomAndExtra.setLayout(roomAndExtraGL);
		//roomAndExtraGL.setHorizontalGroup(roomAndExtraGL.createSequentialGroup());
		//roomAndExtraGL.setVerticalGroup(roomAndExtraGL.createSequentialGroup());
		roomAndExtra.setText("gestione stanze ed extra");
		roomAndExtra.setFont(new java.awt.Font("Tahoma",0,11));

		groupAndRequest = new JButton();
		//GroupLayout jButton2Layout = new GroupLayout((JComponent)groupAndRequest);
		//groupAndRequest.setLayout(jButton2Layout);
		groupAndRequest.setText("gestione gruppi e richieste");
		groupAndRequest.setFont(new java.awt.Font("Tahoma",0,11));
		groupAndRequest.setActionCommand("groupRequest");
		groupAndRequest.addActionListener(this);
		//jButton2Layout.setVerticalGroup(jButton2Layout.createSequentialGroup());
		//jButton2Layout.setHorizontalGroup(jButton2Layout.createSequentialGroup());

		reservation = new JButton();
		//GroupLayout jButton1Layout = new GroupLayout((JComponent)reservation);
		//reservation.setLayout(jButton1Layout);
		reservation.setText("gestione prenotazioni");
		reservation.setFont(new java.awt.Font("Tahoma",0,11));
		reservation.setActionCommand("reservation");
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createSequentialGroup()
			.addComponent(jCheckBox3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
			.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
			    .addComponent(roomAndExtra, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
			    .addComponent(reservation, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
			    .addComponent(groupAndRequest, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
			.addGap(0, 29, Short.MAX_VALUE)
			.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
			    .addComponent(esportaPDF, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
			    .addComponent(esportaJPG, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
			.addContainerGap(30, 30));
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createSequentialGroup()
			.addGap(7)
			.addGroup(jPanel2Layout.createParallelGroup()
			    .addGroup(jPanel2Layout.createSequentialGroup()
			        .addGroup(jPanel2Layout.createParallelGroup()
			            .addComponent(roomAndExtra, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
			            .addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
			                .addGap(17)
			                .addGap(9)))
			        .addGap(20)
			        .addGroup(jPanel2Layout.createParallelGroup()
			            .addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
			                .addComponent(groupAndRequest, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
			                .addGap(25)
			                .addComponent(reservation, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
			                .addGap(0, 122, Short.MAX_VALUE))
			            .addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
			                .addGap(32)
			                .addComponent(esportaJPG, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
			                .addGap(0, 42, Short.MAX_VALUE)
			                .addComponent(esportaPDF, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))))
			    .addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
			        .addComponent(jCheckBox3, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
			        .addGap(0, 405, Short.MAX_VALUE)))
			.addContainerGap(60, 60));
		reservation.addActionListener(this);
		//jButton1Layout.setVerticalGroup(jButton1Layout.createSequentialGroup());
		//jButton1Layout.setHorizontalGroup(jButton1Layout.createSequentialGroup());

		//testMysqlLayout.setVerticalGroup(testMysqlLayout.createParallelGroup());
		//testMysqlLayout.setHorizontalGroup(testMysqlLayout.createParallelGroup());

		GroupLayout titoloLabelLayout = new GroupLayout((JComponent)titoloLabel);
		titoloLabelLayout.setVerticalGroup(titoloLabelLayout.createParallelGroup());
		titoloLabelLayout.setHorizontalGroup(titoloLabelLayout.createParallelGroup());

		GroupLayout titoloLabel2Layout = new GroupLayout((JComponent)titoloLabel2);
		titoloLabel2Layout.setVerticalGroup(titoloLabel2Layout.createParallelGroup());
		titoloLabel2Layout.setHorizontalGroup(titoloLabel2Layout.createParallelGroup());

		GroupLayout jLabel1Layout = new GroupLayout((JComponent)jLabel1);
		jLabel1Layout.setVerticalGroup(jLabel1Layout.createParallelGroup());
		jLabel1Layout.setHorizontalGroup(jLabel1Layout.createParallelGroup());

		GroupLayout saveButtonLayout = new GroupLayout((JComponent)saveButton);
		saveButtonLayout.setVerticalGroup(saveButtonLayout.createParallelGroup());
		saveButtonLayout.setHorizontalGroup(saveButtonLayout.createParallelGroup());

		GroupLayout openButtonLayout = new GroupLayout((JComponent)openButton);
		openButtonLayout.setVerticalGroup(openButtonLayout.createParallelGroup());
		openButtonLayout.setHorizontalGroup(openButtonLayout.createParallelGroup());

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("implementare un software per la gestione delle prenotazioni delle camere di un albergo");  
		pack();
		this.setSize(1165, 869);

		// Funzione per importare automaticamente un linguaggio d'esempio
		int n = JOptionPane.showConfirmDialog(
				this,
				"Si desidera importare direttamente il file xml.. 'rooms.xml'?",
				"Caricamento esempio",
				JOptionPane.YES_NO_OPTION);
		if (n==0) {
			file=new File("rooms.xml");
			caricaFile(new File("rooms.xml"));  
		}
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 
	public static void main(String[] args) {
		
		 Login frame=new Login();
		  frame.setSize(300,100);
		  frame.setVisible(true);
		
	}
	*/

	public void actionPerformed(ActionEvent e) {
		
		//Carico tutte le istanze racchiuse in hotel nel main
		Hotel h=new Hotel();
		LoadFromXml l=new LoadFromXml();
		h=l.LoadFromXml();	
		
		// Attivazione e disattivazione generazione pdf e jpg
		if (e.getActionCommand().equals("reservation")&& reservation.isSelected()){
			esportaPDF.setSelected(true);
			esportaJPG.setSelected(true);
			esportaPDF.setEnabled(true);
			esportaJPG.setEnabled(true);
		}
		else if (!(e.getActionCommand().equals("reservation"))){
			esportaPDF.setSelected(false);
			esportaJPG.setSelected(false);
			esportaPDF.setEnabled(false);
			esportaJPG.setEnabled(false);
		} 

			if (e.getActionCommand().equals("roomExtra")) {	
				NextPage1 page1=new NextPage1(h);
				page1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				  page1.setVisible(true);

			}  else if  (e.getActionCommand().equals("groupRequest")){
				
				NextPage2 page2=new NextPage2(h);
				page2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				  page2.setVisible(true);
				
			}  else if  (e.getActionCommand().equals("reservation")){
				NextPage3 page3=new NextPage3(h);
				page3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				  page3.setVisible(true);
			}
			if (e.getActionCommand().equals("open")) {
			//Create a file chooser
			fc = new JFileChooser();           
			int returnVal1 = fc.showOpenDialog(fc);
			if (returnVal1 == JFileChooser.APPROVE_OPTION) {
				file = fc.getSelectedFile();            
				caricaFile(file);
			}

		} else if (e.getActionCommand().equals("save")) {
			salvaFile(file);

		}/*else if (e.getActionCommand().equals("openSvg")) {
			inizializeErrorPanel();
			SvgExporter svg= new SvgExporter(inizializeErrorPanel());
			manageSvg(svg, 1);
			jScrollErroriPane = new JScrollPane(erroriPanel);
			pannelloTab.insertTab("<html><font color='red'>REPORT ERRORI</font></html>", null, jScrollErroriPane, null,0);  
			pannelloTab.setSelectedIndex(0);
			JLabel temp = new JLabel();
			temp.setVisible(false);
			erroriPanel.add(new JLabel(), setGridValuesComplete(2,0, riga++,1.0));
		}else if (e.getActionCommand().equals("openJpeg")) {
			inizializeErrorPanel();
			SvgExporter svg= new SvgExporter(inizializeErrorPanel());
			manageSvg(svg, 2);
			jScrollErroriPane = new JScrollPane(erroriPanel);
			pannelloTab.insertTab("<html><font color='red'>REPORT ERRORI</font></html>", null, jScrollErroriPane, null,0);  
			pannelloTab.setSelectedIndex(0);
			JLabel temp = new JLabel();
			temp.setVisible(false);
			erroriPanel.add(new JLabel(), setGridValuesComplete(2,0, riga++,1.0));

		} */else {
			try {
				jTextAreaXML.setCaretPosition(Integer.valueOf(e.getActionCommand()));
				jTextAreaXML.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
				jTextAreaXML.requestFocus();
			} catch (NumberFormatException e1) {		
			}
		}
	}

	/**
	 * getExt Extracts the extension of the selected file
	 *
	 * @param file the file
	 * @return String
	 */
	private String getExt(File file) {
		String name;
		String ext = null;
		name = file.getName();
		int i = name.lastIndexOf('.');
		if (file.isDirectory())
			ext = null;
		else if (i > 0 && i < name.length() - 1) {
			ext = name.substring(i + 1).toLowerCase();
		}
		return ext;
	} 

	/**
	 * isFileAllowExt checks that the extensions of the imported file are allowed
	 *
	 * @param file the file
	 * @return boolean
	 */
	public boolean isFileAllowExt(File file) {
		String ext = getExt(file);
		boolean found = false;
		if (ext == null)
			return false;
		else {
			for (int i = 0; i < allowExt.length; i++) {
				if (allowExt[i].equals(ext) == true)
					found = true;
			}
			return found;
		}
	}

	/**
	 * isFileOk checks that the selected file is readable
	 * @param file the file
	 * @return boolean
	 */
	public boolean isFileOk(File file) {
		boolean exist = false;
		exist = (file.exists()&&file.canRead());
		return exist;
	}

	/**
	 * caricaFile loads the selected file's contents into the matching field,only if the extension is correct
	 *
	 * @param file the file
	 * @return true, if successful
	 */
	public boolean caricaFile(File file) {
		boolean isExt = false;
		isExt = isFileAllowExt(file);
		jScrollPane2.setBorder(BorderFactory.createTitledBorder(null, "STRUTTURA DATI: "+file.getName().toString(), TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma",1,11), new java.awt.Color(49,106,196)));

		if (isFileOk(file)) {
			if (isExt) {
				try {
					byte[] buffer = new byte[(int) file.length()];
					BufferedInputStream f = null;
					try {
						f = new BufferedInputStream(new FileInputStream(file));
						f.read(buffer);
					} finally {
						if (f != null) try { f.close(); } catch (IOException ignored) { }
					}
					jTextAreaXML.setText(new String(buffer));
				}catch (IOException e) {
					System.out.println ("Si � verificato un errore: " + e);
				}
				return true;
			}
			else {JOptionPane.showMessageDialog(this, "L'estensione del file selezionato non � corretta (.er).","Errore di caricamento",
					JOptionPane.ERROR_MESSAGE);
			return false;
			}
		}else {JOptionPane.showMessageDialog(this, "Non � stato possibile leggere il file.","Errore di lettura file",
				JOptionPane.ERROR_MESSAGE); 
		return false;
		}
	}  

	public void drop(DropTargetDropEvent dtde) {
		try {
			Transferable tr = dtde.getTransferable();
			DataFlavor[] flavors = tr.getTransferDataFlavors();
			for (int i = 0; i < flavors.length; i++) {
				if (flavors[i].isFlavorJavaFileListType()) {
					dtde.acceptDrop(DnDConstants.ACTION_COPY_OR_MOVE);
					// And add the list of file names to our text area
					java.util.List list = (java.util.List)tr.getTransferData(flavors[i]);
					String filename = "";
					for (int j = 0; j < list.size(); j++) {
						filename += list.get(j);
					}
					this.caricaFile(new File(filename));
					dtde.dropComplete(true);
					return;
				}
				else if (flavors[i].isFlavorSerializedObjectType()) {
					dtde.acceptDrop(DnDConstants.ACTION_COPY_OR_MOVE);
					Object o = tr.getTransferData(flavors[i]);
					jTextAreaXML.setText(o+"");
					dtde.dropComplete(true);
					return;
				}
			}
			dtde.rejectDrop();
		} catch (Exception e) {
			e.printStackTrace();
			dtde.rejectDrop();
		}
	}   

	/**
	 * Salva file.
	 *
	 * @param path the path
	 * @return true, if successful
	 */
	public boolean salvaFile(File path) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(path.getAbsoluteFile()));
			out.write(jTextAreaXML.getText());
			out.flush();
			out.close();
			// conferma salvataggio file
			JOptionPane.showMessageDialog(	this, "Modifiche salvate correttamente");		
		} catch (IOException e)  {
			System.out.println("Exception");
		}
		return false; 
	}    

	public JLabel creaMessaggio (String messaggio){
		erroreLabel = new JLabel();	
		erroreLabel.setText("<html><div style='background-color: white; width: 530px'><table><tr>" +
				"<td align='right' valign='top' width='10'><img width='20' height='20' src='file:icons/Message.png' alt='Icon' /></td>" +
				"<td align='left' valign='top' width='530'><p style='font-weight: 5'>"
				+ messaggio
				+ "</p></td></tr></table></div></html>");
		return erroreLabel;	
	}

	/**
	 * creaMsgSintError Creates the msg sint error.
	 *
	 * @param messaggio the error message
	 * @return the j label
	 */
	public JLabel creaMsgSintError (String messaggio){
		erroreLabel = new JLabel();	
		erroreLabel.setText("<html><div style='background-color: red; width: 390px'><table><tr>" +
				"<td align='right' valign='top' width='10'><img width='20' height='20' src='file:icons/Delete.png' alt='Icon' /></td>" +
				"<td align='left' valign='top' width='390'><p style='font-weight: 5'>"
				+ messaggio
				+ "</p></td></tr></table></div></html>");
		return erroreLabel;	
	}

	/**
	 * creaMsgSemError Creates the semnatic error message
	 *
	 * @param messaggio the error message
	 * @return the j label
	 */
	public JLabel creaMsgSemError (String messaggio){
		erroreLabel.setText("<html><div style='background-color: yellow; width: 390px'><table><tr>" +
				"<td align='right' valign='top' width='10'><img width='20' height='20' src='file:icons/Warning.png' alt='Icon' /></td>" +
				"<td align='left' valign='top' width='390'><p style='font-weight: 5'>"
				+ messaggio
				+ "</p></td></tr></table></div></html>");
		return erroreLabel;	
	}

	/**
	 * GridBagConstraints Set Grid Layout
	 *
	 * @param Grid parameters
	 * @return GridBagConstraints
	 */
	private GridBagConstraints setGridValues(int gridwidth,int gridx, int gridy){
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.gridwidth = gridwidth;	
		c.gridx = gridx;
		c.gridy = gridy;
		return c;		
	}

	/**
	 * GridBagConstraints Set Complete Grid Layout
	 *
	 * @param Grid parameters
	 * @return GridBagConstraints
	 */
	private GridBagConstraints setGridValuesComplete(int gridwidth,int gridx, int gridy, double weighty){
		GridBagConstraints c = new GridBagConstraints();		
		c= setGridValues(gridwidth, gridx, gridy);
		c.weighty=weighty;
		c.anchor=GridBagConstraints.ABOVE_BASELINE;
		return c;		
	}

	
	
	
	
	
	
	
	
	/*
	private void manageSql(SqlExporter sql, boolean connection){
		if (cangetsql){							    
			if (!connection) erroriPanel.add(creaMessaggio("Generato codice SQL"),setGridValues(2,0, riga++));
			JTextArea sqlText = new JTextArea();					    
			sqlText.setWrapStyleWord(true);
			sqlText.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));						
			sqlText.setText(sql.getSQL());
			sqlText.setCaretPosition(0);
			jScrollSQLPane = new JScrollPane(sqlText);		
			jScrollSQLPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
			jScrollSQLPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			pannelloTab.addTab("<html><font color='red'>ESECUZIONE</font></html>", null, jScrollSQLPane, null);	

			if (connection){
				MySqlDB db = new MySqlDB("localhost", "test", "root", "root");
				try {
					if (db.executeFile("codiceSQL.txt"))
					{	
						erroriPanel.add(creaMessaggio("Importato codice in Mysql"),setGridValues(2,0, riga++));
					}else {
						erroriPanel.add(creaMessaggio("Non � possibile importare il codice in Mysql"),setGridValues(2,0, riga++));
					}
				} catch (IOException e1) {
					erroriPanel.add(creaMessaggio("Non � possibile importare il codice in Mysql"),setGridValues(2,0, riga++));		
				}
			} 
		} else {
			if (connection)
				erroriPanel.add(creaMessaggio("Non � possibile importare il codice in Mysql"),setGridValues(2,0, riga++));									
			else
				erroriPanel.add(creaMessaggio("Non � possibile generare codice SQL"),setGridValues(2,0, riga++));
		}
	}

	private void manageSvg(SvgExporter svg, int connection){
		// connection == 0 means no svg exportation required;
		// connection == 1 means pdf exportation of svg required;
		// connection == 2 means jpeg exportationof svg required;
		if (cangetsvg)  {
			if (connection==0) erroriPanel.add(creaMessaggio("Generato grafico SVG"),setGridValues(2,0, riga++));
			try {						
				JSVGCanvas svgC = svg.createSVG();	
				jScrollSVGPane = new JScrollPane(svgC);
				jScrollSVGPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
				if (connection==0) SVGPane.add(jScrollSVGPane);
			} catch (TransformerException e1) {
				e1.printStackTrace();							
			} catch (IOException e1) { 
				e1.printStackTrace();
			} catch (TranscoderException e1) {
				e1.printStackTrace();
			}
			if (connection==1){				
				try {
					svg.SVG2PDF("test.svg", "test.pdf");
					File pdf = new File("test.pdf");
					Desktop.getDesktop().open(pdf);					
					erroriPanel.add(creaMessaggio("Conversione ed apertura in pdf dello schema E-R"),setGridValues(2,0, riga++));
				} catch (TranscoderException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}else if (connection==2){	
				try {
					svg.SVG2JPG("test.svg", "test.jpg");
					File jpg = new File("test.jpg");
					Desktop.getDesktop().open(jpg);
					erroriPanel.add(creaMessaggio("Conversione ed apertura in jpg dello schema E-R"),setGridValues(2,0, riga++));
				} catch (TranscoderException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}		
			} if (connection==0){
				pannelloTab.addTab("<html><font color='red'>DIAGRAMMA E-R</font></html>", null, jScrollSVGPane, null);
				manageExportations (svg);
			}
		} else {
			erroriPanel.add(creaMessaggio("Non � possibile generare codice SVG"),setGridValues(2,0, riga++));
		}	
	}

	
	private void manageExportations (SvgExporter svg){		
		if (esportaPDF.isSelected()){
			try {
				svg.SVG2PDF("test.svg", "test.pdf");
				File pdf = new File("test.pdf");
				Desktop.getDesktop().open(pdf);
			} catch (TranscoderException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		if (esportaJPG.isSelected()){
			try {
				svg.SVG2JPG("test.svg", "test.jpg");
				File jpg = new File("test.jpg");
				Desktop.getDesktop().open(jpg);
			} catch (TranscoderException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
*/
	@Override
	public void dragEnter(DropTargetDragEvent arg0) {
	}

	@Override
	public void dragExit(DropTargetEvent arg0) {	
	}

	@Override
	public void dragOver(DropTargetDragEvent arg0) {		
	}

	@Override
	public void dropActionChanged(DropTargetDragEvent arg0) {
	}  

	@Override
	public void caretUpdate(CaretEvent arg0) {
		int posizione =jTextAreaXML.getCaretPosition();
		try {
			int riga2=jTextAreaXML.getLineOfOffset(posizione)+1;
			int	startLine=jTextAreaXML.getLineStartOffset(riga2-1);
			int colonna=jTextAreaXML.getCaretPosition()- startLine+1;		         
			label2.setText("   "+String.valueOf(riga2)+", "+colonna);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}	
	}
	
}