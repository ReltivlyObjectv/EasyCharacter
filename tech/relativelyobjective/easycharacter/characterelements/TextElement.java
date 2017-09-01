package tech.relativelyobjective.easycharacter.characterelements;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import tech.relativelyobjective.easycharacter.pieces.FrameMain;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;

/**
 *
 * @author ReltivlyObjectv
 */
class TextElement implements CharacterElement,Comparable {
	protected String name, description;

	public TextElement() {
		name = "";
		description = "";
	}
	public TextElement(String n, String d){
		name = n;
		description = d;
	}
	public void editElement() {
		openEditWindow("Generic Element");
	}
	protected void openEditWindow(String title) {
		FrameMain mainFrame = WindowManager.getMainFrame();
		JDialog editWindow = new JDialog(mainFrame, "Edit "+title, true);
			editWindow.setPreferredSize(new Dimension(325,350));
			editWindow.setSize(editWindow.getPreferredSize());
			editWindow.setMaximumSize(editWindow.getPreferredSize());
			editWindow.setMinimumSize(editWindow.getPreferredSize());
			editWindow.setLayout(new GridBagLayout());
			GridBagConstraints constraints = new GridBagConstraints();
			constraints.gridy = 0;
			constraints.gridx = 0;
			editWindow.add(new JLabel("Name"), constraints);
			JTextField nameBox = new JTextField(20);
			nameBox.setText(name);
			constraints.gridy++;
			editWindow.add(nameBox, constraints);
			constraints.gridy++;
			editWindow.add(new JLabel("Description"), constraints);
			JTextArea descriptionBox = new JTextArea(10, 10);
			descriptionBox.setText(description);
			descriptionBox.setLineWrap(true);
			descriptionBox.setWrapStyleWord(true);
			descriptionBox.setBorder(nameBox.getBorder());
			JScrollPane scroller = new JScrollPane(descriptionBox);
			scroller.setPreferredSize(new Dimension(275,170));
			constraints.gridy++;
			editWindow.add(scroller, constraints);
			JButton saveButton = new JButton("Save "+title);
			constraints.gridy++;
			editWindow.add(saveButton, constraints);
			//Listener
			saveButton.addActionListener((ActionEvent e) -> {
				if (!nameBox.getText().equals("") &&
					!descriptionBox.getText().equals("")
					) {
					name = nameBox.getText();
					description = descriptionBox.getText();
					editWindow.dispose();
				}
			});
		SwingUtilities.invokeLater(() -> {
			editWindow.setVisible(true);
		});
	}
	@Override
	public void edit(boolean viewOnly) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	@Override
	public int compareTo(Object o) {
		return toString().compareTo(o.toString());
	}
	@Override
	public String toString() {
		return name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
