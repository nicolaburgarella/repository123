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
	 * Test drag enter.
	 */
	public void testDragEnter()
	{
		MainGui obj=new main.MainGui();
		String problemMsg="Problem with: dragEnter";
		DropTargetDragEvent arg0=null;
		obj.dragEnter(arg0);
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
