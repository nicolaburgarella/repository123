package main;

import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.event.ActionEvent;
import java.io.File;
import java.lang.String;
import javax.swing.JLabel;
import javax.swing.event.CaretEvent;

// TODO: Auto-generated Javadoc
/**
 * The Class MainGuiTest.
 */
public class MainGuiTest extends junit.framework.TestCase
{
	
	/**
	 * Test action performed.
	 */
	public void testActionPerformed()
	{
		MainGui obj=new main.MainGui();
		String problemMsg="Problem with: actionPerformed";
		ActionEvent e=null;
		obj.actionPerformed(e);
		//Examine the object and assert something appropriate here
	}
	
	/**
	 * Test is file allow ext.
	 */
	public void testIsFileAllowExt()
	{
		MainGui obj=new main.MainGui();
		String problemMsg="Problem with: isFileAllowExt";
		File file=null;
		assertTrue(problemMsg, obj.isFileAllowExt(file));
//		assertFalse(problemMsg, obj.isFileAllowExt(file));
	}
	
	/**
	 * Test is file ok.
	 */
	public void testIsFileOk()
	{
		MainGui obj=new main.MainGui();
		String problemMsg="Problem with: isFileOk";
		File file=null;
		assertTrue(problemMsg, obj.isFileOk(file));
//		assertFalse(problemMsg, obj.isFileOk(file));
	}
	
	/**
	 * Test carica file.
	 */
	public void testCaricaFile()
	{
		MainGui obj=new main.MainGui();
		String problemMsg="Problem with: caricaFile";
		File file=null;
		assertTrue(problemMsg, obj.caricaFile(file));
//		assertFalse(problemMsg, obj.caricaFile(file));
	}
	
	/**
	 * Test drop.
	 */
	public void testDrop()
	{
		MainGui obj=new main.MainGui();
		String problemMsg="Problem with: drop";
		DropTargetDropEvent dtde=null;
		obj.drop(dtde);
		//Examine the object and assert something appropriate here
	}
	
	/**
	 * Test salva file.
	 */
	public void testSalvaFile()
	{
		MainGui obj=new main.MainGui();
		String problemMsg="Problem with: salvaFile";
		File path=null;
		assertTrue(problemMsg, obj.salvaFile(path));
//		assertFalse(problemMsg, obj.salvaFile(path));
	}
	
	/**
	 * Test drag enter.
	 */
	public void testDragEnter()
	{
		MainGui obj=new main.MainGui();
		String problemMsg="Problem with: dragEnter";
		DropTargetDragEvent arg0=null;
		obj.dragEnter(arg0);
		//Examine the object and assert something appropriate here
	}
	
	/**
	 * Test drag exit.
	 */
	public void testDragExit()
	{
		MainGui obj=new main.MainGui();
		String problemMsg="Problem with: dragExit";
		DropTargetEvent arg0=null;
		obj.dragExit(arg0);
		//Examine the object and assert something appropriate here
	}
	
	/**
	 * Test drag over.
	 */
	public void testDragOver()
	{
		MainGui obj=new main.MainGui();
		String problemMsg="Problem with: dragOver";
		DropTargetDragEvent arg0=null;
		obj.dragOver(arg0);
		//Examine the object and assert something appropriate here
	}
	
	/**
	 * Test drop action changed.
	 */
	public void testDropActionChanged()
	{
		MainGui obj=new main.MainGui();
		String problemMsg="Problem with: dropActionChanged";
		DropTargetDragEvent arg0=null;
		obj.dropActionChanged(arg0);
		//Examine the object and assert something appropriate here
	}
	
	/**
	 * Test caret update.
	 */
	public void testCaretUpdate()
	{
		MainGui obj=new main.MainGui();
		String problemMsg="Problem with: caretUpdate";
		CaretEvent arg0=null;
		obj.caretUpdate(arg0);
		//Examine the object and assert something appropriate here
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(new junit.framework.TestSuite(MainGuiTest.class));
	}
}
