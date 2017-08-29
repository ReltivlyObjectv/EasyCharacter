package tech.relativelyobjective.easycharacter.characterelements;

import javax.swing.JDialog;
import tech.relativelyobjective.easycharacter.utilities.WindowManager;

/**
 *
 * @author ReltivlyObjectv
 */
class TextElement {
	private String name, body;

	public void editElement() {
		openEditWindow("Edit Generic Element");
	}
	protected void openEditWindow(String title) {
		JDialog editWindow = new JDialog(WindowManager.getMainFrame(), title, true);
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
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
}
